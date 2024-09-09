package com.zaurtregulov.spring.network.contollers;

import com.zaurtregulov.spring.core.service.contracts.GuestService;
import com.zaurtregulov.spring.domain.dto.GuestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {

    @Autowired
    GuestService guestService;

    @GetMapping("/guest/findAll")
    Iterable<GuestDto> getGuests() {
        return guestService.findAllGuests();
    }

    @GetMapping("/guest/{id}")
    GuestDto getGuestById(@PathVariable Long id) {
        return guestService.findGuestById(id);
    }

}
