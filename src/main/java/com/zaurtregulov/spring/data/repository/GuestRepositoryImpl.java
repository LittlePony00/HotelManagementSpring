package com.zaurtregulov.spring.data.repository;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.domain.repository.GuestRepository;

public class GuestRepositoryImpl extends BaseRepository<Guest, Long> implements GuestRepository {

    @Override
    public Guest findById(Integer id) {
        String jpql = "SELECT g FROM Guest g WHERE g.id = :id";

        return entityManager.createQuery(jpql, Guest.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
