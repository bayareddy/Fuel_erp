/**
 * 
 */
package com.wfd.plerp.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfd.plerp.Entity.Product;

/**
 * @author Ashok
 *
 */
public interface ProductRepositiory extends JpaRepository<Product	,Integer> {

}
