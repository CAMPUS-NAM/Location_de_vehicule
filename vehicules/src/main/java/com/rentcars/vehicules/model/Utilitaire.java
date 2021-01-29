package com.rentcars.vehicules.model;


import javax.persistence.*;

@Entity
@Table(schema = "vehicules", name = "utilitaire")


public class Utilitaire {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_immatriculation")
    private String id_immatriculation;

    @Column(name = "marque")
    private String marque;

    @Column(name = "modele")
    private String modele;

    @Column(name = "couleur")
    private String couleur;

    @Column(name = "chevaux_fiscaux")
    private int  chevauxFiscaux;

    @Column(name = "prix_reservation")
    private float prixReservation;

    @Column(name = "prix_kilometrique")
    private float prixKilometrique;

    @Column(name = "volume_chargement")
    private int volumeChargement;
//    private boolean dispo;

    public Utilitaire() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilitaire(String id_immatriculation, String marque, String modele, String couleur, int chevauxFiscaux, float prixReservation, float prixKilometrique, int volumeChargement) {
        this.id_immatriculation = id_immatriculation;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.chevauxFiscaux = chevauxFiscaux;
        this.prixReservation = prixReservation;
        this.prixKilometrique = prixKilometrique;
        this.volumeChargement = volumeChargement;
    }

    public String getId_immatriculation() {
        return id_immatriculation;
    }

    public void setId_immatriculation(String id_immatriculation) {
        this.id_immatriculation = id_immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getChevauxFiscaux() {
        return chevauxFiscaux;
    }

    public void setChevauxFiscaux(int chevauxFiscaux) {
        this.chevauxFiscaux = chevauxFiscaux;
    }

    public float getPrixReservation() {
        return prixReservation;
    }

    public void setPrixReservation(float prixReservation) {
        this.prixReservation = prixReservation;
    }

    public float getPrixKilometrique() {
        return prixKilometrique;
    }


    public void setPrixKilometrique(float prixKilometrique) {
        this.prixKilometrique = prixKilometrique;
    }

    public int getVolumeChargement() {
        return volumeChargement;
    }

    public void setVolumeChargement(int volumeChargement) {
        this.volumeChargement = volumeChargement;
    }
//
//    public boolean isDispo() {
//        return dispo;
//    }
//
//    public void setDispo(boolean dispo) {
//        this.dispo = dispo;
//    }

    @Override
    public String toString() {
        return "Utilitaire{" +
                "id_immatriculation='" + id_immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", chevauxFiscaux=" + chevauxFiscaux +
                ", prixReservation=" + prixReservation +
                ", prixKilometrique=" + prixKilometrique +
                ", volumeChargement=" + volumeChargement +
                '}';
    }
}
