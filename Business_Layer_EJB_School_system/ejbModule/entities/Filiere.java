package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Filiere {
	
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdFiliere;
	@Column(length = 30, nullable = false)
	private String nom;
	@Column(nullable = false)
	private Niveau niveau;
	
	@OneToMany(mappedBy = "filiere")
	@XmlTransient
	private List<Etudiant> etudiants;
	
	
	public Filiere() {
		super();
	}
	public Filiere(int id, String nom) {
		this.IdFiliere=id;
		this.nom = nom;
	}

	public Integer getIdFiliere() {
		return IdFiliere;
	}
	public void setIdFiliere(Integer idFiliere) {
		IdFiliere = idFiliere;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	
	public String toString() {
		return "Filiere [IdFiliere=" + IdFiliere + ", nom=" + nom + "]";
	}
	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	

}
