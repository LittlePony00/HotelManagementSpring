package com.zaurtregulov.spring.core.service.impl;

import com.zaurtregulov.spring.core.service.contracts.GuestService;
import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.domain.dto.GuestDto;
import com.zaurtregulov.spring.domain.repository.contracts.GuestRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
public class GuestServiceImpl implements GuestService {


    @Autowired
    GuestRepository guestRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public void registerGuest(GuestDto guestDto) {
        Guest guest = modelMapper.map(guestDto, Guest.class);
        guestRepository.saveQuest(guest);
    }

    @Override
    public GuestDto findGuestById(Long id) {
        return modelMapper.map(guestRepository.getGuestById(id), GuestDto.class);
    }

    @Override
    public Iterable<GuestDto> findAllGuests() {
        Set<Guest> setGuest = new HashSet<>(guestRepository.getAllGuests());
        Set<GuestDto> guestDtoSet = new HashSet<>();

        for (Guest guest : setGuest) {
            guestDtoSet.add(modelMapper.map(guest, GuestDto.class));
        }

        return guestDtoSet;
    }
}
