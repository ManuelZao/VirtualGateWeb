package com.objis.cameroun.VirtualGateWeb.domaine;
import java.sql.Blob;
import java.util.Date;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




/**
 * Cration d'une classe fichier3D qui comporte les differentes methodes 
 * necessaires a la gestion de ses fichiers 3D
 * 
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
@Entity
public class Fichier3D {								
	/*
	 *  Propriétés
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected int idFichier;
	protected String fichier;
	protected String description;
	protected String categorie;
	protected String auteur;
	protected String typeAcces;
	private Blob image;
	private String photo;
	

	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateDeCreation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	protected Personne personne;
	
	
	//Getters  Setters

	public int getIdFichier() {
		return idFichier;
	}

	public void setIdFichier(int idFichier) {
		this.idFichier = idFichier;
	}

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTypeAcces() {
		return typeAcces;
	}

	public void setTypeAcces(String typeAcces) {
		this.typeAcces = typeAcces;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
	
	// Constructeurs
	
	public Fichier3D() {
		super();
	}

	

	public Fichier3D(int idFichier) {
		super();
		this.idFichier = idFichier;
	}

	public Fichier3D(int idFichier, String fichier) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
	}

	public Fichier3D(int idFichier, String fichier, String description) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
		this.description = description;
	}

	public Fichier3D(int idFichier, String fichier, String description, String categorie) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
		this.description = description;
		this.categorie = categorie;
	}

	public Fichier3D(int idFichier, String fichier, String description, String categorie, String auteur) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
		this.description = description;
		this.categorie = categorie;
		this.auteur = auteur;
	}

	public Fichier3D(int idFichier, String fichier, String description, String categorie, String auteur,
			String typeAcces) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
		this.description = description;
		this.categorie = categorie;
		this.auteur = auteur;
		this.typeAcces = typeAcces;
	}

	public Fichier3D(int idFichier, String fichier, String description, String categorie, String auteur,
			String typeAcces, Blob image) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
		this.description = description;
		this.categorie = categorie;
		this.auteur = auteur;
		this.typeAcces = typeAcces;
		this.image = image;
	}

	public Fichier3D(int idFichier, String fichier, String description, String categorie, String auteur,
			String typeAcces, Blob image, String photo) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
		this.description = description;
		this.categorie = categorie;
		this.auteur = auteur;
		this.typeAcces = typeAcces;
		this.image = image;
		this.photo = photo;
	}

	public Fichier3D(int idFichier, String fichier, String description, String categorie, String auteur,
			String typeAcces, Blob image, String photo, Date dateDeCreation) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
		this.description = description;
		this.categorie = categorie;
		this.auteur = auteur;
		this.typeAcces = typeAcces;
		this.image = image;
		this.photo = photo;
		this.dateDeCreation = dateDeCreation;
	}

	public Fichier3D(int idFichier, String fichier, String description, String categorie, String auteur,
			String typeAcces, Blob image, String photo, Date dateDeCreation, Personne personne) {
		super();
		this.idFichier = idFichier;
		this.fichier = fichier;
		this.description = description;
		this.categorie = categorie;
		this.auteur = auteur;
		this.typeAcces = typeAcces;
		this.image = image;
		this.photo = photo;
		this.dateDeCreation = dateDeCreation;
		this.personne = personne;
	}

	
	// Méthode toString
	
	@Override
	public String toString() {
		return "Fichier3D [idFichier=" + idFichier + ", fichier=" + fichier + ", description=" + description
				+ ", categorie=" + categorie + ", auteur=" + auteur + ", typeAcces=" + typeAcces + ", image=" + image
				+ ", photo=" + photo + ", dateDeCreation=" + dateDeCreation + ", personne=" + personne + "]";
	}
		
	
	
	
	
	
	

	
	


	

	
	
	
	
}