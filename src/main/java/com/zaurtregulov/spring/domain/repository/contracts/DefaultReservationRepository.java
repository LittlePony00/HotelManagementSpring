package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.Reservation;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultReservationRepository extends DefaultRepository<Reservation> {
}
