package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product.Product;

import java.util.Arrays;


public class ProductBasket {
    private Product[] products = new Product[5];
    private int count;

    public ProductBasket() {
        this.products = new Product[5];
        this.count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getName() + ": " + products[i].getPrice());
        }
        System.out.println("Итого: " + getTotalPrice());
    }

    public boolean containsProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < count; i++) {
            products[i] = null;
        }
        count = 0;
    }

    @Override
    public String toString() {
        return "ProductBasket{" +
                "products=" + Arrays.toString(products) +
                ", count=" + count +
                '}';
    }
}






