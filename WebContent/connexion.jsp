<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="">
<!-- To declare your language - read more here: https://www.w3.org/International/questions/qa-html-language-declarations -->
<head>
<title>Virtual Gate | Pages | Connexion </title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
</head>
<body id="top">
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper row0">
  <div id="topbar" class="hoc clear">
    <div class="fl_left"> 
      <!-- ################################################################################################ -->
      <ul class="nospace">
        <li><i class="fas fa-phone rgtspace-5"></i> + (237) 78 55 15 55</li>
        <li><i class="far fa-envelope rgtspace-5"></i> virtualGate@domain.com</li>
      </ul>
      <!-- ################################################################################################ -->
    </div>
    <div class="fl_right"> 
      <!-- ################################################################################################ -->
      <ul class="nospace">
        <li><a href="index.jsp"><i class="fas fa-home"></i></a></li>
        <li><a href="creerCompte.jsp" title="Créer un compte"><i class="fas fa-edit"></i></a></li>
        <li id="searchform">
          <div>
            <form action="ConnexionServlet" method="post">
              <fieldset>
                <legend>Quick Search:</legend>
                <input type="text" placeholder="Rechercher&hellip;">
                <button type="submit"><i class="fas fa-search"></i></button>
              </fieldset>
            </form>
          </div>
        </li>
      </ul>
      <!-- ################################################################################################ -->
    </div>
  </div>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper row1">
  <header id="header" class="hoc clear">
    <div id="logo" class="fl_left"> 
      <!-- ################################################################################################ -->
      <h1><a href="index.jsp">Virtual Gate</a></h1>
      <!-- ################################################################################################ -->
    </div>
    <nav id="mainav" class="fl_right"> 
      <!-- ################################################################################################ -->
      <ul class="clear">
        <li><a href="index.jsp">Accueil</a></li>
        <li><a class="drop" href="#">Mon Domaine</a>
          <ul>
            <li ><a href="domainePrive.jsp">Domaine Privé</a></li>
            <li ><a href="domainePublic.jsp">Domaine public</a></li>
            <li><a href="gallerie.jsp">Gallerie</a></li>
            <li><a href="enregistrerFichier.jsp">Enregistrer fichier</a></li>
          </ul>
        </li>
        <li><a class="drop" href="#">DOMAINE PARTAGE</a>
          <ul>
            <li><a href="#">Achitecture</a></li>
            <li><a class="drop" href="#">Open Worl</a>
              <ul>
                <li><a href="#">Villes et civilisations</a></li>
                <li><a href="#">Nature</a></li>
                <li><a href="#">Espace et Science Fiction</a></li>
                <li><a href="#">Autres</a></li>
              </ul>
            </li>
            <li><a href="#">Divers</a></li>
          </ul>
        </li>
        <li><a href="#"> </a></li>
      </ul>
      <!-- ################################################################################################ -->
    </nav>
  </header>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper bgded overlay" style="background-image:url('images/demo/backgrounds/01.PNG');">
  <div id="breadcrumb" class="hoc clear"> 
    <!-- ################################################################################################ -->
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">Mon Domaine</a></li>
      <li><a href="#">Connexion</a></li>
    </ul>
    <!-- ################################################################################################ -->
  </div>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <!-- ################################################################################################ -->
    
      <div id="comments">
        
        <h2>Connexion à votre compte</h2>
        <form action="#" method="post">

          <div>
            <div class="one_half first">
              <label for="nomFichier">Nom d' utilisateur</label>
              <input type="text" name="nomUtilisateur" id="nomUtilisateur" value="" size="22" required>
            </div>
            
            <div>
            <div class="one_half first">
              <label for="motDePasse">Mot de passe</label>
              <input type="text" name="motDePasse" id="motDePasse" value="" size="22" required>
            </div>

          
            &nbsp;

          <div align="center">

              <input type="submit" name="connexion" value="Connexion">

          </div>

        </form>
      </div>
      <!-- ################################################################################################ -->
    </div>
    <!-- ################################################################################################ -->
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper row4">
  <footer id="footer" class="hoc clear"> 
    <!-- ################################################################################################ -->
     <div class="one_third">
      <h6 class="heading"> </h6>
      <ul class="nospace linklist contact btmspace-30">
        
        <li><i class="fas fa-phone"></i> + (237) 78 55 15 55</li>
        
      </ul>
    
    </div>
    
    <div class="one_third">
      <h6 class="heading">CONTACTEZ NOUS</h6>
      <ul class="nospace linklist contact btmspace-30">
        
        <li><i class="far fa-envelope"></i> info@domain.com</li>
      </ul>
      
    </div>
   
   <div class="one_quarter">
      <h6 class="heading"> </h6>
      <ul class="faico clear">
        <li><a class="faicon-facebook" href="#"><i class="fab fa-facebook"></i></a></li>
        <li><a class="faicon-google-plus" href="#"><i class="fab fa-google-plus-g"></i></a></li>
        <li><a class="faicon-linkedin" href="#"><i class="fab fa-linkedin"></i></a></li>
        <li><a class="faicon-twitter" href="#"><i class="fab fa-twitter"></i></a></li>
        <li><a class="faicon-vk" href="#"><i class="fab fa-vk"></i></a></li>
      </ul>
    </div>
    <!-- ################################################################################################ -->
  </footer>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper row5">
  <div id="copyright" class="hoc clear"> 
    <!-- ################################################################################################ -->
    <p class="fl_left">Copyright &copy; 2018 - All Rights Reserved - <a href="#">Domain Name</a></p>
    <p class="fl_right">Template by <a target="_blank" href="https://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
    <!-- ################################################################################################ -->
  </div>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<a id="backtotop" href="#top"><i class="fas fa-chevron-up"></i></a>
<!-- JAVASCRIPTS -->
<script src="../layout/scripts/jquery.min.js"></script>
<script src="../layout/scripts/jquery.backtotop.js"></script>
<script src="../layout/scripts/jquery.mobilemenu.js"></script>
</body>
</html>