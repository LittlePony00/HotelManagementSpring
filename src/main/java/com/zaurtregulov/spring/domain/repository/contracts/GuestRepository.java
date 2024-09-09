package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GuestRepository {

    void saveQuest(Guest guest);

    Guest getGuestById(Long id);

    List<Guest> getAllGuests();
}
