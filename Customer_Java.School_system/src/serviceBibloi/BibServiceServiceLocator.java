/**
 * BibServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceBibloi;

public class BibServiceServiceLocator extends org.apache.axis.client.Service implements serviceBibloi.BibServiceService {

    public BibServiceServiceLocator() {
    }


    public BibServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BibServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BibServicePort
    private java.lang.String BibServicePort_address = "http://localhost:8080/System_ScolaireWEB/BibService";

    public java.lang.String getBibServicePortAddress() {
        return BibServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BibServicePortWSDDServiceName = "BibServicePort";

    public java.lang.String getBibServicePortWSDDServiceName() {
        return BibServicePortWSDDServiceName;
    }

    public void setBibServicePortWSDDServiceName(java.lang.String name) {
        BibServicePortWSDDServiceName = name;
    }

    public serviceBibloi.BibService getBibServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BibServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBibServicePort(endpoint);
    }

    public serviceBibloi.BibService getBibServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            serviceBibloi.BibServiceServiceSoapBindingStub _stub = new serviceBibloi.BibServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBibServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBibServicePortEndpointAddress(java.lang.String address) {
        BibServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (serviceBibloi.BibService.class.isAssignableFrom(serviceEndpointInterface)) {
                serviceBibloi.BibServiceServiceSoapBindingStub _stub = new serviceBibloi.BibServiceServiceSoapBindingStub(new java.net.URL(BibServicePort_address), this);
                _stub.setPortName(getBibServicePortWSDDServiceName());
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
        if ("BibServicePort".equals(inputPortName)) {
            return getBibServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serviceBibloi/", "BibServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serviceBibloi/", "BibServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BibServicePort".equals(portName)) {
            setBibServicePortEndpointAddress(address);
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
