package dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dto.ResponseTaskDTO;
import dto.TaskDTO;
import model.Task;


public interface TaskJpaSpring extends JpaRepository<Task, Integer> {

	@Query("SELECT new dto.ResponseTaskDTO(t.id, t.name, t.description, t.creationDate, t.dueDate, t.state) " +
		       "FROM Task t WHERE t.user.id = :userId")
	List<ResponseTaskDTO> findByUserId(@Param("userId") Integer userId);
}
