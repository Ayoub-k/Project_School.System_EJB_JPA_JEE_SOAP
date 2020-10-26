package ServiceAbsence;

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
import entities.Statistique_etu;

/**
 * Session Bean implementation class Absence
 */
@Stateless(name="Absence")
@LocalBean
public class Absence implements AbsenceRemote, AbsenceLocal {

    
    public Absence() {
        
    }
    @PersistenceContext
    private EntityManager em;

	@Override
	public Etudiant Add_Etudiant(Etudiant E,int IdFiliere,int IdAdmin) {
		Filiere f=em.find(Filiere.class, IdFiliere);
		Admin A=em.find(Admin.class, IdAdmin);
		E.setAdmin(A);
		E.setFiliere(f);
		em.persist(E);
		return E;
	}

	@Override
	public Etudiant ReadEtu(int ID) {
		Etudiant etu=em.find(Etudiant.class, ID);
		return etu;
	}

	@Override
	public void UpdateEtu(Etudiant E) {
		em.merge(E);
	}

	@Override
	public void DeleteEtuNassid(int ID) {
		List<Etudiant> blackliste=BlackListCreate();
		
		for (Etudiant etudiant : blackliste) {
			if(etudiant.getId().equals(ID)) {
				em.remove(etudiant);
			}
		}
	}
	@Override
	public List<Etudiant> BlackListCreate() {
		List<Etudiant> blackliste=new ArrayList<Etudiant>();
		List<Statistique_etu> listes=AllInfoEtu();
		for (Statistique_etu etudiant : listes) {
			if(etudiant.Taux()>= 50 ) {
				blackliste.add(etudiant.getEtudiant());
			}
		}
		return blackliste;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Statistique_etu> AllInfoEtu() {
		Query query=em.createQuery("select E from Statistique_etu E");
		return query.getResultList();
	}
	@Override
	public Statistique_etu AjouterInfoAbsence(Statistique_etu e, int IDetu) {
		Etudiant etu=em.find(Etudiant.class, IDetu);
		e.setEtudiant(etu);
		em.persist(e);
		return e;
	}
	@Override
	public Statistique_etu findstatistique_etu(int ID) {
		Statistique_etu setu=em.find(Statistique_etu.class, ID);
		return setu;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Etudiant> AllEtudiants() {
		Query query=em.createQuery("select E from Etudiant E");
		return query.getResultList();
		
	}

}
