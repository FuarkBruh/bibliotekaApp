-- This script was generated by the ERD tool in pgAdmin 4.
-- Please log an issue at https://github.com/pgadmin-org/pgadmin4/issues/new/choose if you find any bugs, including reproduction steps.
BEGIN;

CREATE SCHEMA IF NOT EXISTS "bibliotekaSchema";

END;

BEGIN;

CREATE TABLE IF NOT EXISTS "bibliotekaSchema".ksiazka
(
    id integer NOT NULL,
    "idBiblioteki" integer,
    tytul text NOT NULL,
    autor text,
    wydawnictwo text,
    PRIMARY KEY (id)
);

COMMENT ON TABLE "bibliotekaSchema".ksiazka
    IS 'Opis fizyczny książki i nadanie jej unikalnego indeksu';

CREATE TABLE IF NOT EXISTS "bibliotekaSchema".biblioteka
(
    id integer NOT NULL,
    patron text,
    ulica text,
    "numerBudynku" text NOT NULL,
    "numerLokalu" text,
    miasto text NOT NULL,
    "kodPocztowy" text NOT NULL,
    dyrektor integer,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS "bibliotekaSchema".pracownik
(
    id integer NOT NULL,
    imie text NOT NULL,
    nazwisko text NOT NULL,
    stanowisko text DEFAULT 'brak',
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS "bibliotekaSchema".czytelnik
(
    id integer NOT NULL,
    imie text NOT NULL,
    nazwisko text NOT NULL,
    ulica text,
    "numerBudynku" text NOT NULL,
    "numerLokalu" text,
    miasto text NOT NULL,
    "kodPocztowy" text NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS "bibliotekaSchema".wypozyczenie
(
    id integer NOT NULL,
    od date NOT NULL,
    "do" date NOT NULL,
    "czyPrzedluzano" boolean NOT NULL DEFAULT false,
    "idCzytelnika" integer NOT NULL,
    "idKsiazki" integer NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS "bibliotekaSchema".zamowienie
(
    id integer NOT NULL,
    "idKsiazka" integer NOT NULL,
    "idCzytelnik" integer NOT NULL,
    "idBiblioteka" integer NOT NULL,
    "dataZamowienia" date NOT NULL,
    "czyZrealizowano" boolean NOT NULL DEFAULT false,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS "bibliotekaSchema".ksiazka
    ADD CONSTRAINT "idBiblioteki" FOREIGN KEY ("idBiblioteki")
        REFERENCES "bibliotekaSchema".biblioteka (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID;

COMMENT ON CONSTRAINT "idBiblioteki" ON "bibliotekaSchema".ksiazka
    IS 'Lokalizacja książki';



ALTER TABLE IF EXISTS "bibliotekaSchema".biblioteka
    ADD CONSTRAINT "idDyrektor" FOREIGN KEY (dyrektor)
        REFERENCES "bibliotekaSchema".pracownik (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID;

COMMENT ON CONSTRAINT "idDyrektor" ON "bibliotekaSchema".biblioteka
    IS 'ID dyrektora danej biblioteki';



ALTER TABLE IF EXISTS "bibliotekaSchema".wypozyczenie
    ADD CONSTRAINT "idCztelnika" FOREIGN KEY ("idCzytelnika")
        REFERENCES "bibliotekaSchema".czytelnik (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID;


ALTER TABLE IF EXISTS "bibliotekaSchema".zamowienie
    ADD CONSTRAINT "idCzytelnika" FOREIGN KEY ("idCzytelnik")
        REFERENCES "bibliotekaSchema".czytelnik (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID;


ALTER TABLE IF EXISTS "bibliotekaSchema".zamowienie
    ADD CONSTRAINT "idBiblioteka" FOREIGN KEY ("idBiblioteka")
        REFERENCES "bibliotekaSchema".biblioteka (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID;

END;