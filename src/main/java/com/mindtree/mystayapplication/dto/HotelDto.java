package com.mindtree.mystayapplication.dto;

import java.util.List;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.mystayapplication.entity.Room;

public class HotelDto {
	
	
	private int hotelId;
	private String hotelName;
	
	@JsonIgnoreProperties("hotel")
	private List<Room> rooms;
	
	
	public HotelDto() {
		super();
	}


	public HotelDto(int hotelId, String hotelName, List<Room> rooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.rooms = rooms;
	}


	public int getHotelId() {
		return hotelId;
	}


	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public List<Room> getRooms() {
		return rooms;
	}


	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}


	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", rooms=" + rooms + "]";
	}
	
	

}
