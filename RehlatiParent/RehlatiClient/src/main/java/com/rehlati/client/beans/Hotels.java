package com.rehlati.client.beans;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author alias
 */

public class Hotels {

	 @JsonProperty("Hotel")
	List<Hotel> hotels;

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
}
