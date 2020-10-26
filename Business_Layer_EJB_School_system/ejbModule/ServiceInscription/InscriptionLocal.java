package ServiceInscription;

import java.util.List;

import javax.ejb.Local;

import entities.Admin;
import entities.Etudiant;
import entities.Filiere;

@Local
public interface InscriptionLocal {
	
	public Etudiant Stocke(Etudiant E,int IdFilier,int IdAdmin);
	public List<Etudiant> Consulter(Filiere F);
	public void ajouterFiliere(Filiere F);
	public List<Filiere> toutesfilieres();
	public void supprimerFiliere(int ID);
	
	public Admin AjouterAdmin(Admin A);
	public void supprimerAdmin(int ID);
	

}
