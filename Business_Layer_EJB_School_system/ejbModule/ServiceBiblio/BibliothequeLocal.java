package ServiceBiblio;

import java.util.List;

import javax.ejb.Local;

import entities.Biblio;
import entities.Livre;

@Local
public interface BibliothequeLocal {
	
	public Livre ajouterLivre(Livre L,int refBiblio);
	public List<Livre> rechercherLivre(String Titre);
	public void emprunterLivres(String CNE, String Titree );
	public List<Livre> consulterLivres(String Categorie);
	public void modfierLivre(Livre L);
	public void SupprimerLivre(int  ID);
	public List<Livre> TousLivre();
	
	public Biblio ajouterBiblio(Biblio Bi);
	public void SupprimerBiblio(int ID);
	public Biblio ChercherBib(int ID);

}
