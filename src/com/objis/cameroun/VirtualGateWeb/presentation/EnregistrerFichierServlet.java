package com.objis.cameroun.VirtualGateWeb.presentation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import com.objis.cameroun.VirtualGateWeb.domaine.Fichier3D;
import com.objis.cameroun.VirtualGateWeb.domaine.Personne;
import com.objis.cameroun.VirtualGateWeb.service.Iservice;
import com.objis.cameroun.VirtualGateWeb.service.Service;

/**
 * Servlet implementation class EnregistrerFichierServlet
 */
@WebServlet("/EnregistrerFichierServlet")
@MultipartConfig
public class EnregistrerFichierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public EnregistrerFichierServlet() {
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
		
		int idFichier;
		String fichier;
		String description;
		String categorie;
		String auteur;
		String typeAcces;
		Blob image = null;
		String photo;
		Date dateDeCreation;
		Personne personne;
		
		// Récup des variables saisies par l'utilisateur
		
		
		
		 InputStream inputStream = null;
		 Part filePart = request.getPart("image");
         if (filePart != null) 
         { 
             inputStream = filePart.getInputStream();
         }
		
         //System.out.println(inputStream);
         byte[] contents;
         ByteArrayOutputStream output = new ByteArrayOutputStream();
         byte[] buffer = new byte[1024];
         int count;
         while ((count = inputStream.read(buffer)) != -1)
         {
         	output.write(buffer, 0, count);
         }
     
         contents = output.toByteArray();
         Blob blob = null;
         try 
         {
         	blob = new SerialBlob(contents);
         } 
         catch (SerialException e) {e.printStackTrace();}
         catch (SQLException e) {e.printStackTrace();}
         
		try 
		{            
			fichier = request.getParameter("fichier");
		description = request.getParameter("description");
		categorie = request.getParameter("categorie");
		auteur = request.getParameter("auteur");
		typeAcces = request.getParameter("typeAcces");
			
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace();       
		}  
		 

		
		
	
	//	idFichier = Integer.parseInt(request.getParameter("idFichier"));
		fichier = request.getParameter("fichier");
		description = request.getParameter("description");
		categorie = request.getParameter("categorie");
		auteur = request.getParameter("auteur");
		typeAcces = request.getParameter("typeAcces");
		//image = request.getParameter("image");
		
	
		
		
		
		Fichier3D fichier3D = new Fichier3D();
		// Initialisation des attributs de lobjet fichier3D
		
		fichier3D.setFichier(fichier);
		fichier3D.setDescription(description);
		fichier3D.setCategorie(categorie);
		fichier3D.setAuteur(auteur);
		fichier3D.setTypeAcces(typeAcces);
		fichier3D.setImage(image);
		fichier3D.setDateDeCreation(new Date());
//		fichier3D.setPersonne(personne);
		
		
		
		
// enregistrement de l'objet du fichier3D  dans la base de données
		
		// Obtain a database connection:
        EntityManagerFactory emf =
           (EntityManagerFactory)getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
		
		Iservice service = new Service(em);
		service.enregistrerFichier3DService(fichier3D);
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		//	request.getRequestDispatcher("/GallerieServlet").forward(request, response);

	}

}
