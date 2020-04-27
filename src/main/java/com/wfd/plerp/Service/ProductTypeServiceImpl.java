/**
 * 
 */
package com.wfd.plerp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfd.plerp.Entity.ProductType;
import com.wfd.plerp.Repositiory.ProductRepositiory;
import com.wfd.plerp.Repositiory.ProductTypeRepositiory;

/**
 * @author DELL
 *
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {
	@Autowired
	ProductTypeRepositiory productTypeRepositiory;

	@Override
	public ProductType create(ProductType pProductType) {
		return productTypeRepositiory.save(pProductType);
	}

	@Override
	public ProductType update(ProductType pProductType) {
		return productTypeRepositiory.save(pProductType);
	}

	@Override
	public ProductType get(Integer id) {
		return productTypeRepositiory.findById(id).get();
	}

	@Override
	public String delete(Integer id) {
		productTypeRepositiory.deleteById(id);
		return id + "  Delete record succesfully";
	}

}
