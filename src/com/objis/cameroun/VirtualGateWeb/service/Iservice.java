package com.objis.cameroun.VirtualGateWeb.service;

import java.util.List;

import com.objis.cameroun.VirtualGateWeb.domaine.Fichier3D;
import com.objis.cameroun.VirtualGateWeb.domaine.Personne;
import com.objis.cameroun.VirtualGateWeb.domaine.Utilisateur;

/**
 *
 * Interface: contient uniquement des déclarations
 *  de methode à implémenter
 *  
 * @author BILIM TONYE Emmanuel Roussel
 *
 */
public interface Iservice {

	public int creerCompteService(Personne personne);
	public int connexionService(Utilisateur utilisateur);
	public int enregistrerFichier3DService(Fichier3D fichier3D);
	public Personne getPersonneByNomUtilisateurService(String nomUtilisateur);
	public List<Fichier3D> getAllGallerieService(String nomUtilisateur);
	
	
}
