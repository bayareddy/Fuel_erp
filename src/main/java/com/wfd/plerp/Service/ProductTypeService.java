/**
 * 
 */
package com.wfd.plerp.Service;

import com.wfd.plerp.Entity.ProductType;

/**
 * @author DELL
 *
 */
public interface ProductTypeService {

	ProductType create(ProductType pProductType);

	ProductType update(ProductType pProductType);

	ProductType get(Integer id);

	String delete(Integer id);

}
