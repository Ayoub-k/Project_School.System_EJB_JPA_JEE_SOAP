package ServiceBiblio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Biblio;
import entities.Etudiant;
import entities.Livre;

/**
 * Session Bean implementation class Bibliotheque
 */

@Stateless(name="Biblio")
@LocalBean
public class Bibliotheque implements BibliothequeRemote, BibliothequeLocal {

	
	@PersistenceContext(unitName = "EJB_System_Scolaire")
    private EntityManager em;
	
    public Bibliotheque() {
        
    }

	@Override
	public Livre ajouterLivre(Livre L,int refBiblio) {
		Biblio bib=em.find(Biblio.class, refBiblio);
		L.setBib(bib);
		em.persist(L);
		return L;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Livre> rechercherLivre(String Titre) {
		Query query=em.createQuery("select L from Livre L where L.nom like :x");
		query.setParameter("x",Titre);
		return query.getResultList();
	}

	
	@Override
	public void emprunterLivres(String CNE, String Titre) {
		List<Livre> L= TousLivre();
		Livre l=null;
		for (Livre livre : L) {
			if(livre.getNom().equals(Titre)) {
				l=livre;
			}
		}
		Query query2=em.createQuery("select E from Etudiant E where E.cne like:x");
		query2.setParameter("x",CNE);
		Etudiant e=null;
		@SuppressWarnings("unchecked")
		List<Etudiant> E= query2.getResultList();
		for (Etudiant etudiant : E) {
			if(etudiant.getCne().equals(CNE)) {
				e=etudiant;
			}
		}
		boolean t=false;
//		List<Etudiant> listEtu=new ArrayList<Etudiant>();
		List<Livre> listLivre=new ArrayList<Livre>();
		if(e.getLivres()!=null) {
			for (Livre livre : e.getLivres()) {
				listLivre.add(livre);
			}
		}
		
		for (Livre livre : listLivre) {
			if(livre.equals(l)) {
				t=true;
			}
		}
		if(e!=null && l!=null && t==false) {
//			listEtu.add(e);
			l.setExemplaire(l.getExemplaire()+1);
			listLivre.add(l);
//			l.setEtudiants(listEtu);
			e.setLivres(listLivre);
			em.persist(e);
//			em.persist(l);
		}
//		
//		List<Etudiant> listEtu=new ArrayList<Etudiant>();
//		List<Livre> listLivre=new ArrayList<Livre>();
//		if(L.size()>0 && E.size()>0) {
//			if(E.get(0)!=null && L.get(0)!=null ) {
//				listEtu.add(E.get(0));
//				listLivre.add(L.get(0));
//				E.get(0).setLivres(listLivre);
////				L.setEtudiants(listEtu);
////				em.persist(E);
//				L.get(0).setExemplaire(L.get(0).getExemplaire()+1);
//				em.persist(L.get(0));
//			}
//		}
		
	
		
		
		
		
		
	}

	@Override
	public List<Livre> consulterLivres(String Categorie) {
		List<Livre> listetotale=TousLivre();
		List<Livre> listebycategorie=new ArrayList<Livre>();
		
		for (Livre livre : listetotale) {
			if(livre.getCategorie().equals(Categorie)) {
				listebycategorie.add(livre);
			}
		}
		return listebycategorie;
	}

	@Override
	public void modfierLivre(Livre L) {
		Livre l=em.find(Livre.class, L.getId());
		l.setId(L.getId());
		l.setAuteur(L.getAuteur());
		
		l.setCategorie(L.getCategorie());
		l.setExemplaire(L.getExemplaire());
		l.setNom(L.getNom());

		em.persist(l);
	}

	@Override
	public void SupprimerLivre(int ID) {
		Livre L=em.find(Livre.class, ID);
		em.remove(L);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Livre> TousLivre() {
		Query query=em.createQuery("select L from Livre L");
		return query.getResultList();
	}

	

	@Override
	public Biblio ajouterBiblio(Biblio Bi) {
		
		em.persist(Bi);
		
		return Bi;
	}

	@Override
	public void SupprimerBiblio(int ID) {
		Biblio Bi=em.find(Biblio.class, ID);
		em.remove(Bi);		
	}

	@Override
	public Biblio ChercherBib(int ID) {
		return em.find(Biblio.class, ID);
	}

	

}
