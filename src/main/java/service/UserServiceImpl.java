package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TaskDao;
import dao.UserDao;
import user.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;

	@Override
	public User getUserFromId(Integer id) {
		
		return dao.getUserFromId(id);
	}

}
