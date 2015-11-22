package edu.esprit.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.entities.Product;

@Transactional
public class ProductDAO implements IProductDAO {
	
	
	@PersistenceContext
	EntityManager em;
	
	

	@Override
	public void addProduct(Product P) {
		em.persist(P);
		

	}

	@Override
	public void removeProduct(int id) {
		em.remove(this.findProductById(id));

	}

	@Override
	public void updateProduct(Product P) {
		em.merge(P);

	}

	@Override
	public Product findProductById(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public List<Product> getAllProducts() {
		return em.createQuery("select P from Product P",Product.class).getResultList();
	}

}
