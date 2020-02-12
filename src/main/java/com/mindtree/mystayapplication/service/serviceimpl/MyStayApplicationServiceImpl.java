package com.mindtree.mystayapplication.service.serviceimpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.rowset.serial.SerialException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.mystayapplication.dto.BookingDto;
import com.mindtree.mystayapplication.dto.RoomDto;
import com.mindtree.mystayapplication.dto.UserDto;
import com.mindtree.mystayapplication.entity.Booking;
import com.mindtree.mystayapplication.entity.Room;
import com.mindtree.mystayapplication.entity.User;
import com.mindtree.mystayapplication.exception.ControllerException;
import com.mindtree.mystayapplication.exception.ServiceException;
import com.mindtree.mystayapplication.exception.UserAlreadyBookedForTheDayException;
import com.mindtree.mystayapplication.repository.BookingRepository;
import com.mindtree.mystayapplication.repository.RoomRepository;
import com.mindtree.mystayapplication.repository.UserRepository;
import com.mindtree.mystayapplication.service.MyStayApplicationService;

@Service
public class MyStayApplicationServiceImpl implements MyStayApplicationService {

	@Autowired
	RoomRepository roomRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	BookingRepository bookingRepository;

	ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<RoomDto> getAllRoomsForParticularRoomTypeFromDB(String roomType) {

		List<Room> rooms = new ArrayList<Room>();
		List<RoomDto> roomsDto = new ArrayList<RoomDto>();
		rooms = roomRepository.findAll();
		for (Room room : rooms) {
			if (room.getRoomType().equalsIgnoreCase(roomType)) {
				RoomDto roomDto = modelMapper.map(room, RoomDto.class);
				roomsDto.add(roomDto);
			}
		}

		return roomsDto;
	}

	@Override
	public String insertToBookingAndUserTable(Date bookingDate, UserDto userDto, int roomId) throws ServiceException  {

		int count=0;
		// List<Room> rooms = roomRepository.findAll();
		Optional<Room> rooms1 = roomRepository.findById(roomId);

		List<Booking> bookings =bookingRepository.findAll();
		String hotelName = userDto.getRoom().getHotel().getHotelName();
		System.out.println(hotelName);
//		for (Booking booking : bookings) {
//			if(booking.getBookingDate().compareTo(bookingDate)==0 )
//			{
//				count =1;
//				break;
//			}
//			else {
//				count=0;
//			}
//		}
//		if(count==0)
//		{
			Room room = rooms1.get();
			System.out.println(room);
			Booking booking = new Booking();
			User user = modelMapper.map(userDto, User.class);

			user.setRoom(room);
			booking.setBookingDate(bookingDate);
			booking.setUser(user);
			booking.setRoom(room);
			userRepository.save(user);
			bookingRepository.save(booking);

			return "inserted";
			
			
			
//		}
//		else {
//			System.out.println("error");
//			throw new UserAlreadyBookedForTheDayException("user already booked for that day");
//		
		
		
		
//	}
	}

	@Override
	public BookingDto fetchBookingDetailsForParticularRoomIdfromDb(int roomId) {

		List<Booking> bookings = bookingRepository.findAll();
		BookingDto bookingDto = new BookingDto();
		for (Booking booking : bookings) {
			if (booking.getRoom().getRoomId() == roomId) {
				bookingDto = modelMapper.map(booking, BookingDto.class);
			}

		}
		return bookingDto;

	}

}
