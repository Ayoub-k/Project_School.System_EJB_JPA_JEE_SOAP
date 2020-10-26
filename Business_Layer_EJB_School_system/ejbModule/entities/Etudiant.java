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
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Etudiant  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy =GenerationType.TABLE)
	private Integer Id;
	@Column(length = 30, nullable = false)
	private String nom;
	@Column(length = 30, nullable = false)
	private String prenom;
	@Column(length = 50, nullable = false)
	private String email;
	@Column(length = 15, nullable = false)
	private String password;
	@Column(length = 30, nullable = false)
	private String tlf;
	@Column(nullable = false)
	private String cne;
	
	public Etudiant() {
		super();	
	}
	
	public Etudiant(Integer id, String nom, String prenom, String email, String password, String tlf, String cne) {
		super();
		Id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.tlf = tlf;
		this.cne = cne;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	@ManyToOne
	@JoinColumn(name="idAdmin", nullable=false)
	@XmlTransient
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "IdFiliere", nullable=false)
	@XmlTransient
	private Filiere filiere;
	
	@ManyToMany
	@JoinTable(name = "Emprunte",
				joinColumns = @JoinColumn(name="IdEtudiant"),
				inverseJoinColumns = @JoinColumn(name="IdLivre"))
	@XmlTransient
	private List<Livre> livres;
	
	
	@OneToOne(mappedBy = "etudiant")
	@XmlTransient
	private Statistique_etu St_etu;
	
	
	
	public Statistique_etu getSt_etu() {
		return St_etu;
	}
	public void setSt_etu(Statistique_etu st_etu) {
		St_etu = st_etu;
	}

	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	public List<Livre> getLivres() {
		return livres;
	}
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	
	public String toString() {
		return "Etudiant [Id=" + Id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password="
				+ password + ", tlf=" + tlf + ", cne=" + cne + ", filiere=" + filiere + ", livres=" + livres
				+ ", St_etu=" + St_etu + "]";
	}
	
	

}
