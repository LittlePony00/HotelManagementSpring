package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultTaskRepository extends DefaultRepository<Task> {

}
