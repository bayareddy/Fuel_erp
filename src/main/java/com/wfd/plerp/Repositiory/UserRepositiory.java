/**
 * 
 */
package com.wfd.plerp.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfd.plerp.Entity.User;

/**
 * @author Ashok
 *
 */
public interface UserRepositiory extends JpaRepository<User, Integer>{

}
