package org.skypro.skyshop;

import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 25);
        Product orange = new Product("Апельсин", 80);
        Product banana = new Product("Банан", 76);
        Product tomato = new Product("Помидор", 260);
        Product avocado = new Product("Авакадо", 280);


        ProductBasket basket = new ProductBasket();
        basket.addProduct(apple);
        basket.addProduct(orange);
        basket.addProduct(banana);
        basket.addProduct(tomato);
        basket.addProduct(avocado);


        basket.printBasket();

        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());

        System.out.println("Есть ли 'Молоко' в корзине? " + basket.containsProduct("Молоко"));
        System.out.println("Есть ли 'Яблоко' в корзине? " + basket.containsProduct("Яблоко"));

        // Очищаем корзину
        basket.clearBasket();
        System.out.println("Корзина очищена.");

        basket.printBasket();
        System.out.println("Общая стоимость корзины после очистки: " + basket.getTotalPrice());
        System.out.println("Есть ли 'Молоко' в пустой корзине? " + basket.containsProduct("Молоко"));
    }
}