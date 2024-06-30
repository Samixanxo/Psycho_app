package user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.UserDTO;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username); 
}
