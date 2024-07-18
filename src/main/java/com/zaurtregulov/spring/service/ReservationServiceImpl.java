package com.zaurtregulov.spring.service;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.data.entity.Reservation;
import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelQuota;
import com.zaurtregulov.spring.data.entity.enums.ReservationStatus;
import com.zaurtregulov.spring.domain.dto.GuestDto;
import com.zaurtregulov.spring.domain.dto.ReservationDto;
import com.zaurtregulov.spring.domain.dto.RoomDto;
import com.zaurtregulov.spring.domain.repository.GuestRepository;
import com.zaurtregulov.spring.domain.repository.ReservationRepository;
import com.zaurtregulov.spring.domain.repository.RoomRepository;
import com.zaurtregulov.spring.domain.service.ReservationService;
import com.zaurtregulov.spring.dto.GuestDtoImpl;
import com.zaurtregulov.spring.dto.ReservationDtoImpl;
import com.zaurtregulov.spring.dto.RoomDtoImpl;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final GuestRepository guestRepository;
    private final RoomRepository roomRepository;
    private final ModelMapper modelMapper;

    public ReservationServiceImpl(
            ReservationRepository reservationRepository,
            RoomRepository roomRepository,
            ModelMapper modelMapper,
            GuestRepository guestRepository
    ) {
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
        this.modelMapper = modelMapper;
        this.guestRepository = guestRepository;
    }

    @Override
    @Transactional
    public void bookingRoom(
            HotelBenefit hotelBenefit,
            String description,
            HotelQuota hotelQuota,
            Integer guestId,
            Date check_in,
            Date check_out
    ) {
        boolean isPetsFriendly = hotelBenefit.getBenefitName().equalsIgnoreCase("Room for pets");

        Room room = roomRepository.findRoomByAvailabilityAndIsPetsFriendly(isPetsFriendly).get(0);
        RoomDtoImpl roomDto = modelMapper.map(room, RoomDtoImpl.class);

        Guest guest = guestRepository.findById(guestId);
        guestRepository.save(guest);
        GuestDtoImpl guestDto = modelMapper.map(guest, GuestDtoImpl.class);
        Reservation reservationDto = new Reservation(
                room,
                guest,
                check_in,
                check_out,
                description,
                ReservationStatus.CHECKED_IN,
                hotelQuota,
                hotelBenefit
        );

        reservationRepository.save(modelMapper.map(reservationDto, Reservation.class));
    }
}
