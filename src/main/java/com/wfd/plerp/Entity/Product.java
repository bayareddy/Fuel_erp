/**
 * 
 */
package com.wfd.plerp.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Ashok
 *
 */
@Entity
@Table(name="product")
public class Product  extends BaseEntity{
	
	@ManyToOne(cascade=CascadeType.ALL , fetch=FetchType.EAGER)
	ProductType productType;
	
	@Column
	private String name;
	@Column
	private String description;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
