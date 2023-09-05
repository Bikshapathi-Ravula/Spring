package com.ctel.beanAuditing.contrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.beanAuditing.bean.Task;
import com.ctel.beanAuditing.repo.ReportRepositary;
import com.ctel.beanAuditing.repo.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;
@Autowired ReportRepositary repot;

    @PostMapping("/t")
    public Map<Task> createTask(@RequestBody Task task) {
    	
        return taskRepository.save(task);
    }

    @GetMapping("/getAll")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id).orElse(null);
    }
}
