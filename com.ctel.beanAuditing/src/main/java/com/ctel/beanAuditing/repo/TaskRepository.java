package com.ctel.beanAuditing.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctel.beanAuditing.bean.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
