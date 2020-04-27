/**
 * 
 */
package com.wfd.plerp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wfd.plerp.Entity.ProductType;
import com.wfd.plerp.Service.ProductService;
import com.wfd.plerp.Service.ProductTypeService;

/**
 * @author DELL
 *
 */
@RestController
@RequestMapping(value="/ProductType")
public class ProductTypeController {
	@Autowired
	ProductTypeService productTypeService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ProductType create(@RequestBody ProductType pProductType) {
		return productTypeService.create(pProductType);
	}
	@RequestMapping(method=RequestMethod.PUT)
	public ProductType update(@RequestBody ProductType pProductType) {
		return productTypeService.update(pProductType);
	}
	@RequestMapping(value= {"/id"},method=RequestMethod.GET)
	public ProductType get(@RequestParam Integer id) {
		return productTypeService.get(id);
	}
	@RequestMapping(value= {"/delete"},method=RequestMethod.GET)
	public String delete(@RequestParam Integer id) {
		return productTypeService.delete(id);
	}

}
