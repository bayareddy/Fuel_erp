/**
 * 
 */
package com.wfd.plerp.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wfd.plerp.Entity.Product;
import com.wfd.plerp.Service.ProductService;

/**
 * @author DELL
 *
 */
@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(method = RequestMethod.POST)
	public Product create(@RequestBody Product pProduct) {
		return productService.create(pProduct);
	}

	@RequestMapping(value = { "/id" }, method = RequestMethod.GET)
	public Product get(@RequestParam Integer id) {
		return productService.get(id);
	}

	@RequestMapping(value = { "/id" }, method = RequestMethod.DELETE)
	public String delete(@RequestParam Integer id) {
		return productService.delete(id);
	}
	@RequestMapping(method=RequestMethod.PUT)
	public Product update(@RequestBody Product pProduct) {
		return productService.update(pProduct);
	}
}
