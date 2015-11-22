package edu.esprit.app.service;

import java.util.List;

import edu.esprit.app.entities.Product;

public interface IProductServices {
	
	void addProduct (Product P);
	void removeProduct (int id);
	void updateProduct (Product P);
	Product findProductById (int id);
	List<Product>  getAllProducts ();

}
