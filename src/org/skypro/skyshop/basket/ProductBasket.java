package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product.Product;
import java.util.Arrays;

public class ProductBasket {
    private final Product[] products;
    private int count;

    public ProductBasket() {
        this.products = new Product[10];
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
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return;
        }

        int total = 0;
        int specialCount = 0;

        for (int i = 0; i < count; i++) {
            Product product = products[i];
            System.out.println(product); // Используем переопределенный toString()
            total += product.getPrice();

            if (product.isSpecial()) {
                specialCount++;
            }
        }

        System.out.println("Итого: " + total + " руб.");
        System.out.println("Специальных товаров: " + specialCount);
    }

    public boolean containsProduct(String name) {
        for (Product product : products) {
            if (product != null && product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        Arrays.fill(products, null);
        count = 0;
        System.out.println("Корзина очищена.");
    }

}






