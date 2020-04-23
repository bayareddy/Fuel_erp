/**
 * 
 */
package com.wfd.plerp.Service;

import com.wfd.plerp.Entity.Product;

/**
 * @author Ashok
 *
 */
public interface ProductService {

	Product create(Product pProduct);

	Product get(Integer id);

	String delete(Integer id);

	Product update(Product pProduct);

}
