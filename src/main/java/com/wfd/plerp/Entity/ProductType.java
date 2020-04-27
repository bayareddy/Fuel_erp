/**
 * 
 */
package com.wfd.plerp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

/**
 * @author Ashok
 *
 */
@Entity
@Table(name="ProductType")
public class ProductType extends BaseEntity{
	
	@Column
	private String name;
	@Column
	private String discription;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	

}
