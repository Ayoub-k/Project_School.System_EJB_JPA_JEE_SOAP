/**
 * Niveau.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceInscription;

public class Niveau implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Niveau(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Niveau_1 = "Niveau_1";
    public static final java.lang.String _Niveau_2 = "Niveau_2";
    public static final java.lang.String _Niveau_3 = "Niveau_3";
    public static final java.lang.String _Niveau_4 = "Niveau_4";
    public static final java.lang.String _Niveau_5 = "Niveau_5";
    public static final java.lang.String _Niveau_6 = "Niveau_6";
    public static final Niveau Niveau_1 = new Niveau(_Niveau_1);
    public static final Niveau Niveau_2 = new Niveau(_Niveau_2);
    public static final Niveau Niveau_3 = new Niveau(_Niveau_3);
    public static final Niveau Niveau_4 = new Niveau(_Niveau_4);
    public static final Niveau Niveau_5 = new Niveau(_Niveau_5);
    public static final Niveau Niveau_6 = new Niveau(_Niveau_6);
    public java.lang.String getValue() { return _value_;}
    public static Niveau fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Niveau enumeration = (Niveau)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Niveau fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Niveau.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviceInscription/", "niveau"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
