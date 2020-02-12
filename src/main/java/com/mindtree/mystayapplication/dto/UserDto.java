package com.mindtree.mystayapplication.dto;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.mystayapplication.entity.Room;

public class UserDto {
	
	private int userId;
	
	private String userName;


	private String userPhoneNum;

	@JsonIgnoreProperties("user")
	private Room room;

	public UserDto() {
		super();
	}

	public UserDto(int userId, String userName, String userPhoneNum, Room room) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNum = userPhoneNum;
		this.room = room;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNum() {
		return userPhoneNum;
	}

	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhoneNum=" + userPhoneNum + ", room=" + room
				+ "]";
	}


}
