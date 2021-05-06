package fr.simon.webapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Frais_Forfait {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String libelle;
    private float montant;

    public Frais_Forfait()
    {
        super();
    }

    public Frais_Forfait(Long id, String libelle, float montant)
    {
        this.id = id;
        this.libelle = libelle;
        this.montant = montant;
    }

    public Long getID(){return id;}
    public String getLibelle(){return libelle;}
    public float getMontant(){return montant;}

    public void setID(Long id){this.id = id;}
    public void setLibelle(String libelle){this.libelle = libelle;}
    public void setMontant(float montant){this.montant = montant;}

}
