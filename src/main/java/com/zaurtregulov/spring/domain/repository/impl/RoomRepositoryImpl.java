package com.zaurtregulov.spring.domain.repository.impl;

import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.domain.repository.contracts.DefaultRoomRepository;
import com.zaurtregulov.spring.domain.repository.contracts.RoomRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomRepositoryImpl extends BaseRepository<DefaultRoomRepository> implements RoomRepository {

    @Override
    public List<Room> findRoomByAvailabilityAndIsPetsFriendly(boolean isPetsFriendly) {
       return repository.findRoomByAvailabilityAndIsPetsFriendly(isPetsFriendly);
    }

    @Override
    public Room findRoomByRoomNumber(int roomNumber) {
        return repository.findRoomByRoomNumber(roomNumber);
    }

    @Override
    public void changeAvailability(int roomNumber, Boolean isAvailable) {
        Room room = repository.findRoomByRoomNumber(roomNumber);
        room.setAvailability(isAvailable);

        repository.save(room);
    }
}
