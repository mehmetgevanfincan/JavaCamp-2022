package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao  {
	public void add(Product product) {
		//just and just DB access codes are written here... SQL
		System.out.println("Added to database with Hibernate");
	}
}
