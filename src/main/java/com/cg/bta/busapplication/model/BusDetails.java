package com.cg.bta.busapplication.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "BusDetails")
public class BusDetails {

	// @Pattern(regexp = "[1-9]{1}[0-9]{3}", message = "Bus ID should contain
	// exactly 4 digits")
	@Id
	private Integer busId;

	@NotEmpty(message = "TravelName must not be empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "travel name should contain only alphabets")
	private String busTravelName;

	@NotEmpty(message = "source must not be empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "source name should contain only alphabets")
	private String source;

	@NotEmpty(message = "destination must not be empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "destination name should contain only alphabets")
	private String destination;

	// @Pattern(regexp = "^[1-9]\\d*$", message = "seats should not contain negative
	// values")
	private Integer totalSeats;

	public BusDetails() {
		// TODO Auto-generated constructor stub
	}

	public BusDetails(Integer busId,
			@NotEmpty(message = "TravelName must not be empty") @Pattern(regexp = "^[a-zA-Z]+$", message = "travel name should contain only alphabets") String busTravelName,
			@NotEmpty(message = "source must not be empty") @Pattern(regexp = "^[a-zA-Z]+$", message = "source name should contain only alphabets") String source,
			@NotEmpty(message = "destination must not be empty") @Pattern(regexp = "^[a-zA-Z]+$", message = "destination name should contain only alphabets") String destination,
			Integer totalSeats) {
		super();
		this.busId = busId;
		this.busTravelName = busTravelName;
		this.source = source;
		this.destination = destination;
		this.totalSeats = totalSeats;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusTravelName() {
		return busTravelName;
	}

	public void setBusTravelName(String busTravelName) {
		this.busTravelName = busTravelName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "BusDetails [busId=" + busId + ", busTravelName=" + busTravelName + ", source=" + source
				+ ", destination=" + destination + ", totalSeats=" + totalSeats + "]";
	}

}
