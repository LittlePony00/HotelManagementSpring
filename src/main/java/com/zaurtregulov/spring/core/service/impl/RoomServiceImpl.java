package com.zaurtregulov.spring.core.service.impl;

import com.zaurtregulov.spring.core.service.contracts.RoomService;
import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.domain.dto.RoomDto;
import com.zaurtregulov.spring.domain.repository.contracts.RoomRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Iterable<RoomDto> findAllRoomsByAvailabilityAndPetsFriendly(boolean isPetsFriendly) {
        Set<Room> roomSet = new HashSet<>(roomRepository.findRoomByAvailabilityAndIsPetsFriendly(isPetsFriendly));
        Set<RoomDto> roomDtoSet = new HashSet<>();

        for (Room room : roomSet) {
            roomDtoSet.add(modelMapper.map(room, RoomDto.class));
        }

        return roomDtoSet;
    }

    @Override
    public RoomDto findRoomByNumber(int roomName) {
        return modelMapper.map(roomRepository.findRoomByRoomNumber(roomName), RoomDto.class);
    }

    @Override
    public void updateRoomAvailability(int roomNumber, Boolean isAvailable) {
        roomRepository.changeAvailability(roomNumber, isAvailable);
    }
}
