/**
 * 
 */
package com.wfd.plerp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wfd.plerp.Entity.Role;
import com.wfd.plerp.Service.RoleService;

/**
 * @author Ashok
 *
 */
@RestController
@RequestMapping(value="/Role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.POST)
	public Role create(@RequestBody Role pRole) {
		return roleService.create(pRole);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.PUT)
	public Role update(@RequestBody Role pRole) {
		return roleService.update(pRole);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET)
	public Role get(@RequestParam Integer roleId) {
		return roleService.get(roleId);
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.DELETE)
	public String delete(@RequestParam Integer roleId) {
		return roleService.delete(roleId);
	}
}
