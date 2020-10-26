package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Livre implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    id;
	@Column(length = 30, nullable = false,unique=true)
	private String nom;
	@Column(length = 30, nullable = false)
	private String categorie;
	@Column(length = 30, nullable = false)
	private String auteur;
	@Column( nullable = false)
	private int exemplaire;
	
	
	@ManyToMany
	@JoinTable(name = "Emprunte",
				joinColumns = @JoinColumn(name="IdLivre"),
				inverseJoinColumns = @JoinColumn(name="IdEtudiant"))
	@XmlTransient
	private List<Etudiant> etudiants;
	
	@ManyToOne
	@JoinColumn(name = "IdBib", nullable=false)
	@XmlTransient
	private Biblio bib;
	
	public int getExemplaire() {
		return exemplaire;
	}
	public void setExemplaire(int exemplaire) {
		this.exemplaire = exemplaire;
	}
	public Livre() {
		super();
	}
	public Livre(int id,String nom, String categorie, String auteur) {
		this.id=id;
		this.nom = nom;
		this.categorie = categorie;
		this.auteur = auteur;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	public Biblio getBib() {
		return bib;
	}
	public void setBib(Biblio bib) {
		this.bib = bib;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String toString() {
		return "Livre [id=" + id + ", nom=" + nom + ", categorie=" + categorie + ", auteur=" + auteur + ", exemplaire="
				+ exemplaire + ", bib=" + bib + "]";
	}
	
}
