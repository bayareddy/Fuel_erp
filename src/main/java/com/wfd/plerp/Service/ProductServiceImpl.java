/**
 * 
 */
package com.wfd.plerp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfd.plerp.Entity.Product;
import com.wfd.plerp.Repositiory.ProductRepositiory;

/**
 * @author DELL
 *
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepositiory productRepositiory;

	@Override
	public Product create(Product pProduct) {
		return productRepositiory.save(pProduct);
	}

	@Override
	public Product get(Integer id) {
		return productRepositiory.findById(id).get();
	}

	@Override
	public String delete(Integer id) {
		productRepositiory.deleteById(id);
		return id +"  Deleted product id succesfully";
	}

	@Override
	public Product update(Product pProduct) {
		return productRepositiory.save(pProduct);
	}

}
