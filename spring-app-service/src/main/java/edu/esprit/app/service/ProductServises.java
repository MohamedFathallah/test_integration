package edu.esprit.app.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.dao.IProductDAO;
import edu.esprit.app.entities.Product;

@Transactional
public class ProductServises implements IProductServices {
	IProductDAO ProductDAO;

	public IProductDAO getProductDAO() {
		return ProductDAO;
	}

	public void setProductDAO(IProductDAO productDAO) {
		ProductDAO = productDAO;
	}

	@Override
	public void addProduct(Product P) {
		ProductDAO.addProduct(P);

	}

	@Override
	public void removeProduct(int id) {
		ProductDAO.removeProduct(id);

	}

	@Override
	public void updateProduct(Product P) {
		ProductDAO.updateProduct(P);

	}

	@Override
	public Product findProductById(int id) {
		return ProductDAO.findProductById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return ProductDAO.getAllProducts();
	}

}
