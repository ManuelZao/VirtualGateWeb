package com.objis.cameroun.VirtualGateWeb.presentation;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.objis.cameroun.VirtualGateWeb.domaine.Fichier3D;
import com.objis.cameroun.VirtualGateWeb.domaine.Personne;
import com.objis.cameroun.VirtualGateWeb.service.Iservice;
import com.objis.cameroun.VirtualGateWeb.service.Service;

/**
 * Servlet implementation class CreerCompteServlet
 */
@WebServlet("/CreerCompteServlet")
public class CreerCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerCompteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// déclaration de variables qui vont contenir les valeurs saisies par l'utilisateur
		
				int idPersonne;
				String nom;
				String prenom;
				String email;
				String nomUtilisateur;
				String motDePasse;			
				Fichier3D fichier3D;
				
				// Récup des variables saisies par l'utilisateur
				
			//	idPersonne = Integer.parseInt(request.getParameter("idPersonne"));
				nom = request.getParameter("nom");
				prenom = request.getParameter("prenom");
				email = request.getParameter("email");
				nomUtilisateur = request.getParameter("nomUtilisateur");
				motDePasse = request.getParameter("motDePasse");
			//	fichier3D = request.getParameter("fichier3D"); Doit on emettre une requête pour ca? Si oui quel est la bonne requête
				
				
				Personne personne = new Personne();
				// Initialisation des attributs de lobjet personne
				
				personne.setNom(nom);
				personne.setPrenom(prenom);
				personne.setEmail(email);
				personne.setNomUtilisateur(nomUtilisateur);
				personne.setMotDePasse(motDePasse);
			//	personne.setFichier3D(fichier3d);  ???????

				
				
				
				
		// enregistrement de l'objet Personne dans la base de données
				
				// Obtain a database connection:
		        EntityManagerFactory emf =
		           (EntityManagerFactory)getServletContext().getAttribute("emf");
		        EntityManager em = emf.createEntityManager();
				
				Iservice service = new Service(em);
				service.creerCompteService(personne);
				
				
				request.getRequestDispatcher("/GallerieServlet").forward(request, response);
	//			request.getRequestDispatcher("/ListEleveServlet").forward(request, response);
	}

}
