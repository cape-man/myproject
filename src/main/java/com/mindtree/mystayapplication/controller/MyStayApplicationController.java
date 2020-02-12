package com.mindtree.mystayapplication.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.mystayapplication.dto.BookingDto;
import com.mindtree.mystayapplication.dto.RoomDto;
import com.mindtree.mystayapplication.dto.UserDto;
import com.mindtree.mystayapplication.exception.ControllerException;
import com.mindtree.mystayapplication.service.MyStayApplicationService;

@Controller
@SessionAttributes("roomId")
public class MyStayApplicationController {

	@Autowired
	MyStayApplicationService myStayApplicationService;
	ModelAndView modelView = new ModelAndView();
	int Id = 0;

	@RequestMapping("/")
	public ModelAndView firstPage() {
		modelView.setViewName("FrontPage");
		return modelView;

	}

	@RequestMapping("/Rooms/{roomType}")
	public ModelAndView getAllRoomsForParticularRoomTypeFromService(@PathVariable String roomType) {

		System.out.println(roomType);
		List<RoomDto> rooms = new ArrayList<>();
		rooms = myStayApplicationService.getAllRoomsForParticularRoomTypeFromDB(roomType);

		modelView.addObject("rooms", rooms);

		modelView.setViewName("Rooms");
		return modelView;

	}

	@RequestMapping("/Rooms/UserRegistration/{roomId}")
	public ModelAndView UserRegistration(@PathVariable int roomId) {

		System.out.println(roomId);
		modelView.addObject("roomId", roomId);
		modelView.setViewName("UserRegistration");
		return modelView;

	}

	@PostMapping("/Booking/{roomId}")
	public ModelAndView insertToBookingAndUserTable(@RequestParam Date bookingDate, UserDto userDto,
			@PathVariable int roomId) throws ControllerException   {

		myStayApplicationService.insertToBookingAndUserTable(bookingDate, userDto, roomId);
		modelView.setViewName("BookingSummary");
		return modelView;

	}

	@RequestMapping("/BookingSummary/{roomId}")
	public ModelAndView fetchBookingDetailsForParticularRoomIdFromService(@PathVariable int roomId) {
		BookingDto bookingDto = myStayApplicationService.fetchBookingDetailsForParticularRoomIdfromDb(roomId);
		modelView.addObject("bookings", bookingDto);
		modelView.setViewName("BookingHistory");
		return modelView;

	}
	
}
