package com.zaurtregulov.spring.domain.repository.impl;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.domain.repository.contracts.DefaultGuestRepository;
import com.zaurtregulov.spring.domain.repository.contracts.GuestRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GuestRepositoryImpl extends BaseRepository<DefaultGuestRepository> implements GuestRepository {

    @Override
    public void saveQuest(Guest guest) {
        repository.save(guest);
    }

    @Override
    public Guest getGuestById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<Guest> getAllGuests() {
        return repository.findAll();
    }
}
