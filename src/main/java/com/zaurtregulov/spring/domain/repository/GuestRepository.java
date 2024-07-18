package com.zaurtregulov.spring.domain.repository;

import com.zaurtregulov.spring.data.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository {

    public Guest findById(Integer id);

    void save(Guest guest);
}
