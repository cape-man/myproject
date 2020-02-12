package com.mindtree.mystayapplication.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING_DETAILS")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BOOKING_ID")
	private int bookingId;
	
	@OneToOne
	@JoinColumn(name= "ROOM_ID")
	private Room room;
	
	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	private Date bookingDate;

	public Booking() {
		super();
	}

	public Booking(int bookingId, Room room, User user, Date bookingDate) {
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
