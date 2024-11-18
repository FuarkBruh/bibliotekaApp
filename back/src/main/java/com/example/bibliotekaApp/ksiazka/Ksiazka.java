package com.example.bibliotekaApp.ksiazka;

import jakarta.persistence.*;

@Entity
@Table(name = "ksiazka")
public class Ksiazka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "idBiblioteki")
    private int idBiblioteki;
    @Column(name = "tytul")
    private String tytul;
    @Column(name = "autor")
    private String autor;
    @Column(name = "wydawnictwo")
    private String wydawnictwo;

    //Gettery
    public int getId() {
        return id;
    }
    public int getIdBiblioteki() {
        return idBiblioteki;
    }
    public String getTytul() {
        return tytul;
    }
    public String getAutor() {
        return autor;
    }
    public String getWydawnictwo() {
        return wydawnictwo;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Settery
    public void setIdBiblioteki(int idBiblioteki) {}
    public void setTytul(String tytul) {}
    public void setAutor(String autor) {}
    public void setWydawnictwo(String wydawnictwo) {}

}
