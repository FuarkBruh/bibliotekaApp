package com.example.bibliotekaApp.wypozyczenie;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "wypozyczenie")
public class Wypozyczenie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "od")
    private Date od;
    @Column(name = "do")
    private Date do_;
    @Column(name = "czyPrzedluzano")
    private boolean czyPrzedluzano;
    @Column(name = "idCzytelnika")
    private int idCzytelnika;
    @Column(name = "idKsiazki")
    private int idKsiazki;

    public int getIdKsiazki() {
        return idKsiazki;
    }

    public void setIdKsiazki(int idKsiazki) {
        this.idKsiazki = idKsiazki;
    }

    public int getIdCzytelnika() {
        return idCzytelnika;
    }

    public void setIdCzytelnika(int idCzytelnika) {
        this.idCzytelnika = idCzytelnika;
    }

    public boolean isCzyPrzedluzano() {
        return czyPrzedluzano;
    }

    public void setCzyPrzedluzano(boolean czyPrzedluzano) {
        this.czyPrzedluzano = czyPrzedluzano;
    }

    public Date getDo_() {
        return do_;
    }

    public void setDo_(Date do_) {
        this.do_ = do_;
    }

    public Date getOd() {
        return od;
    }

    public void setOd(Date od) {
        this.od = od;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
