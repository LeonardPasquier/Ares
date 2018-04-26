package com.laposte.ares.ares;

/**
 * Created by PECH652 on 19/04/2018.
 */

public class CardAudit {

    private String id;
    private String projet;
    private String nom;
    private String statut;
    private String date_debut;
    private String date_fin;
    private int vuln_forte;
    private int vuln_moyenne;
    private int vuln_faible;

    public CardAudit (String id, String projet, String nom, String statut, String date_debut, String date_fin, int vuln_faible, int vuln_moyenne, int vuln_forte){
        this.id = id;
        this.projet = projet;
        this.nom = nom;
        this.statut=statut;
        this.date_debut=date_debut;
        this.date_fin=date_fin;
        this.vuln_faible=vuln_faible;
        this.vuln_moyenne=vuln_moyenne;
        this.vuln_forte=vuln_forte;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjet() {
        return projet;
    }

    public void setProjet(String projet) {
        this.projet = projet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public int getVuln_forte() {
        return vuln_forte;
    }

    public void setVuln_forte(int vuln_forte) {
        this.vuln_forte = vuln_forte;
    }

    public int getVuln_moyenne() {
        return vuln_moyenne;
    }

    public void setVuln_moyenne(int vuln_moyenne) {
        this.vuln_moyenne = vuln_moyenne;
    }

    public int getVuln_faible() {
        return vuln_faible;
    }

    public void setVuln_faible(int vuln_faible) {
        this.vuln_faible = vuln_faible;
    }
}
