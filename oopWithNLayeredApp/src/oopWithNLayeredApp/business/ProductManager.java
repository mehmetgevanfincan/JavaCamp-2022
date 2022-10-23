package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	//Give me a productDao when a product is added.
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		//Business rules
		if (product.getUnitPrice()<10) {
			throw new Exception("The product price cannot be less than 10");
		}
		
		//ProductDao productDao = new JdbcProductDao();
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}

//dependency injection
//response request pattern
//While a layer is using another layer's class, it should only access from the interface.