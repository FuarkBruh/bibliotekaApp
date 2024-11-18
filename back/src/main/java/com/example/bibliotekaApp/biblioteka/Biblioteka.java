package com.example.bibliotekaApp.biblioteka;

import jakarta.persistence.*;

@Entity
@Table(name = "biblioteka")
public class Biblioteka {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column
    private int id;
    @Column(name = "patron")
    private String patron;
    @Column(name = "ulica")
    private String ulica;
    @Column(name = "numerBudynku")
    private String numerBudynku;
    @Column(name = "numerLokalu")
    private String numerLokalu;
    @Column(name = "miasto")
    private String miasto;
    @Column(name = "kodPocztowy")
    private String kodPocztowy;

    public int getDyrektor() {
        return dyrektor;
    }

    public void setDyrektor(int dyrektor) {
        this.dyrektor = dyrektor;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getNumerLokalu() {
        return numerLokalu;
    }

    public void setNumerLokalu(String numerLokalu) {
        this.numerLokalu = numerLokalu;
    }

    public String getNumerBudynku() {
        return numerBudynku;
    }

    public void setNumerBudynku(String numerBudynku) {
        this.numerBudynku = numerBudynku;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "dyrektor")
    private int dyrektor;
}
