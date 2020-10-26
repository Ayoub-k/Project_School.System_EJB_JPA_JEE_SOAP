/**
 * Filiere.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceInscription;

public class Filiere  implements java.io.Serializable {
    private java.lang.Integer idFiliere;

    private java.lang.String nom;

    private serviceInscription.Niveau niveau;

    public Filiere() {
    }

    public Filiere(
           java.lang.Integer idFiliere,
           java.lang.String nom,
           serviceInscription.Niveau niveau) {
           this.idFiliere = idFiliere;
           this.nom = nom;
           this.niveau = niveau;
    }


    /**
     * Gets the idFiliere value for this Filiere.
     * 
     * @return idFiliere
     */
    public java.lang.Integer getIdFiliere() {
        return idFiliere;
    }


    /**
     * Sets the idFiliere value for this Filiere.
     * 
     * @param idFiliere
     */
    public void setIdFiliere(java.lang.Integer idFiliere) {
        this.idFiliere = idFiliere;
    }


    /**
     * Gets the nom value for this Filiere.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Filiere.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the niveau value for this Filiere.
     * 
     * @return niveau
     */
    public serviceInscription.Niveau getNiveau() {
        return niveau;
    }


    /**
     * Sets the niveau value for this Filiere.
     * 
     * @param niveau
     */
    public void setNiveau(serviceInscription.Niveau niveau) {
        this.niveau = niveau;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filiere)) return false;
        Filiere other = (Filiere) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idFiliere==null && other.getIdFiliere()==null) || 
             (this.idFiliere!=null &&
              this.idFiliere.equals(other.getIdFiliere()))) &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.niveau==null && other.getNiveau()==null) || 
             (this.niveau!=null &&
              this.niveau.equals(other.getNiveau())));
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
        if (getIdFiliere() != null) {
            _hashCode += getIdFiliere().hashCode();
        }
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getNiveau() != null) {
            _hashCode += getNiveau().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filiere.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviceInscription/", "filiere"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFiliere");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdFiliere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("niveau");
        elemField.setXmlName(new javax.xml.namespace.QName("", "niveau"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://serviceInscription/", "niveau"));
        elemField.setMinOccurs(0);
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
