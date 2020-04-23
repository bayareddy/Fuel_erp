/**
 * 
 */
package com.wfd.plerp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfd.plerp.Entity.Role;
import com.wfd.plerp.Repositiory.RoleRepositiory;

/**
 * @author Ashok
 *
 */
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleRepositiory roleRepositiory;

	@Override
	public Role create(Role pRole) {
		return roleRepositiory.save(pRole);
	}

	@Override
	public Role update(Role pRole) {
		return roleRepositiory.save(pRole);
	}

	@Override
	public Role get(Integer roleId) {
		return roleRepositiory.findById(roleId).get();
	}

	@Override
	public String delete(Integer roleId) {
		 roleRepositiory.deleteById(roleId);
		 return roleId + "  Role id Deleted sucessful" ;
 	}

}
