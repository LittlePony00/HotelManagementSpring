package com.zaurtregulov.spring.core.service.contracts;

import com.zaurtregulov.spring.domain.dto.RoomDto;

public interface RoomService {

    Iterable<RoomDto> findAllRoomsByAvailabilityAndPetsFriendly(boolean isPetsFriendly);

    RoomDto findRoomByNumber(int number);

    void updateRoomAvailability(int roomNumber, Boolean isAvailable);
}
