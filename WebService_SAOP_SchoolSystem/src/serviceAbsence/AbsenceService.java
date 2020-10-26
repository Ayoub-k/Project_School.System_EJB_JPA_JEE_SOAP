package serviceAbsence;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ServiceAbsence.AbsenceLocal;
import entities.Etudiant;
import entities.Statistique_etu;

@WebService
public class AbsenceService {
	
	
	@EJB
	private AbsenceLocal absence;

	@WebMethod
	public List<Etudiant> AllEtudiants() {
		return absence.AllEtudiants();
	}

	@WebMethod
	public Statistique_etu AjouterInfoAbsence(Statistique_etu e, int IDetu) {
		return absence.AjouterInfoAbsence(e, IDetu);
	}

	@WebMethod
	public Statistique_etu findstatistique_etu(int ID) {
		return absence.findstatistique_etu(ID);
	}

	@WebMethod
	public Etudiant Add_Etudiant(Etudiant E,int IdFiliere,int IdAdmin) {
		return absence.Add_Etudiant(E,IdFiliere,IdAdmin);
	}

	@WebMethod
	public Etudiant ReadEtu(int ID) {
		return absence.ReadEtu(ID);
	}

	@WebMethod
	public void UpdateEtu(Etudiant E) {
		absence.UpdateEtu(E);
	}

	@WebMethod
	public void DeleteEtuNassid(int E) {
		absence.DeleteEtuNassid(E);
	}

	

	@WebMethod
	public List<Etudiant> BlackListCreate() {
		return absence.BlackListCreate();
	}

	@WebMethod
	public List<Statistique_etu> AllInfoEtu() {
		return absence.AllInfoEtu();
	}

}
