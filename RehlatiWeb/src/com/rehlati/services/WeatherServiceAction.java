package com.rehlati.services;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.xml.bind.JAXBException;

import com.rehlati.client.beans.Airport;
import com.rehlati.ejb.RehlatiEJB;

/*
 * @author alias
 */

@ManagedBean(name = "weatherServiceAction")
@ViewScoped
public class WeatherServiceAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7931851656891087833L;

	private RehlatiEJB rehlatiEJB = new RehlatiEJB();

	private String country = "Jordan";
	private String city = "Amman";
	private String result;

	@PostConstruct
	public void init() {
		System.out.println("WeatherServiceAction.init()");
	}

	/**
	 * The method in the action that will do the work!
	 */
	public void search() {
		System.out.println("WeatherServiceAction.search() ...  Here we go!");

		try {
			setResult(rehlatiEJB.callWaetherServiceByCountry(getCountry(), getCity()));
		} catch (RemoteException e) {
			FacesMessage message = new FacesMessage("Weather service is not available right now, please try again later.");
	        message .setSeverity(FacesMessage.SEVERITY_ERROR);
	        FacesContext.getCurrentInstance().addMessage(null, message);
		} 
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
