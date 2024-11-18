package com.example.bibliotekaApp.zamowienie;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "zamowienie")
public class Zamowienie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "idKsiazka")
    private int idKsiazka;
    @Column(name = "idCzytelnik")
    private int idCzytelnik;
    @Column(name = "idBiblioteka")
    private int idBiblioteka;
    @Column(name = "dataZamowienia")
    private Date dataZamowienia;
    @Column(name = "czyZrealizowano")
    private boolean czyZrealizowano;
}
