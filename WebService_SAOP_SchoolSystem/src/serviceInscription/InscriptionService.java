package serviceInscription;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ServiceInscription.InscriptionLocal;
import entities.Admin;
import entities.Etudiant;
import entities.Filiere;

@WebService
public class InscriptionService {
	
	@EJB
	private InscriptionLocal inscrit;

	@WebMethod
	public List<Filiere> toutesfilieres() {
		return inscrit.toutesfilieres();
	}

	@WebMethod
	public Admin AjouterAdmin(Admin A) {
		return inscrit.AjouterAdmin(A);
	}

	@WebMethod
	public void supprimerAdmin(int ID) {
		inscrit.supprimerAdmin(ID);
	}

	@WebMethod
	public Etudiant Stocke(Etudiant E,int IdFiliere,int IdAdmin) {
		return inscrit.Stocke(E, IdFiliere,IdAdmin);
	}

	@WebMethod
	public List<Etudiant> Consulter(Filiere F) {
		return inscrit.Consulter(F);
	}

	@WebMethod
	public void ajouterFiliere(Filiere F) {
		inscrit.ajouterFiliere(F);
	}

	@WebMethod
	public void supprimerFiliere(int ID) {
		inscrit.supprimerFiliere(ID);
	}

}
