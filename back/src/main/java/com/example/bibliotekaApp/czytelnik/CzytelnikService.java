package com.example.bibliotekaApp.czytelnik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CzytelnikService {
    private final CzytelnikRepository czytelnikRepository;

    @Autowired
    public CzytelnikService(CzytelnikRepository czytelnikRepository) {
        this.czytelnikRepository = czytelnikRepository;
    }

    //Metody potrzebne do działania na bazie (dodaj poniżej, wytłumaczenie w KsiazkaService)
}
