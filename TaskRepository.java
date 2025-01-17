package projeto.list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.list.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
