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
@Table(name="Role")
public class Role extends BaseEntity {
	
	@Column
	private String roleName;
	@Column
	private String description;
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
