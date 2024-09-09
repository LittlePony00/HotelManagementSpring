package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RoomRepository {

    List<Room> findRoomByAvailabilityAndIsPetsFriendly(boolean isPetsFriendly);

    Room findRoomByRoomNumber(int roomNumber);

    void changeAvailability(int roomNumber, Boolean isAvailable);
}
