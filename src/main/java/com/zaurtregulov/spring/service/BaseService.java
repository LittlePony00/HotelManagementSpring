package com.zaurtregulov.spring.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseService {
    @PersistenceContext
    protected EntityManager entityManager;
}
