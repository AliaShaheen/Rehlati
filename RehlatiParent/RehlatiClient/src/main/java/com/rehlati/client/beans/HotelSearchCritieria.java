package com.rehlati.client.beans;

import java.io.Serializable;
import java.util.Date;

/*
 * @author alias
 */
public class HotelSearchCritieria implements Serializable{

	
	private static final long serialVersionUID = 4153898535119474326L;
	

	private long regionId;
	String destinationName;
	private Date startDate;
	private Date endDate;
	int ratingMax;
	int ratingMin;
	double starMax;
	double starMin;
	
	public long getRegionId() {
		return regionId;
	}

	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}



	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getRatingMax() {
		return ratingMax;
	}

	public void setRatingMax(int ratingMax) {
		this.ratingMax = ratingMax;
	}

	public int getRatingMin() {
		return ratingMin;
	}

	public void setRatingMin(int ratingMin) {
		this.ratingMin = ratingMin;
	}

	public double getStarMax() {
		return starMax;
	}

	public void setStarMax(double starMax) {
		this.starMax = starMax;
	}

	public double getStarMin() {
		return starMin;
	}

	public void setStarMin(double starMin) {
		this.starMin = starMin;
	}

}
