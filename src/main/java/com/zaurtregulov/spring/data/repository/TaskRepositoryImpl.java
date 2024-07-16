package com.zaurtregulov.spring.data.repository;

import com.zaurtregulov.spring.data.entity.Task;
import com.zaurtregulov.spring.domain.repository.TaskRepository;

public class TaskRepositoryImpl extends BaseRepository<Task, Long> implements TaskRepository {
}
