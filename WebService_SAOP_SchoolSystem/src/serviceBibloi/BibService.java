package serviceBibloi;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ServiceBiblio.BibliothequeLocal;
import entities.Biblio;
import entities.Livre;

@WebService
public class BibService {
	
	@EJB
	private BibliothequeLocal biblio;
	
	public Biblio ChercherBib(int ID) {
		return biblio.ChercherBib(ID);
	}
	@WebMethod
	public Biblio ajouterBiblio(Biblio Bi) {
		return biblio.ajouterBiblio(Bi);
	}
	@WebMethod
	public void SupprimerBiblio(int Bi) {
		biblio.SupprimerBiblio(Bi);
	}
	@WebMethod
	public Livre ajouterLivre(Livre L,int refB) {
		return biblio.ajouterLivre(L,refB);
	}
	@WebMethod
	public List<Livre> rechercherLivre(String Titre) {
		return biblio.rechercherLivre(Titre);
	}
	@WebMethod
	public void emprunterLivres(String CNE, String Titree) {
		biblio.emprunterLivres(CNE, Titree);
	}
	@WebMethod
	public List<Livre> consulterLivres(String Categorie) {
		return biblio.consulterLivres(Categorie);
	}
	@WebMethod
	public void modfierLivre(Livre L) {
		biblio.modfierLivre(L);
	}
	@WebMethod
	public void SupprimerLivre(int L) {
		biblio.SupprimerLivre(L);
	}
	@WebMethod
	public List<Livre> TousLivre() {
		return biblio.TousLivre();
	}
	

}
