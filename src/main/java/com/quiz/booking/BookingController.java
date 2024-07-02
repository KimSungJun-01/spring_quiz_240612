package com.quiz.booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.booking.bo.BookingBO;
import com.quiz.booking.domain.Booking;

@RequestMapping("/booking")
@Controller
public class BookingController {
	
	@Autowired
	private BookingBO bookingBO;
	
	// 예약 목록 화면
	// http://localhost:8080/booking/booking-list-view
	@GetMapping("/booking-list-view")
	public String bookingListView(Model model) {
		
		// DB insert
		List<Booking> bookingList = bookingBO.getBookingList();
		
		// Model에 담기
		model.addAttribute("bookingList", bookingList);
		
		return "booking/bookingList";
	}
}