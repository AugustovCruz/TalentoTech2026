package org.ecommerce.dao;

import org.ecommerce.model.Product;

import java.util.List;

public interface ProductDAO {

    public void add(Product p);

    public void delete(int id);

    public Product searchId (int id);

    public void update(Product p);

    public List<Product> listarTodos();

}