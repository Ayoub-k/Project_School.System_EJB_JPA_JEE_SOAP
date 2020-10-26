/**
 * Livre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceBibloi;

public class Livre  implements java.io.Serializable {
    private int id;

    private java.lang.String nom;

    private java.lang.String categorie;

    private java.lang.String auteur;

    private int exemplaire;

    public Livre() {
    }

    public Livre(
           int id,
           java.lang.String nom,
           java.lang.String categorie,
           java.lang.String auteur,
           int exemplaire) {
           this.id = id;
           this.nom = nom;
           this.categorie = categorie;
           this.auteur = auteur;
           this.exemplaire = exemplaire;
    }


    /**
     * Gets the id value for this Livre.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Livre.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nom value for this Livre.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Livre.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the categorie value for this Livre.
     * 
     * @return categorie
     */
    public java.lang.String getCategorie() {
        return categorie;
    }


    /**
     * Sets the categorie value for this Livre.
     * 
     * @param categorie
     */
    public void setCategorie(java.lang.String categorie) {
        this.categorie = categorie;
    }


    /**
     * Gets the auteur value for this Livre.
     * 
     * @return auteur
     */
    public java.lang.String getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this Livre.
     * 
     * @param auteur
     */
    public void setAuteur(java.lang.String auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the exemplaire value for this Livre.
     * 
     * @return exemplaire
     */
    public int getExemplaire() {
        return exemplaire;
    }


    /**
     * Sets the exemplaire value for this Livre.
     * 
     * @param exemplaire
     */
    public void setExemplaire(int exemplaire) {
        this.exemplaire = exemplaire;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Livre)) return false;
        Livre other = (Livre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.categorie==null && other.getCategorie()==null) || 
             (this.categorie!=null &&
              this.categorie.equals(other.getCategorie()))) &&
            ((this.auteur==null && other.getAuteur()==null) || 
             (this.auteur!=null &&
              this.auteur.equals(other.getAuteur()))) &&
            this.exemplaire == other.getExemplaire();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getId();
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getCategorie() != null) {
            _hashCode += getCategorie().hashCode();
        }
        if (getAuteur() != null) {
            _hashCode += getAuteur().hashCode();
        }
        _hashCode += getExemplaire();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Livre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviceBibloi/", "livre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categorie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categorie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemplaire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemplaire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
