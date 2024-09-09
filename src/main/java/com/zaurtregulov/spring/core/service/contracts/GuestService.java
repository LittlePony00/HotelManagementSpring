package com.zaurtregulov.spring.core.service.contracts;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.domain.dto.GuestDto;

import java.util.List;

public interface GuestService {

    void registerGuest(GuestDto guest);

    GuestDto findGuestById(Long id);

    Iterable<GuestDto> findAllGuests();
}
