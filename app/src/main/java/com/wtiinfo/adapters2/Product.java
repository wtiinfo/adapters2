package com.wtiinfo.adapters2;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static List<Product> getProdutos() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Computador", 1456.94));
        products.add(new Product("Televisor", 4459.28));
        products.add(new Product("DVD Player", 456.9));
        products.add(new Product("Playstation 4", 3156.12));
        products.add(new Product("XBox Series S", 3356.95));
        products.add(new Product("Playstation 3", 1226.94));
        products.add(new Product("Playstation 2", 459.28));
        products.add(new Product("XBox360", 556.9));
        products.add(new Product("Smart TV Samsung", 3156.12));
        products.add(new Product("Blueray", 2356.95));
        products.add(new Product("Notebook Premium", 1456.94));
        products.add(new Product("Furadeira", 459.28));
        products.add(new Product("Liquidificador", 56.9));
        products.add(new Product("Radio relogio", 16.12));
        products.add(new Product("Microfone", 6.95));
        products.add(new Product("Camera", 456.94));
        products.add(new Product("Impressora 3d", 2459.28));
        products.add(new Product("Multifuncional", 46.9));
        products.add(new Product("Ventilador", 56.12));
        products.add(new Product("Processador i5", 2356.95));
        products.add(new Product("AMD Ryzen 6", 1456.94));
        products.add(new Product("Memoria RAM 16GB", 559.28));
        products.add(new Product("HD 1TB", 456.9));
        products.add(new Product("Monitor", 3156.12));
        products.add(new Product("Teclado", 2356.95));
        return products;
    }
}
