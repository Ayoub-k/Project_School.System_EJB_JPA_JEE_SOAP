/**
 * InscriptionServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceInscription;

public class InscriptionServiceServiceLocator extends org.apache.axis.client.Service implements serviceInscription.InscriptionServiceService {

    public InscriptionServiceServiceLocator() {
    }


    public InscriptionServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InscriptionServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InscriptionServicePort
    private java.lang.String InscriptionServicePort_address = "http://localhost:8080/System_ScolaireWEB/InscriptionService";

    public java.lang.String getInscriptionServicePortAddress() {
        return InscriptionServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InscriptionServicePortWSDDServiceName = "InscriptionServicePort";

    public java.lang.String getInscriptionServicePortWSDDServiceName() {
        return InscriptionServicePortWSDDServiceName;
    }

    public void setInscriptionServicePortWSDDServiceName(java.lang.String name) {
        InscriptionServicePortWSDDServiceName = name;
    }

    public serviceInscription.InscriptionService getInscriptionServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InscriptionServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInscriptionServicePort(endpoint);
    }

    public serviceInscription.InscriptionService getInscriptionServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            serviceInscription.InscriptionServiceServiceSoapBindingStub _stub = new serviceInscription.InscriptionServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getInscriptionServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInscriptionServicePortEndpointAddress(java.lang.String address) {
        InscriptionServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (serviceInscription.InscriptionService.class.isAssignableFrom(serviceEndpointInterface)) {
                serviceInscription.InscriptionServiceServiceSoapBindingStub _stub = new serviceInscription.InscriptionServiceServiceSoapBindingStub(new java.net.URL(InscriptionServicePort_address), this);
                _stub.setPortName(getInscriptionServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("InscriptionServicePort".equals(inputPortName)) {
            return getInscriptionServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serviceInscription/", "InscriptionServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serviceInscription/", "InscriptionServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InscriptionServicePort".equals(portName)) {
            setInscriptionServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
