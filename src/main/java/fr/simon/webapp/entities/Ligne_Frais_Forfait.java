package fr.simon.webapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ligne_Frais_Forfait implements Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name = "visiteur_id")
    private Visiteur visiteur_id;

    @Id
    private int mois;

    @Id
    @JoinColumn(name = "Frais_Forfait_id")
    @ManyToOne
    private Frais_Forfait frais_Forfait_id;

    private int quantite;

    public Ligne_Frais_Forfait()
    {
        super();
    }

    public Ligne_Frais_Forfait(Visiteur visiteur_id, int mois, Frais_Forfait frais_Forfait_id, int quantite) {
        this.visiteur_id = visiteur_id;
        this.mois = mois;
        this.frais_Forfait_id = frais_Forfait_id;
        this.quantite = quantite;
    }


    public Visiteur getVisiteur_id() {
        return this.visiteur_id;
    }

    public void setVisiteur_id(Visiteur visiteur_id) {
        this.visiteur_id = visiteur_id;
    }

    public int getMois() {
        return this.mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public Frais_Forfait getFrais_Forfait_id() {
        return this.frais_Forfait_id;
    }

    public void setFrais_Forfait_id(Frais_Forfait frais_Forfait_id) {
        this.frais_Forfait_id = frais_Forfait_id;
    }

    public int getQuantite() {
        return this.quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
}
