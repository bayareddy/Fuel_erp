/**
 * 
 */
package com.wfd.plerp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfd.plerp.Entity.User;
import com.wfd.plerp.Repositiory.UserRepositiory;

/**
 * @author Ashok
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepositiory userRepositiory;

	@Override
	public User create(User pUser) {
		return userRepositiory.save(pUser) ;
	}

	@Override
	public User get(Integer userId) {
		return userRepositiory.findById(userId).get();
	}

	@Override
	public User update(User pUser) {
		return userRepositiory.save(pUser);
	}

	@Override
	public String delete(Integer userId) {
		 userRepositiory.deleteById(userId);
		 return userId + " User deleted succes fully";
	}

}
