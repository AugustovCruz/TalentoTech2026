package org.ecommerce;


import org.ecommerce.model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingresa el nombre del producto a cargar");
        String name = teclado.nextLine();

        System.out.println("Ingresa el precio del producto");
        Double price = teclado.nextDouble();

        System.out.println("Ingresa el stock del producto");
        int stock = teclado.nextInt();

        Product prod = new Product( name, price, stock);
        

        System.out.println("el nombre del producto ingresado es:" +prod.getName());
        System.out.println("El precio del produco es:" +prod.getPrice() );
        System.out.println("El stock del producto es:" +prod.getStock());
        System.out.println("ID DEL PRODUCTO:--- " +prod.getId());

        Product prod2 = new Product("Otro producto", 50.0, 3);
        System.out.println("ID de prod: " + prod.getId());
        System.out.println("ID de prod 2: " + prod2.getId());

    }
}