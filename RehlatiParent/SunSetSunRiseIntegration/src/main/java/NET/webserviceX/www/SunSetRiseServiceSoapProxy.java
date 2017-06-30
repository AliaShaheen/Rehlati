package NET.webserviceX.www;

public class SunSetRiseServiceSoapProxy implements NET.webserviceX.www.SunSetRiseServiceSoap {
  private String _endpoint = null;
  private NET.webserviceX.www.SunSetRiseServiceSoap sunSetRiseServiceSoap = null;
  
  public SunSetRiseServiceSoapProxy() {
    _initSunSetRiseServiceSoapProxy();
  }
  
  public SunSetRiseServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSunSetRiseServiceSoapProxy();
  }
  
  private void _initSunSetRiseServiceSoapProxy() {
    try {
      sunSetRiseServiceSoap = (new NET.webserviceX.www.SunSetRiseServiceLocator()).getSunSetRiseServiceSoap();
      if (sunSetRiseServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sunSetRiseServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sunSetRiseServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sunSetRiseServiceSoap != null)
      ((javax.xml.rpc.Stub)sunSetRiseServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public NET.webserviceX.www.SunSetRiseServiceSoap getSunSetRiseServiceSoap() {
    if (sunSetRiseServiceSoap == null)
      _initSunSetRiseServiceSoapProxy();
    return sunSetRiseServiceSoap;
  }
  
  public NET.webserviceX.www.LatLonDate getSunSetRiseTime(NET.webserviceX.www.LatLonDate l) throws java.rmi.RemoteException{
    if (sunSetRiseServiceSoap == null)
      _initSunSetRiseServiceSoapProxy();
    return sunSetRiseServiceSoap.getSunSetRiseTime(l);
  }
  
  
}