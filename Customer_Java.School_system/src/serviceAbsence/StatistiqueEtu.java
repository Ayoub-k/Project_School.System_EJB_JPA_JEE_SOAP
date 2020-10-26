/**
 * StatistiqueEtu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceAbsence;

public class StatistiqueEtu  implements java.io.Serializable {
    private java.lang.Integer id;

    private double nombre_heures_Totale;

    private double nomre_heures_abs;

    public StatistiqueEtu() {
    }

    public StatistiqueEtu(
           java.lang.Integer id,
           double nombre_heures_Totale,
           double nomre_heures_abs) {
           this.id = id;
           this.nombre_heures_Totale = nombre_heures_Totale;
           this.nomre_heures_abs = nomre_heures_abs;
    }


    /**
     * Gets the id value for this StatistiqueEtu.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this StatistiqueEtu.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the nombre_heures_Totale value for this StatistiqueEtu.
     * 
     * @return nombre_heures_Totale
     */
    public double getNombre_heures_Totale() {
        return nombre_heures_Totale;
    }


    /**
     * Sets the nombre_heures_Totale value for this StatistiqueEtu.
     * 
     * @param nombre_heures_Totale
     */
    public void setNombre_heures_Totale(double nombre_heures_Totale) {
        this.nombre_heures_Totale = nombre_heures_Totale;
    }


    /**
     * Gets the nomre_heures_abs value for this StatistiqueEtu.
     * 
     * @return nomre_heures_abs
     */
    public double getNomre_heures_abs() {
        return nomre_heures_abs;
    }


    /**
     * Sets the nomre_heures_abs value for this StatistiqueEtu.
     * 
     * @param nomre_heures_abs
     */
    public void setNomre_heures_abs(double nomre_heures_abs) {
        this.nomre_heures_abs = nomre_heures_abs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatistiqueEtu)) return false;
        StatistiqueEtu other = (StatistiqueEtu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.nombre_heures_Totale == other.getNombre_heures_Totale() &&
            this.nomre_heures_abs == other.getNomre_heures_abs();
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += new Double(getNombre_heures_Totale()).hashCode();
        _hashCode += new Double(getNomre_heures_abs()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatistiqueEtu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviceAbsence/", "statistiqueEtu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre_heures_Totale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre_heures_Totale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomre_heures_abs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomre_heures_abs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
