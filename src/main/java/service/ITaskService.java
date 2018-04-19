package service;

import java.util.List;
import java.util.Optional;

import entity.Task;

public interface ITaskService {

	List<Task> findAll();
	Optional<Task> findOne(Long id);
	Task create(Task task);
}
