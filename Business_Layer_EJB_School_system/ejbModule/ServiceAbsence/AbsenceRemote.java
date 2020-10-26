package ServiceAbsence;

import java.util.List;

import javax.ejb.Remote;

import entities.Etudiant;
import entities.Statistique_etu;

@Remote
public interface AbsenceRemote {
	
	public Etudiant Add_Etudiant(Etudiant E,int IdFiliere,int IdAdmin);
	public Etudiant ReadEtu(int ID);
	public void UpdateEtu(Etudiant E);
	public void DeleteEtuNassid(int ID);

	public List<Etudiant> BlackListCreate();
	public List<Statistique_etu> AllInfoEtu();
	public List<Etudiant>  AllEtudiants();
	
	
	public Statistique_etu AjouterInfoAbsence(Statistique_etu e,int IDetu);
	public Statistique_etu findstatistique_etu(int ID);

}
