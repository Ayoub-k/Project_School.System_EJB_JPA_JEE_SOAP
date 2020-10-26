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
public class Admin  implements Serializable{
	
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

	@Column(length = 15, nullable = false)
	private String password;
	@Column(length = 30, nullable = false)
	private String tlf;
	@Column(nullable = false)
	private int privilleges;
	
	@OneToMany(mappedBy = "admin")
	
	@XmlTransient
	private List<Etudiant> etudiants;

	public Admin() {
		super();
	}

	public Admin(int privileges) {
		super();
		this.privilleges = privileges;
	}
	
	public Admin(Integer id, String nom, String prenom, String email, String password, String tlf, int privilleges) {
		super();
		Id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.tlf = tlf;
		this.privilleges = privilleges;
	}

	public int getPrivilleges() {
		return privilleges;
	}
	public void setPrivilleges(int privilleges) {
		this.privilleges = privilleges;
	}

	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	
	public String toString() {
		return "Admin [Id=" + Id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password=" + password
				+ ", tlf=" + tlf + ", privilleges=" + privilleges + "]";
	}
	
	

}
