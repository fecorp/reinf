/*


/**
 * Comunicaoreinf_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.rfb.sped.estatico._55._82C56BF5CACE455A34D679C36AD8DD350E243B.Pacote_XSD_Comunica%C3%A7%C3%A3o_EFD_REINF_v1_2_WSDL_wsdl;

public class Comunicaoreinf_ServiceLocator extends org.apache.axis.client.Service implements br.gov.rfb.sped.estatico._55._82C56BF5CACE455A34D679C36AD8DD350E243B.Pacote_XSD_Comunica%C3%A7%C3%A3o_EFD_REINF_v1_2_WSDL_wsdl.Comunicaoreinf_Service {

    public Comunicaoreinf_ServiceLocator() {
    }


    public Comunicaoreinf_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Comunicaoreinf_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }
    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
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
         {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sped.rfb.gov.br/estatico/55/82C56BF5CACE455A34D679C36AD8DD350E243B/Pacote_XSD_Comunica%C3%A7%C3%A3o_EFD-REINF_v1.2_WSDL.wsdl", "comunicaoreinf");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
        }
        return ports.iterator();
    }

}
*/