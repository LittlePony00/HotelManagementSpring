package com.zaurtregulov.spring.network.contollers;

import com.zaurtregulov.spring.core.service.contracts.RoomService;
import com.zaurtregulov.spring.domain.dto.RoomDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("/room/findAllRoomsByAvailabilityAndPetsFriendly/{isPetsFriendly}")
    Iterable<RoomDto> findAllRoomsByAvailabilityAndPetsFriendly(@PathVariable boolean isPetsFriendly) {
        return roomService.findAllRoomsByAvailabilityAndPetsFriendly(isPetsFriendly);
    }

    @GetMapping("/room/{number}")
    RoomDto findRoomByNumber(@PathVariable int number) {
        return roomService.findRoomByNumber(number);
    }
}
