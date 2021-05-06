package fr.simon.webapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Fiche_Frais implements Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name= "visiteur_id")
    private Visiteur visiteur_id;

    @Id
    private int mois;

    private int nbJustificatifs;
    private float montantValide;
    private Date dateModif;


    @ManyToOne
    @JoinColumn(name = "etat_id")
    private Etat etat_id;

    public Fiche_Frais()
    {
        super();
    }


    public Fiche_Frais(Visiteur visiteur_id, int mois, int nbJustificatifs, float montantValide, Date dateModif, Etat etat_id) {
        this.visiteur_id = visiteur_id;
        this.mois = mois;
        this.nbJustificatifs = nbJustificatifs;
        this.montantValide = montantValide;
        this.dateModif = dateModif;
        this.etat_id = etat_id;
    }


    public Visiteur getVisiteur() {
        return this.visiteur_id;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur_id = visiteur;
    }

    public int getMois() {
        return this.mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }


    public Etat getEtat() {
        return this.etat_id;
    }

    public void setEtat(Etat etat) {
        this.etat_id = etat;
    }

    public int getNbJustificatifs() {
        return this.nbJustificatifs;
    }

    public void setNbJustificatifs(int nbJustificatifs) {
        this.nbJustificatifs = nbJustificatifs;
    }

    public float getMontantValide() {
        return this.montantValide;
    }

    public void setMontantValide(float montantValide) {
        this.montantValide = montantValide;
    }

    public Date getDateModif() {
        return this.dateModif;
    }

    public void setDateModif(Date dateModif) {
        this.dateModif = dateModif;
    }


}
