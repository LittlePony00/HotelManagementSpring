package com.zaurtregulov.spring.data.repository;

import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.domain.repository.RoomRepository;

import java.util.List;

public class RoomRepositoryImpl extends BaseRepository<Room, Integer> implements RoomRepository {

    @Override
    public List<Room> findRoomByAvailabilityAndIsPetsFriendly(boolean isPetsFriendly) {
        String sql = "SELECT * FROM room WHERE availability = true AND is_pets_friendly = :isPetsFriendly";
        List<Room> rooms = entityManager.createNativeQuery(sql, Room.class)
                .setParameter("isPetsFriendly", isPetsFriendly)
                .getResultList();

        if (rooms.isEmpty()) {
            throw new IllegalArgumentException("Таких комнат больше не осталось");
        }

        return rooms;
    }

    @Override
    public Room findRoomByRoomNumber(Integer roomNumber) {
        String sql = "SELECT * FROM room WHERE room.room_number = :roomNumber";
        List<Room> rooms = entityManager.createNativeQuery(sql, Room.class)
                .setParameter("roomNumber", roomNumber)
                .setMaxResults(1)
                .getResultList();

        if (rooms.isEmpty()) {
            throw new IllegalArgumentException("Такой комнаты больше не осталось");
        }

        return rooms.get(0);
    }
}
