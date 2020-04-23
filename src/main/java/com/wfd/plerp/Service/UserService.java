/**
 * 
 */
package com.wfd.plerp.Service;

import com.wfd.plerp.Entity.User;

/**
 * @author Ashok
 *
 */
public interface UserService {

	User create(User pUser);

	User get(Integer userId);

	User update(User pUser);

	String delete(Integer userId);

}
