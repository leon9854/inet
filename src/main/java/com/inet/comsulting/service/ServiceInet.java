package com.inet.comsulting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inet.comsulting.model.Product;
import com.inet.comsulting.repository.IInetDao;

@Service
public class ServiceInet {
	
	@Autowired
	public IInetDao iInetDao;
	
	@Autowired
	public Product productP;
	
	Optional<Product> optProduct;
	
	public int tprice;
	
	public Optional<Product> getProductById(Long id){
		
		return iInetDao.findById(id);
	}
	
	public List<Product> getAllProduct(){
		return iInetDao.findAll();
	}
	
	public void saveProduct(Product product) {
		
		Product saveproduct =iInetDao.save(product);
		
	}
	
	public void deleteProductById(Long id ) {
		iInetDao.deleteById(id);
	}
	
	public int totalprice(Long id) {
		optProduct = iInetDao.findById(id);
		tprice = optProduct.get().getPrice();
		return tprice*2;
	}
}
