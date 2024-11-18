package com.example.bibliotekaApp.zamowienie;

import org.springframework.stereotype.Service;

@Service
public class ZamowienieService {
    private final ZamowienieRepository zamowienieRepository;

    ZamowienieService(ZamowienieRepository zamowienieRepository) {
        this.zamowienieRepository = zamowienieRepository;
    }

    //Metody potrzebne do działania na bazie (dodaj poniżej, wytłumaczenie w KsiazkaService)
}
