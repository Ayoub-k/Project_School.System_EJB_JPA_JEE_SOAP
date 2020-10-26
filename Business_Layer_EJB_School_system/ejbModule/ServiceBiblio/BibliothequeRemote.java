package ServiceBiblio;

import java.util.List;

import javax.ejb.Remote;

import entities.Biblio;
import entities.Livre;

@Remote
public interface BibliothequeRemote {
	
	public Livre ajouterLivre(Livre L,int refBiblio);
	public List<Livre> rechercherLivre(String Titre);
	public void emprunterLivres(String CNE, String Titre);
	public List<Livre> consulterLivres(String Categorie);
	public void modfierLivre(Livre L);
	public void SupprimerLivre(int  ID);
	public List<Livre> TousLivre();
	
	public Biblio ajouterBiblio(Biblio Bi);
	public void SupprimerBiblio(int  ID);
	public Biblio ChercherBib(int ID);
	

}
