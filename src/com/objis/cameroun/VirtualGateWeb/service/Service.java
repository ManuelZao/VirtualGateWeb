package com.objis.cameroun.VirtualGateWeb.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import com.objis.cameroun.VirtualGateWeb.dao.Dao;
import com.objis.cameroun.VirtualGateWeb.dao.IDao;
import com.objis.cameroun.VirtualGateWeb.domaine.Fichier3D;
import com.objis.cameroun.VirtualGateWeb.domaine.Personne;
import com.objis.cameroun.VirtualGateWeb.domaine.Utilisateur;


/**
 * @author BILIM TONYE Emmanuel Roussel
 *
 */

public class Service implements Iservice {
	
	
	// private com.objis.cameroun.VirtualGateWeb.dao.IDao dao;  // 
	private IDao dao;
	


	public Service() {
		this.dao = new Dao();
	}
	
	// Rajouter ce nouveau constructeur
	public Service(EntityManager em) {
		this.dao = new Dao(em);
		
	}

	@Override
	public int creerCompteService(Personne personne) {
		
		return dao.creerCompteDao(personne);
	}
	@Override
	public int connexionService(Utilisateur utilisateur) {
		
		return dao.connexionDao(utilisateur);
		
		
	}
	@Override
	public int enregistrerFichier3DService(Fichier3D fichier3D) {
		
		return dao.enregistrerFichier3Dao(fichier3D);
	}
	
	@Override
	public Personne getPersonneByNomUtilisateurService(String nomUtilisateur) {
		
		return dao.getPersonneByNomUtilisateurDao (nomUtilisateur);
	}
	
	
	@Override
	public List<Fichier3D> getAllGallerieService(String nomUtilisateur) {
		
		return dao.getAllGallerieDao(nomUtilisateur);
	}

}


