package com.objis.cameroun.VirtualGateWeb.presentation;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.objis.cameroun.VirtualGateWeb.dao.Dao;
import com.objis.cameroun.VirtualGateWeb.domaine.Fichier3D;
import com.objis.cameroun.VirtualGateWeb.service.Iservice;
import com.objis.cameroun.VirtualGateWeb.service.Service;

/**
 * Servlet implementation class GallerieServlet
 */
@WebServlet("/GallerieServlet")
public class GallerieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GallerieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// recuperation de la liste de élève
		
				// Obtain a database connection:
		        EntityManagerFactory emf =
		           (EntityManagerFactory)getServletContext().getAttribute("emf");
		        EntityManager em = emf.createEntityManager();
				
				Iservice service = new Service(em);
				Dao dao = new Dao();
				String nomUtilisateur = dao.utilisateur.getNomUtilisateur();
				  List<Fichier3D> gallerie;
				   gallerie = service.getAllGallerieService(nomUtilisateur);
				   
				   // enregistrement de la liste dans la session
				   HttpSession session=request.getSession();
				   session.setAttribute("gallerie", gallerie);
				   request.getRequestDispatcher("gallerie.jsp").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
