package dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dto.TaskDTO;
import model.Task;


public interface TaskJpaSpring extends JpaRepository<Task, Integer> {

	@Query("SELECT new dto.TaskDTO(t.id, t.name, t.description, t.creationDate, t.dueDate, t.state, new dto.UserDTO(t.user.id, t.user.username, t.user.lastname, t.user.firstname, t.user.country, t.user.role)) " +
		       "FROM Task t WHERE t.user.id = :userId")
		List<TaskDTO> findByUserId(@Param("userId") Integer userId);
}
