package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.Reservation;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;


public interface ReservationRepository {

    void attachRoom(Reservation reservation);
}
