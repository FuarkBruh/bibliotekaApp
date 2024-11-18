package com.example.bibliotekaApp.pracownik;

import jakarta.persistence.*;

@Entity
@Table(name = "pracownik")
public class Pracownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "stanowisko")
    private String stanowisko;
}
