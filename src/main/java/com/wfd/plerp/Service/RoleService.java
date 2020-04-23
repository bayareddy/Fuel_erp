/**
 * 
 */
package com.wfd.plerp.Service;

import com.wfd.plerp.Entity.Role;

/**
 * @author Ashok
 *
 */
public interface RoleService {

	Role create(Role pRole);

	Role update(Role pRole);

	Role get(Integer roleId);

	String delete(Integer roleId);

}
