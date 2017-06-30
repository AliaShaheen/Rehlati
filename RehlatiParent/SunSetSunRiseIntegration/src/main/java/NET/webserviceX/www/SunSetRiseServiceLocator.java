/**
 * SunSetRiseServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public class SunSetRiseServiceLocator extends org.apache.axis.client.Service implements NET.webserviceX.www.SunSetRiseService {

    public SunSetRiseServiceLocator() {
    }


    public SunSetRiseServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SunSetRiseServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SunSetRiseServiceSoap
    private java.lang.String SunSetRiseServiceSoap_address = "http://www.webservicex.net/sunsetriseservice.asmx";

    public java.lang.String getSunSetRiseServiceSoapAddress() {
        return SunSetRiseServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SunSetRiseServiceSoapWSDDServiceName = "SunSetRiseServiceSoap";

    public java.lang.String getSunSetRiseServiceSoapWSDDServiceName() {
        return SunSetRiseServiceSoapWSDDServiceName;
    }

    public void setSunSetRiseServiceSoapWSDDServiceName(java.lang.String name) {
        SunSetRiseServiceSoapWSDDServiceName = name;
    }

    public NET.webserviceX.www.SunSetRiseServiceSoap getSunSetRiseServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SunSetRiseServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSunSetRiseServiceSoap(endpoint);
    }

    public NET.webserviceX.www.SunSetRiseServiceSoap getSunSetRiseServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            NET.webserviceX.www.SunSetRiseServiceSoapStub _stub = new NET.webserviceX.www.SunSetRiseServiceSoapStub(portAddress, this);
            _stub.setPortName(getSunSetRiseServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSunSetRiseServiceSoapEndpointAddress(java.lang.String address) {
        SunSetRiseServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (NET.webserviceX.www.SunSetRiseServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                NET.webserviceX.www.SunSetRiseServiceSoapStub _stub = new NET.webserviceX.www.SunSetRiseServiceSoapStub(new java.net.URL(SunSetRiseServiceSoap_address), this);
                _stub.setPortName(getSunSetRiseServiceSoapWSDDServiceName());
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
        if ("SunSetRiseServiceSoap".equals(inputPortName)) {
            return getSunSetRiseServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.webserviceX.NET/", "SunSetRiseService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.webserviceX.NET/", "SunSetRiseServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SunSetRiseServiceSoap".equals(portName)) {
            setSunSetRiseServiceSoapEndpointAddress(address);
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
