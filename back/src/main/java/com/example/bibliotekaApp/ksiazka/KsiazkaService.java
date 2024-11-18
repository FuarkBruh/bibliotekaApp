package com.example.bibliotekaApp.ksiazka;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KsiazkaService {

    private final KsiazkaRepository ksiazkaRepository;

    @Autowired
    public KsiazkaService(KsiazkaRepository ksiazkaRepository) {
        this.ksiazkaRepository = ksiazkaRepository;
    }

    /*Tutaj poniżej można dodać metody, które będą implementować całą logikę biznesową,
    czyli wszystkie metody, które będą potrzebne do działania na bazie danych. Korzystamy
    z repozytoriów (interfejsów obiektów roszerzających JpaRepository). To nam zepewnia, że teraz
    pisząc metody dla tej klasy Service, mamy dostęp do wszystkich zapisanych metod, które Spring,
    będzie sobie automatycznie zamieniał na kod SQL*/

    //Metody potrzebne do działania na bazie (dodaj poniżej)
    public Ksiazka findKsiazkaById(int id) {
        return ksiazkaRepository.findById(id).orElse(null);
    }

    /*
    public List<Ksiazka> findAllKsiazkaByBiblioteka(int biblioteka) {
        return ksiazkaRepository.findByBiblioteka(biblioteka);
    }
    */

    public List<Ksiazka> findKsiazkaByTytul(String tytul) {
        return ksiazkaRepository.findByTytul(tytul);
    }

    public List<Ksiazka> findKsiazkaByAutor(String autor) {
        return ksiazkaRepository.findByAutor(autor);
    }

    /*
    public List<Ksiazka> findKsiazkaByWydawnictwo(String wydawnictwo) {
        return ksiazkaRepository.findByWydawnictwo(wydawnictwo);
    }
    */

    @Transactional
    public Ksiazka saveKsiazka(Ksiazka ksiazka) {
        return ksiazkaRepository.save(ksiazka);
    }

    @Transactional
    public Ksiazka updateKsiazka(Ksiazka ksiazka) {
        return ksiazkaRepository.save(ksiazka);
    }

    @Transactional
    public void deleteKsiazka(Ksiazka ksiazka) {
        ksiazkaRepository.delete(ksiazka);
    }
}
