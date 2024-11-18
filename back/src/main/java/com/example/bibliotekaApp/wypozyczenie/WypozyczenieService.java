package com.example.bibliotekaApp.wypozyczenie;

import org.springframework.stereotype.Service;

@Service
public class WypozyczenieService {
    private final WypozyczenieRepository wypozyczenieRepository;

    WypozyczenieService(WypozyczenieRepository wypozyczenieRepository) {
        this.wypozyczenieRepository = wypozyczenieRepository;
    }

    //Metody potrzebne do działania na bazie (dodaj poniżej, wytłumaczenie w KsiazkaService)


}
