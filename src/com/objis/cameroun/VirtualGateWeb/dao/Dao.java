package com.objis.cameroun.VirtualGateWeb.dao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import com.objis.cameroun.VirtualGateWeb.dao.ConnectionMYSQL;
import com.objis.cameroun.VirtualGateWeb.dao.GenerateManagerEntity;
import com.objis.cameroun.VirtualGateWeb.domaine.Fichier3D;
import com.objis.cameroun.VirtualGateWeb.domaine.Personne;
import com.objis.cameroun.VirtualGateWeb.domaine.Utilisateur;
import com.objis.cameroun.VirtualGateWeb.presentation.ConnexionServlet;


public class Dao implements IDao {
	
	
private EntityManager em;
	

	public Dao(EntityManager em) {
		super();
		this.em = em;
	}

	public Dao() {
		super();
		
	}
	
	//Création d'un objet 'sc' de type Scanner.
	 Scanner sc = new Scanner(System.in);
	Personne personne = new Personne ();
	public Utilisateur utilisateur = new Utilisateur ();
	Fichier3D fichier3D = new Fichier3D () ;

	/* Méthode qui permet de créer un compte utilisateur
	 * @see com.objis.cameroun.VirtualGate.service.Iservice#créerCompte()
	 */
	public int creerCompteDao(Personne personne) {
		
		
		try {

			// 1 : Obtention d'un EntityManager
			
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
						
			// 2 : Ouverture transaction 
		EntityTransaction tx = em.getTransaction();
		tx.begin();
						
			// 3 : Persistence objet creation
			em.persist(personne);
						
						
			// 4 : Fermeture transaction 
			tx.commit();		
			
			
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (Exception e) {
			e.printStackTrace();
			
			return 0;
		} 
		
		return 1;
	
	}

	
	/* Méthode qui permet de se connecter à son compte utilisateur
	 * @see com.objis.cameroun.VirtualGate.service.Iservice#connexion()
	 */
	public int connexionDao(Utilisateur utilisateur) {
		
		 //création d'une collection d'eleves
		List<Personne> personnes = new ArrayList<Personne>();
		
		try {
			// 1 : Obtention d'un EntityManager
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
			
			// 2 : Ouverture transaction 
			EntityTransaction tx = em.getTransaction();
					tx.begin();
					
			// 3 : Obtention des info utilisateur
					
			String u = utilisateur.getNomUtilisateur();
			String p = utilisateur.getMotDePasse();
			
					
				
			personnes = em.createQuery("from Personne e where e.nomUtilisateur = :nu and e.motDePasse = :mp", Personne.class) //permet de trouver des info specifique
								.setParameter("nu", u)
								.setParameter("mp", p)
								.getResultList();	
				

			// 4 : Fermeture transaction 
				tx.commit();
				
				
			if (personnes.size() == 1) {
				return 1;
				
			}else {
				return 0;
				}
				
			
			// Etape 5 : gestion des exceptions 
		} catch (Exception e) {
			e.printStackTrace();
			
			return 0;
				
		}
		
	} 
		
	
	

	
	/* Méthode qui permet d'enregistrer un fichier 3D
	 * @see com.objis.cameroun.VirtualGate.service.Iservice#enregistrerFichier3D()
	 */
	public int enregistrerFichier3Dao(Fichier3D fichier3D) {
		
		try {
			
		// 1 : Obtention d'un EntityManager
			
		EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
						
		// 2 : Ouverture transaction 
		EntityTransaction tx = em.getTransaction();
				tx.begin();
						
		// 3 : Persistence objet creation
				em.persist(fichier3D);
						
		// 4 : Fermeture transaction 
			tx.commit();	

			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
			 
		} catch (Exception e) {
			e.printStackTrace();
			
			return 0;
		} 
		
		return 1;
			
		}
	
	
	
	/*
	 * Méthode rechercher l'utilisateur connecté
	 * @see com.objis.cameroun.VirtualGateWeb.dao.IDao#rechercherUtilisateur()
	 */


					public Personne getPersonneByNomUtilisateurDao (String nomUtilisateur) {
						
						
						try {

							
							// 1 : Obtention d'un EntityManager
							
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
										
							// 2 : Ouverture transaction 
			EntityTransaction tx = em.getTransaction();
						tx.begin();
										
							// 3 : Persistence objet creation
					// em.createQuery("from Eleve", Eleve.class).getResultList();	
			List<Personne> personnes = new ArrayList<Personne>();

								
			personnes = em.createQuery("from Personne p where p.nomUtilisateur = :nom", Personne.class) 
						.setParameter("nom", nomUtilisateur)
						.getResultList();		
											
										
				// 4 : Fermeture transaction 
						tx.commit();		
							
							if (personnes.size() == 1) {
								return personnes.get(0);
							}else {
								
								return null;
							}
							
							// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
						} catch (Exception e) {
							e.printStackTrace();
							
							return null;
					} 				
			}	
	
	
	
	/*
	 * Méthode qui affiche les images dans une gallerie
	 * @see com.objis.cameroun.VirtualGateWeb.dao.IDao#getAllGallerieDao()
	 */
	
	public List<Fichier3D> getAllGallerieDao(String nomUtilisateur){
		   //création d'une collection de fichiers
		
	List<Fichier3D> gallerie= new ArrayList<Fichier3D>();
			
		try {
					
			// 1 : Obtention d'un EntityManager
					
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();
								
			// 2 : Ouverture transaction 
			EntityTransaction tx =  em.getTransaction();
				tx.begin();
								
			// 3 : Obtention de la liste des fichiers via EntityManager			
//			gallerie = em.createQuery("from Fichier3D", Fichier3D.class).getResultList();
			
			gallerie = em.createQuery("from Fichier3D f where f.personne = :nom", Fichier3D.class) 
						.setParameter("nom", this.getPersonneByNomUtilisateurDao(null))
						.getResultList();	
				
								
			// 4 : Fermeture transaction 
				 tx.commit();
								 
				} catch (Exception e) {
					e.printStackTrace();	
			} 
			
				return gallerie;
				
	}




			
}			
	

