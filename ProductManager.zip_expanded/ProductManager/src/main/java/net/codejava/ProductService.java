package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> listaAll(){
		return repository.findAll();
	}
	
	public void save(Product product) {
		repository.save(product);
	}
	
	public Product get(Long id) {
		return repository.findById(id).get();
	}
	
	public 	void delete(Long id) {
		repository.deleteById(id);
	}
}
