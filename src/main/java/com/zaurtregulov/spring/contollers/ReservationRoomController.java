package com.zaurtregulov.spring.contollers;

import com.zaurtregulov.spring.data.entity.models.BookingRequest;
import com.zaurtregulov.spring.domain.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
public class ReservationRoomController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationRoomController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/book")
    public ResponseEntity<String> bookingRoom(@RequestBody BookingRequest request) {
        reservationService.bookingRoom(
                request.getHotelBenefits(),
                request.getDescription(),
                request.getHotelQuota(),
                request.getGuestId(),
                request.getCheckIn(),
                request.getCheckOut()
        );
        return ResponseEntity.ok("Room booked successfully");
    }
}

