package entities;

import java.io.Serializable;
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
public class Biblio  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdBib;
	@Column(nullable = false)
	private String nom;
	
	public Biblio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Biblio(int id,String nom) {
		this.IdBib=id;
		this.nom = nom;
	
	}
	
	@OneToMany(mappedBy = "bib")
	@XmlTransient
	private List<Livre> livres;
	
	public Integer getIdBib() {
		return IdBib;
	}
	public void setIdBib(Integer idBib) {
		IdBib = idBib;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Livre> getLivres() {
		return livres;
	}
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
	
	public String toString() {
		return "Biblio [IdBib=" + IdBib + ", nom=" + nom + ", livres=" + livres + "]";
	}
	

}
