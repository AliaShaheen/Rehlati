package com.rehlati.ejb.util;

import java.util.ResourceBundle;

public class RehlatiConfiguration {

	public static String AIRPORT_INTEGRATION_URL = "";
	public static String CREDIT_CARD_INTEGRATION_URL = "";
	public static String CURRENCY_INTEGRATION_URL = "";
	public static String SUNSET_SUNRISE_INTEGRATION_URL = "";
	public static String TRANSLATOR_INTEGRATION_URL = "";
	public static String WEATHER_INTEGRATION_URL = "";

	public RehlatiConfiguration() {
		this.init();
	}

	private void init() {
		ResourceBundle bundle = ResourceBundle.getBundle("RehlatiConfiguration");
		RehlatiConfiguration.AIRPORT_INTEGRATION_URL = bundle.getString("AIRPORT_INTEGRATION_URL");
		RehlatiConfiguration.CREDIT_CARD_INTEGRATION_URL = bundle.getString("CREDIT_CARD_INTEGRATION_URL");
		RehlatiConfiguration.CURRENCY_INTEGRATION_URL = bundle.getString("CURRENCY_INTEGRATION_URL");
		RehlatiConfiguration.SUNSET_SUNRISE_INTEGRATION_URL = bundle.getString("SUNSET_SUNRISE_INTEGRATION_URL");
		RehlatiConfiguration.TRANSLATOR_INTEGRATION_URL = bundle.getString("TRANSLATOR_INTEGRATION_URL");
		RehlatiConfiguration.WEATHER_INTEGRATION_URL = bundle.getString("WEATHER_INTEGRATION_URL");
	}

	public static String getAIRPORT_INTEGRATION_URL() {
		return AIRPORT_INTEGRATION_URL;
	}

	public static void setAIRPORT_INTEGRATION_URL(String aIRPORT_INTEGRATION_URL) {
		AIRPORT_INTEGRATION_URL = aIRPORT_INTEGRATION_URL;
	}

	public static String getCREDIT_CARD_INTEGRATION_URL() {
		return CREDIT_CARD_INTEGRATION_URL;
	}

	public static void setCREDIT_CARD_INTEGRATION_URL(
			String cREDIT_CARD_INTEGRATION_URL) {
		CREDIT_CARD_INTEGRATION_URL = cREDIT_CARD_INTEGRATION_URL;
	}

	public static String getCURRENCY_INTEGRATION_URL() {
		return CURRENCY_INTEGRATION_URL;
	}

	public static void setCURRENCY_INTEGRATION_URL(
			String cURRENCY_INTEGRATION_URL) {
		CURRENCY_INTEGRATION_URL = cURRENCY_INTEGRATION_URL;
	}

	public static String getSUNSET_SUNRISE_INTEGRATION_URL() {
		return SUNSET_SUNRISE_INTEGRATION_URL;
	}

	public static void setSUNSET_SUNRISE_INTEGRATION_URL(
			String sUNSET_SUNRISE_INTEGRATION_URL) {
		SUNSET_SUNRISE_INTEGRATION_URL = sUNSET_SUNRISE_INTEGRATION_URL;
	}

	public static String getTRANSLATOR_INTEGRATION_URL() {
		return TRANSLATOR_INTEGRATION_URL;
	}

	public static void setTRANSLATOR_INTEGRATION_URL(
			String tRANSLATOR_INTEGRATION_URL) {
		TRANSLATOR_INTEGRATION_URL = tRANSLATOR_INTEGRATION_URL;
	}

	public static String getWEATHER_INTEGRATION_URL() {
		return WEATHER_INTEGRATION_URL;
	}

	public static void setWEATHER_INTEGRATION_URL(String wEATHER_INTEGRATION_URL) {
		WEATHER_INTEGRATION_URL = wEATHER_INTEGRATION_URL;
	}
}
