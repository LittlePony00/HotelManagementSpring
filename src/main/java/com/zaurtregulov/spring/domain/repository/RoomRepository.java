package com.zaurtregulov.spring.domain.repository;

import com.zaurtregulov.spring.data.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository {

    List<Room> findRoomByAvailabilityAndIsPetsFriendly(boolean isPetsFriendly);

    Room findRoomByRoomNumber(Integer roomNumber);
}
