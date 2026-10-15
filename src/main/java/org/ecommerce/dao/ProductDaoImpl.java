package org.ecommerce.dao;

import org.ecommerce.model.Product;


import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDAO{

    List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product p) {
        productList.add(p);
    }

    @Override
    public void delete(int id){
        productList.removeIf(product -> product.getId() == id);
    }

    @Override
    public Product searchId (int id) {
        for (int i=0; i<productList.size(); i++) {
            Product p = productList.get(i); //busco un elemento de la lista por id y devuelvo el objeto
            if(p.getId() == id){
                return p;
            }
        }
        System.out.println("No se encontró el producto en la lista");
        return null;
    }

    @Override
    public void update (Product p){
        //queda guardado el id ya enviado desde afuera al objeto que ingresa por parametro
        Product found = searchId(p.getId());
        if (found != null) {
            found.setName(p.getName());
            found.setPrice(p.getPrice());
            found.setStock(p.getStock());
        } else {
            System.out.println("No se encontró ningún producto con ese ID");
        }
    }

    @Override
    public List<Product> listarTodos() {
        return productList;
    }

}
