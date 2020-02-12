package com.mindtree.mystayapplication.dto;

import java.sql.Date;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.mystayapplication.entity.Room;
import com.mindtree.mystayapplication.entity.User;

public class BookingDto {
	
	
private int bookingId;
	
	@JsonIgnoreProperties("user")
	private Room room;
	
	@JsonIgnoreProperties("room")
	private User user;
	
	private Date bookingDate;

	public BookingDto() {
		super();
	}

	public BookingDto(int bookingId, Room room, User user, Date bookingDate) {
		super();
		this.bookingId = bookingId;
		this.room = room;
		this.user = user;
		this.bookingDate = bookingDate;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

}
