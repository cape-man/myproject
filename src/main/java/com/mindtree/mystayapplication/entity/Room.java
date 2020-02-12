package com.mindtree.mystayapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM_DETAILS")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROOM_ID")
	private int roomId;
	
	private String roomType;
	
	private int amount;
	
	@ManyToOne
	@JoinColumn(name = "HOTEL_ID")
	private Hotel hotel;
	
	@OneToOne(mappedBy = "room")
	private User user;
	
	

	public Room() {
		super();
	}

	public Room(int roomId, String roomType, int amount, Hotel hotel, User user) {
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
