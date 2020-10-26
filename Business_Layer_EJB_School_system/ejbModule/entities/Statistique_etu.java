package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Statistique_etu implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private double nombre_heures_Totale;
	@Column(nullable = false)
	private double nomre_heures_abs;
	
	
//	private double nombre_heures_totale;
	
	
	public double getNombre_heures_Totale() {
		return nombre_heures_Totale;
	}
	public void setNombre_heures_Totale(double nombre_heures_Totale) {
		this.nombre_heures_Totale = nombre_heures_Totale;
	}
	
	public void setNomre_heures_abs(double nomre_heures_abs) {
		this.nomre_heures_abs = nomre_heures_abs;
	}
	@OneToOne  
	@JoinColumn( name="IdEtudiant", nullable=false )
	@XmlTransient
	private Etudiant etudiant;
	public Statistique_etu() {
		
	}
	public Statistique_etu(int id,double nombre_heures_Totale, int nomre_heures_abs) {
		this.id=id;
		this.nombre_heures_Totale = nombre_heures_Totale;
		this.nomre_heures_abs = nomre_heures_abs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getTaux_abs() {
		return nombre_heures_Totale;
	}
	public void setTaux_abs(double taux_abs) {
		nombre_heures_Totale = taux_abs;
	}
	public double getNomre_heures_abs() {
		return this.nomre_heures_abs;
	}
	public void setNomre_heures_abs(int nomre_heures_abs) {
		this.nomre_heures_abs = nomre_heures_abs;
	}
	
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public double Taux() {
		return (this.nomre_heures_abs/this.nombre_heures_Totale)*100;
	}
	
	public String toString() {
		return "Statistique_etu [id=" + id + ", nombre_heures_Totale=" + nombre_heures_Totale + ", nomre_heures_abs="
				+ nomre_heures_abs + ", etudiant=" + etudiant + "]";
	}
	
	
	
	

}
