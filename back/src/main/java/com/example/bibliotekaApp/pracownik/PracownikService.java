package com.example.bibliotekaApp.pracownik;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracownikService {
    private final PracownikRepository pracownikRepository;

    @Autowired
    PracownikService(PracownikRepository pracownikRepository) {
        this.pracownikRepository = pracownikRepository;
    }

    //Metody potrzebne do działania na bazie (dodaj poniżej, wytłumaczenie w KsiazkaService)

    public Pracownik findPracownikById(int id) {
        return pracownikRepository.findById(id).orElse(null);
    }

    public Pracownik findPracownikByNazwisko(String nazwisko){
        return pracownikRepository.findByNazwisko(nazwisko);
    }

    public Pracownik findPracownikByStanowisko(String stanowisko){
        return pracownikRepository.findByStanowisko(stanowisko);
    }

    public List<Pracownik> findAllPracownik() {
        return pracownikRepository.findAll();
    }

    @Transactional
    public Pracownik save(Pracownik pracownik) {
        return pracownikRepository.save(pracownik);
    }

    @Transactional
    public Pracownik update(Pracownik pracownik) {
        return pracownikRepository.save(pracownik);
    }

    @Transactional
    public void delete(Pracownik pracownik) {
        pracownikRepository.delete(pracownik);
    }
}
