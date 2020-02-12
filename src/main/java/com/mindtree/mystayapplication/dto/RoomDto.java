package com.mindtree.mystayapplication.dto;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.mystayapplication.entity.Hotel;
import com.mindtree.mystayapplication.entity.User;

public class RoomDto {

private int roomId;
	
	private String roomType;
	
	private int amount;
	
	@JsonIgnoreProperties("rooms")
	private Hotel hotel;
	
	@JsonIgnoreProperties("room")
	private User user;
	
	

	public RoomDto() {
		super();
	}

	public RoomDto(int roomId, String roomType, int amount, Hotel hotel, User user) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.amount = amount;
		this.hotel = hotel;
		this.user = user;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
