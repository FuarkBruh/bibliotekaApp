package com.example.bibliotekaApp.ksiazka;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KsiazkaRepository extends JpaRepository<Ksiazka, Integer> {
    List<Ksiazka> findByTytul(String tytul);

    List<Ksiazka> findByBiblioteka(int biblioteka);

    List<Ksiazka> findByAutor(String autor);

    List<Ksiazka> findByWydawnictwo(String wydawnictwo);
}
