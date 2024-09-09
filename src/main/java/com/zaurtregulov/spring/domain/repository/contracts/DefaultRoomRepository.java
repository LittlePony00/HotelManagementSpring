package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DefaultRoomRepository extends DefaultRepository<Room> {

    @Query(value = "SELECT * FROM room WHERE availability = true AND is_pets_friendly = :isPetsFriendly", nativeQuery = true)
    List<Room> findRoomByAvailabilityAndIsPetsFriendly(@Param(value = "isPetsFriendly") boolean isPetsFriendly);

    @Query(value = "SELECT * FROM room WHERE room.room_number = :roomNumber", nativeQuery = true)
    Room findRoomByRoomNumber(@Param(value = "roomNumber") int roomNumber);
}
