package com.laposte.ares.ares;

/**
 * Created by PECH652 on 19/04/2018.
 */

public class CardAudit {

    private String id;
    private String projet;
    private String nom;

    public CardAudit (String id, String projet, String nom){
        this.id = id;
        this.projet = projet;
        this.nom = nom;
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

}
