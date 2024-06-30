package dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import model.Task;


public interface TaskJpaSpring extends JpaRepository<Task,Integer> {

	@Query("SELECT t FROM Task t WHERE t.user.id = :userId")
	List<Task> findByUserId(@Param("userId") Integer userId);

}
