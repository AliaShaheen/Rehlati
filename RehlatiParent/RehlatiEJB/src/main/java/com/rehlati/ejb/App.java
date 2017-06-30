package com.rehlati.ejb;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import net.webservicex.www.CCCheckerSoapProxy;
import NET.webserviceX.www.AirportSoapProxy;
import NET.webserviceX.www.LatLonDate;
import NET.webserviceX.www.SunSetRiseServiceSoapProxy;

import com.rehlati.client.beans.Airport;
import com.rehlati.client.beans.Airports;
import com.rehlati.ejb.util.RehlatiConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RemoteException
    {
    	RehlatiConfiguration config = new RehlatiConfiguration();

    	///////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	// call Sunset/ SunRise Service
    	/*
    	System.out.println("URL = " +config.getSUNSET_SUNRISE_INTEGRATION_URL());
    	SunSetRiseServiceSoapProxy sunService = new SunSetRiseServiceSoapProxy(config.getSUNSET_SUNRISE_INTEGRATION_URL());
		
    	LatLonDate serviceRequest = new LatLonDate();
    	serviceRequest.setLatitude(0);
    	serviceRequest.setLongitude(0);
    	serviceRequest.setTimeZone(0);
    	serviceRequest.setDay(12);
    	serviceRequest.setMonth(12);
    	serviceRequest.setYear(2017);
    	serviceRequest.setSunRiseTime(0);
    	

    	LatLonDate serviceResponse = callSunService(12,12,2017);
    	
    	System.out.println("Sunrise will be at : " + serviceResponse.getSunRiseTime()); 
    	System.out.println("Sunset will be at : " + serviceResponse.getSunSetTime()); 
    	
    	*/
    	///////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	// call Check Credit Card
    	/*
    	String result = callCheckCreditCardService("Master", "5177271000025237");
    	System.out.println(result);
		*/
    	
    	///////////////////////////////////////////////////////////////////////////////////////////////////////
    	
		// call AirportService to get airport by code
    	/*
		String result = callAirportServiceGetAirportInfoByCode("AMM");
    	System.out.println(result);
		*/
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
    	
		// call AirportService to get airport by country
		
		String result = callAirportServiceGetAirportsByCountry("Jordan");
    	System.out.println(result);
        try {
    	    JAXBContext jaxb; 
    	   Airports airports;


					jaxb = JAXBContext.newInstance(Airports.class);

    	        StringReader reader = new StringReader(result);
    	        airports = (Airports) jaxb.createUnmarshaller().unmarshal(reader);
    	        System.out.println("App.main()");
				} catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    }
		///////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static LatLonDate callSunService(int day, int month, int year) throws RemoteException {
    	// init config 
    	RehlatiConfiguration config = new RehlatiConfiguration();
    	//init the service
    	SunSetRiseServiceSoapProxy sunService = new SunSetRiseServiceSoapProxy(config.getSUNSET_SUNRISE_INTEGRATION_URL());
    	
    	//fill the request
    	LatLonDate serviceRequest = new LatLonDate();
    	serviceRequest.setLatitude(0);
    	serviceRequest.setLongitude(0);
    	serviceRequest.setTimeZone(0);
    	serviceRequest.setDay(day);
    	serviceRequest.setMonth(month);
    	serviceRequest.setYear(year);
    	serviceRequest.setSunRiseTime(0);

    	LatLonDate serviceResponse = new LatLonDate();
    	//call the service and get the needed response
    	serviceResponse = sunService.getSunSetRiseTime(serviceRequest);
    	return serviceResponse;
    }
    
    public static String callCheckCreditCardService(String cardType, String cardNumber) throws RemoteException {
    	// init config 
    	RehlatiConfiguration config = new RehlatiConfiguration();
    	//init the service
    	CCCheckerSoapProxy service = new CCCheckerSoapProxy(config.getCREDIT_CARD_INTEGRATION_URL());
    	
    	//call the service with the request params and get the needed response
    	String validateResult = service.validateCardNumber(cardType, cardNumber);
    	return validateResult;
    }
    
    public static String callAirportServiceGetAirportInfoByCode(String airportCode) throws RemoteException {
    	// init config 
    	RehlatiConfiguration config = new RehlatiConfiguration();
    	//init the service
    	AirportSoapProxy service = new AirportSoapProxy(config.getAIRPORT_INTEGRATION_URL());
    	
    	//call the service with the request params and get the needed response
    	String airportInfoResult = service.getAirportInformationByAirportCode(airportCode);
    	return airportInfoResult;
    }
    
    
    public static String callAirportServiceGetAirportsByCountry(String countryName) throws RemoteException {
    	// init config 
    	RehlatiConfiguration config = new RehlatiConfiguration();
    	//init the service
    	AirportSoapProxy service = new AirportSoapProxy(config.getAIRPORT_INTEGRATION_URL());
    	
    	//call the service with the request params and get the needed response
    	String airportInfoResult = service.getAirportInformationByCountry(countryName);
    	return airportInfoResult;
    }
    
    
}
