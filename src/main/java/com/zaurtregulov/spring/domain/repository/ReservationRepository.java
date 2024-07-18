package com.zaurtregulov.spring.domain.repository;

import com.zaurtregulov.spring.data.entity.Reservation;
import com.zaurtregulov.spring.dto.ReservationDtoImpl;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository {

    @Transactional
    void save(Reservation reservation);
}
