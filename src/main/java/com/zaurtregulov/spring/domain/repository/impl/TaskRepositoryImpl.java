package com.zaurtregulov.spring.domain.repository.impl;

import com.zaurtregulov.spring.data.entity.Task;
import com.zaurtregulov.spring.domain.repository.contracts.DefaultTaskRepository;
import com.zaurtregulov.spring.domain.repository.contracts.TaskRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepositoryImpl extends BaseRepository<DefaultTaskRepository> implements TaskRepository {
}
