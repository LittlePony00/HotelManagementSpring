package com.zaurtregulov.spring.network.contollers;

import com.zaurtregulov.spring.core.service.contracts.GuestService;
import com.zaurtregulov.spring.core.service.contracts.ReservationService;
import com.zaurtregulov.spring.core.service.contracts.RoomService;
import com.zaurtregulov.spring.domain.dto.ReservationDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
public class ReservationRoomController {

    @Autowired
    ReservationService reservationService;

    @Autowired
    RoomService roomService;

    @PostMapping("/book")
    @Transactional
    public ResponseEntity<String> bookRoom(@RequestBody ReservationDto reservationDto) {
        try {
            reservationService.bookingRoom(reservationDto);
            roomService.updateRoomAvailability(reservationDto.getRoomNumber(), false);

            return ResponseEntity.ok("Guest was added and room was attached to this guest");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.toString());
        }
    }
}

