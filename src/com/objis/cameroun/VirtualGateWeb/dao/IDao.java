package com.objis.cameroun.VirtualGateWeb.dao;

import java.util.List;

import com.objis.cameroun.VirtualGateWeb.domaine.Fichier3D;
import com.objis.cameroun.VirtualGateWeb.domaine.Personne;
import com.objis.cameroun.VirtualGateWeb.domaine.Utilisateur;


public interface IDao {

	public int creerCompteDao(Personne personne);
	public int connexionDao(Utilisateur utilisateur);
	public int enregistrerFichier3Dao(Fichier3D fichier3D);
	public Personne getPersonneByNomUtilisateurDao(String nomUtilisateur);
	public List<Fichier3D> getAllGallerieDao(String nomUtilisateur);
	// public List<Fichier3D> getAllFichier3Dao();
}
