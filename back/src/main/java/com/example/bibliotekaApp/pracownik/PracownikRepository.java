package com.example.bibliotekaApp.pracownik;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PracownikRepository extends JpaRepository<Pracownik, Integer> {

    Pracownik findByNazwisko(String nazwisko);

    Pracownik findByStanowisko(String stanowisko);
}
