package com.zaurtregulov.spring.domain.repository.impl;

import com.zaurtregulov.spring.data.entity.Reservation;
import com.zaurtregulov.spring.domain.repository.contracts.DefaultReservationRepository;
import com.zaurtregulov.spring.domain.repository.contracts.ReservationRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepositoryImpl extends BaseRepository<DefaultReservationRepository> implements ReservationRepository {

    @Override
    public void attachRoom(Reservation reservation) {
        repository.save(reservation);
    }
}
