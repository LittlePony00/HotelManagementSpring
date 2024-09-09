package com.zaurtregulov.spring.core.service.impl;

import com.zaurtregulov.spring.core.service.contracts.ReservationService;
import com.zaurtregulov.spring.data.entity.Reservation;
import com.zaurtregulov.spring.domain.dto.ReservationDto;
import com.zaurtregulov.spring.domain.repository.contracts.ReservationRepository;
import com.zaurtregulov.spring.domain.repository.contracts.RoomRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void bookingRoom(ReservationDto reservationDto) {
        Reservation reservation = modelMapper.map(reservationDto, Reservation.class);
        boolean isRoomAvailable = roomRepository.findRoomByRoomNumber(reservationDto.getRoomNumber()).isAvailability();

        if (isRoomAvailable) {
            reservationRepository.attachRoom(reservation);
        } else {
            throw new IllegalArgumentException("The room has already attached to another guest");
        }
    }
}
