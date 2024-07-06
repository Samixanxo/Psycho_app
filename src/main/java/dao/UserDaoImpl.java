package dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import user.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	UserJpaSpring userJpa;
	
	 @Override
	    public User getUserFromId(Integer id) {
	        try {
	            Optional<User> optionalUser = userJpa.findById(id);
	            if (optionalUser.isPresent()) {
	                return optionalUser.get();
	            } else {
	               
	                return null; 
	            }
	        } catch (Exception e) {
	            
	            return null; 
	        }
	    }

}
