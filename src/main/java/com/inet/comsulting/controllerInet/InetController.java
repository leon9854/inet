package com.inet.comsulting.controllerInet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inet.comsulting.model.Product;
import com.inet.comsulting.service.ServiceInet;

 
@RestController
@RequestMapping("/inet")
public class InetController {
	@Autowired
	public ServiceInet serviceInet;
	
	
	@GetMapping("/products")
	public List<Product>  getProduct() {
		return serviceInet.getAllProduct();	
	}
	@GetMapping("product/{id}")
	public Optional<Product> getById(@PathVariable("id") long id) {
		return serviceInet.getProductById(id);
	}
	@PostMapping("/product")
	public void saveProduct(@RequestBody Product product) {
		serviceInet.saveProduct(product);
	}
	@DeleteMapping("/productDelete/{id}")
	public void deleteById(@PathVariable("id") long id) {
		serviceInet.deleteProductById(id);
	}
	@GetMapping("productTotal/{id}")
	public int totalprice(@PathVariable("id") Long id) {
		return serviceInet.totalprice(id);
	}

}
