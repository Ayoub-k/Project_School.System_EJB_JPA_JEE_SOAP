package TestWebAService;


import java.util.List;

import serviceAbsence.AbsenceServiceProxy;
import serviceAbsence.StatistiqueEtu;
import serviceBibloi.BibServiceProxy;
import serviceBibloi.Biblio;
import serviceBibloi.Livre;
import serviceInscription.Admin;
import serviceInscription.Etudiant;
import serviceInscription.Filiere;
import serviceInscription.InscriptionServiceProxy;
import serviceInscription.Niveau;

public class Test {

	public static void main(String[] args) throws Exception {
		
		// la premiere partie pour ajouter les info a la BD
							// Service Inscription 
		InscriptionServiceProxy proxy=new InscriptionServiceProxy();
		// On va creer les admins, les filieres et les etudiants
		
		Admin admin=new Admin(0,"Mohamed","Gadroz","mohmed@gmail.com","123456","03154852",0);
		
		Niveau niveau1=Niveau.Niveau_1;
		Niveau niveau2=Niveau.Niveau_2;
		Niveau niveau3=Niveau.Niveau_3;
		Niveau niveau4=Niveau.Niveau_4;
		Niveau niveau5=Niveau.Niveau_5;
		
		Filiere filiere1N1=new Filiere(0,"SMI", niveau1);
		Filiere filiere1N2=new Filiere(1,"SMI", niveau2);
		Filiere filiere1N3=new Filiere(2,"SMI", niveau3);
		
		Filiere filiere2N1=new Filiere(3,"IGE", niveau1);
		Filiere filiere2N2=new Filiere(4,"IGE", niveau2);
		Filiere filiere2N3=new Filiere(5,"IGE", niveau3);
		
		Etudiant etu1=new Etudiant(0, "Mohamed", "Amine", "moh@moh", "1234560", "031558447", "10");
		Etudiant etu2=new Etudiant(1, "Abdo", "Mohamed", "moh@moh", "1234560", "031558447", "11");
		Etudiant etu4=new Etudiant(2, "Lmya", "Sabir", "lamya@moh", "1234560", "031558447", "12");
		
		Etudiant etu3=new Etudiant(3, "Ali", "Amine", "moh@moh", "1234560", "031558447", "13");
		Etudiant etu5=new Etudiant(4, "Maryam", "fadile", "moh@moh", "1234560", "031558447", "14");
		Etudiant etu6=new Etudiant(5, "omayma", "Sabir", "lamya@moh", "1234560", "031558447", "15");
		
		// Apres on va ajouter les entities a la base de donnees, dans cette partie on va invoquer les WS pour les ajouter.
		// ajouer Admin
		proxy.ajouterAdmin(admin);
		
		// ajouer Filieres
		proxy.ajouterFiliere(filiere1N1);
		proxy.ajouterFiliere(filiere1N2);
		proxy.ajouterFiliere(filiere1N3);
		
		proxy.ajouterFiliere(filiere2N1);
		proxy.ajouterFiliere(filiere2N2);
		proxy.ajouterFiliere(filiere2N3);
		
		// ajouer les etudiants
		proxy.stocke(etu1, 0, 0);
		proxy.stocke(etu2, 0, 0);
		proxy.stocke(etu3, 1, 0);
		proxy.stocke(etu4, 1, 0);
		proxy.stocke(etu5, 4, 0);
		proxy.stocke(etu6, 4, 0);
		
							//	 Sevrvice Absence
		AbsenceServiceProxy proxyabcence=new AbsenceServiceProxy();
		// les statistiques sur les etudiants
		StatistiqueEtu info1=new StatistiqueEtu(0,300,50);
		StatistiqueEtu info2=new StatistiqueEtu(1,300,15);
		StatistiqueEtu info3=new StatistiqueEtu(2,300,150);
		
		StatistiqueEtu info4=new StatistiqueEtu(3,300,200);
		StatistiqueEtu info5=new StatistiqueEtu(4,300,100);
		StatistiqueEtu info6=new StatistiqueEtu(5,300,55);
		
		//on va  ajouter les statistiques sur les etudiants
		
		proxyabcence.ajouterInfoAbsence(info1, 0);
		proxyabcence.ajouterInfoAbsence(info2, 1);
		proxyabcence.ajouterInfoAbsence(info3, 2);
		
		proxyabcence.ajouterInfoAbsence(info4, 3);
		proxyabcence.ajouterInfoAbsence(info5, 4);
		proxyabcence.ajouterInfoAbsence(info6, 5);
		
							// Service Bibliotheque
		BibServiceProxy proxyBib=new BibServiceProxy();
		// on va creer les biblios et les livres 
		Livre livre1=new Livre(0, "Ubuntu", "Programming", "ELAY", 0);
		Livre livre2=new Livre(1, "SAO", "Programming", "MERY", 0);
		Livre livre3=new Livre(2, "CloudComputing", "Programming", "Ayman", 0);
		
		Livre livre4=new Livre(3, "Arabes", "Art", "mohamed", 0);
		Livre livre5=new Livre(4, "Java", "Programming", "Gadroz", 0);
		Livre livre6=new Livre(5, "Life", "Art", "Anas", 0);
		
		// on va creer une bibliotheque
		Biblio bib=new Biblio(0, "BiBInfo");
		
		// on va ajouter les donnees a la BD
		proxyBib.ajouterBiblio(bib);
		
		proxyBib.ajouterLivre(livre1, 0);
		proxyBib.ajouterLivre(livre2, 0);
		proxyBib.ajouterLivre(livre3, 0);
		proxyBib.ajouterLivre(livre4, 0);
		proxyBib.ajouterLivre(livre5, 0);
		proxyBib.ajouterLivre(livre6, 0);
		
		// on va emprunter des livres
		proxyBib.emprunterLivres("10", "Ubuntu");
		proxyBib.emprunterLivres("10", "JEE");
		proxyBib.emprunterLivres("12", "CloudComputing");
		proxyBib.emprunterLivres("13", "Ubuntu");
		
		// La deuxieme partie pour le test afficher, supprimer .......
		 
		System.out.println("----------------------------------------------------------------*Service Inscreption*-------------------------------------------------------------------");
		
		System.out.println("----------------------------------------------------------------*toutes les filieres-------------------------------------");
		Filiere[] listesfiliere=proxy.toutesfilieres();
		for (Filiere filiere : listesfiliere) {
			System.out.println("Filiere: \tNom  "+filiere.getNom()+" \t Niveau: "+filiere.getNiveau());
		}
		System.out.println("-----------------------------------------------------------------*Admin----------------------------------------------------");
		System.out.println("Admin Nom: "+admin.getNom()+"\t prenom:"+admin.getPrenom()+"\t Email:"+admin.getEmail());
		System.out.println("----------------------------------------------------------------*Service Absence*-------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------*les etudiants---------------------------------------");
		
		serviceAbsence.Etudiant[] etus=proxyabcence.allEtudiants();
		
		for (serviceAbsence.Etudiant etudiant : etus) {
			System.out.println("Etudiant Nom:  "+etudiant.getNom()+"\tPrenom: "+etudiant.getPrenom()+"\tEmail:   "+etudiant.getEmail());
		}
		
		System.out.println("-----------------------------------------------------------------*les statistiques des etudiants---------------------------------------");

		StatistiqueEtu[] etusST=proxyabcence.allInfoEtu();
		for (StatistiqueEtu statistiqueEtu : etusST) {
			System.out.println("Etudiant: Nombre totale d'heure "+statistiqueEtu.getNombre_heures_Totale()+"\t Nombre d'heures absences: "+statistiqueEtu.getNomre_heures_abs());
		}
		
		System.out.println("-----------------------------------------------------------------*Black listes---------------------------------------");
		
		serviceAbsence.Etudiant[] blacklistes=proxyabcence.blackListCreate();
		
		for (serviceAbsence.Etudiant etudiant : blacklistes) {
			System.out.println("Etudiant Nom:"+etudiant.getNom()+"\t Prenom"+etudiant.getPrenom()+"\t Email:"+etudiant.getEmail());
		}
		
		System.out.println("-------------------------------------------------------------------*Tous les livres*------------------------------------------------------");
		
		Livre[] listesliveres=proxyBib.tousLivre();
		
		for (Livre livre : listesliveres) {
			System.out.println("Nom livre     :"+livre.getNom()+"\t -Categorie: "+livre.getCategorie()+" \tNbr Exemplaire: "+livre.getExemplaire() );
		}
		
		System.out.println("-------------------------------------------------------------------*Consulter livre par Categorie*------------------------------------------------------");

		Livre[]   listeslivre=proxyBib.consulterLivres("Art");
		for (Livre livre : listeslivre) {
			System.out.println("Nom livre     :"+livre.getNom()+"\t -Categorie: "+livre.getCategorie()+" \tNbr Exemplaire: "+livre.getExemplaire());
		}
		

	}

}
