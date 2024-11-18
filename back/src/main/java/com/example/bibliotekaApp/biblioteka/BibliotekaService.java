package com.example.bibliotekaApp.biblioteka;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliotekaService {
    private final BibliotekaRepository bibliotekaRepository;

    @Autowired
    BibliotekaService(BibliotekaRepository bibliotekaRepository) {
        this.bibliotekaRepository = bibliotekaRepository;
    }

    //Metody potrzebne do działania na bazie (dodaj poniżej, wytłumaczenie w bibliotekaService)
    public Biblioteka findBibliotekaById(int id) {
        return bibliotekaRepository.findById(id).orElse(null);
    }

    @Transactional
    public Biblioteka saveBiblioteka(Biblioteka biblioteka) {
        return bibliotekaRepository.save(biblioteka);
    }

    @Transactional
    public Biblioteka updateBiblioteka(Biblioteka biblioteka) {
        return bibliotekaRepository.save(biblioteka);
    }

    @Transactional
    public void deleteBiblioteka(Biblioteka biblioteka) {
        bibliotekaRepository.delete(biblioteka);
    }
}
