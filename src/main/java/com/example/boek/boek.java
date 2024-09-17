package com.example.boek;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class boek {

    @Column
    private String titel;
    private String auteur;
    private int aantalExemplaren;
    private String afbeeldingURL;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAfbeeldingURL() {
        return afbeeldingURL;
    }

    public void setAfbeeldingURL(String afbeeldingURL) {
        this.afbeeldingURL = afbeeldingURL;
    }

    public int getAantalExemplaren() {
        return aantalExemplaren;
    }

    public void setAantalExemplaren(int aantalExemplaren) {
        this.aantalExemplaren = aantalExemplaren;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}