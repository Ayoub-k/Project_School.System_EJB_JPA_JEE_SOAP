package ServiceInscription;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Admin;
import entities.Etudiant;
import entities.Filiere;


@Stateless(name="Inscription")
@LocalBean
public class Inscription implements InscriptionRemote, InscriptionLocal {

//	@EJB
	@PersistenceContext(unitName = "EJB_System_Scolaire")
    private EntityManager em;
    public Inscription() {
       
    }

	@Override
	public Etudiant Stocke(Etudiant E,int IdFiliere,int IdAdmin) {
		Filiere f=em.find(Filiere.class, IdFiliere);
		Admin A=em.find(Admin.class, IdAdmin);
		E.setAdmin(A);
		E.setFiliere(f);
		em.persist(E);
		return E;
	}

	@Override
	public List<Etudiant> Consulter(Filiere F) {
		Query query=em.createQuery("select E from  Etudiant E");
		List<Etudiant> listesetudiants=new ArrayList<Etudiant>();
		@SuppressWarnings("unchecked")
		List<Etudiant> listetotale=query.getResultList();
		for (Etudiant etudiant : listetotale) {
			
			if(etudiant.getFiliere().equals(F)) {
				listesetudiants.add(etudiant);
			}
		}
		return listesetudiants;
	}

	@Override
	public void ajouterFiliere(Filiere F) {
		em.persist(F);
		
	}

	@Override
	public void supprimerFiliere(int ID) {
		Filiere F=em.find(Filiere.class, ID);
		em.remove(F);
	}

	@Override
	
	public Admin AjouterAdmin(Admin A) {
		em.persist(A);
		return em.find(Admin.class, A.getId());
	}

	@Override
	public void supprimerAdmin(int ID) {
		Admin A=em.find(Admin.class, ID);
		em.remove(A);	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Filiere> toutesfilieres() {
		Query query=em.createQuery("select F from  Filiere F");
		return query.getResultList();
	}

	

}
