package com.mindtree.mystayapplication.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.mystayapplication.dto.BookingDto;
import com.mindtree.mystayapplication.dto.RoomDto;
import com.mindtree.mystayapplication.dto.UserDto;
import com.mindtree.mystayapplication.exception.ServiceException;

@Service
public interface MyStayApplicationService {

	/**
	 * @param roomType
	 * @return list of rooms
	 */
	List<RoomDto> getAllRoomsForParticularRoomTypeFromDB(String roomType);

	/**
	 * @param bookingDate
	 * @param userDto
	 * @param roomId
	 * @return inserted if succesfully inserted to db
	 * @throws ServiceException
	 */
	String insertToBookingAndUserTable(Date bookingDate, UserDto userDto, int roomId) throws ServiceException;

	/**
	 * @param roomId
	 * @return booking details
	 */
	BookingDto fetchBookingDetailsForParticularRoomIdfromDb(int roomId);

}
