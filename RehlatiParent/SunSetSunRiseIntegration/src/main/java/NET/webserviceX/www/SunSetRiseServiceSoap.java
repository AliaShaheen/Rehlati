/**
 * SunSetRiseServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public interface SunSetRiseServiceSoap extends java.rmi.Remote {

    /**
     * Get Sunset and Sunrise time for any location in the world<br/><b>Longitude:</b>Positive
     * in Western Hemisphere,Negative in Eastern Hemisphere<br/><b>Latitude:</b>Positive
     * in Northern Hemisphere,Negative in Southern Hemisphere
     */
    public NET.webserviceX.www.LatLonDate getSunSetRiseTime(NET.webserviceX.www.LatLonDate l) throws java.rmi.RemoteException;
}
