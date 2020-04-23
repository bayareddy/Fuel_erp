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

import com.wfd.plerp.Entity.User;
import com.wfd.plerp.Service.UserService;

/**
 * @author DELL
 *
 */
@RestController
@RequestMapping(value = "/User")
public class UserController {
	@Autowired
	UserService userService;
	
	@CrossOrigin(origins="*")
	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody User pUser) {
		return userService.create(pUser);
	}
	
	@CrossOrigin(origins="*")
	@RequestMapping(value = { "id" }, method = RequestMethod.GET)
	public User get(@RequestParam Integer userId) {
		return userService.get(userId);
	}
		
	@CrossOrigin(origins="*")
	@RequestMapping(method = RequestMethod.PUT)
	public User update(@RequestBody User pUser) {
		return userService.update(pUser);
	}
	@CrossOrigin(origins="*")
	@RequestMapping(value = { "userDelete" }, method = RequestMethod.GET)
	public String delete(@RequestParam Integer userId) {
		return userService.delete(userId);
	}
}
