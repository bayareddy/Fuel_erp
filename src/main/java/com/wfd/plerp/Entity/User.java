/**
 * 
 */
package com.wfd.plerp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ashok
 *
 */
@Entity
@Table(name="User")
public class User extends BaseEntity {

	@Column
	private String userName;
	@Column
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
