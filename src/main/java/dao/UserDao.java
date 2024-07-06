package dao;

import org.springframework.stereotype.Service;

import user.User;

@Service
public interface UserDao {

	public User getUserFromId(Integer id);
}
