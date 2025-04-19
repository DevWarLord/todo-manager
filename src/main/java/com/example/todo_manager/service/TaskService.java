package com.example.todo_manager.service;


import com.example.todo_manager.model.Task;
import com.example.todo_manager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);
    }

    public Task addTask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task task){
        task.setId(id);
        return taskRepository.save(task);
    }


    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

}
