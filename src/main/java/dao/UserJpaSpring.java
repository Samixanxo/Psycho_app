package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import user.User;

public interface UserJpaSpring extends JpaRepository<User, Integer> {

}
