package org.skypro.skyshop;

import org.skypro.skyshop.Product.DiscountedProduct;
import org.skypro.skyshop.Product.FixPriceProduct;
import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.Product.SimpleProduct;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        SimpleProduct apple = new SimpleProduct("Яблоко", 25);
        SimpleProduct orange = new SimpleProduct("Апельсин", 80);
        SimpleProduct banana = new SimpleProduct("Банан", 76);
        SimpleProduct tomato = new SimpleProduct("Помидор", 260);
        SimpleProduct avocado = new SimpleProduct("Авакадо", 280);


        DiscountedProduct discountedApple = new DiscountedProduct("Яблоко", 25, 20);
        DiscountedProduct discountedBanana = new DiscountedProduct("Банан", 76, 20);
        DiscountedProduct discountedTomato = new DiscountedProduct("Помидор", 260, 20);

        FixPriceProduct fixedOrange = new FixPriceProduct("Апельсин");

        ProductBasket basket = new ProductBasket();
        basket.addProduct(apple);
        basket.addProduct(orange);
        basket.addProduct(banana);
        basket.addProduct(tomato);
        basket.addProduct(avocado);
        basket.addProduct(discountedApple);
        basket.addProduct(discountedBanana);
        basket.addProduct(discountedTomato);
        basket.addProduct(fixedOrange);

        basket.printBasket();

        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice() + " руб.");

        System.out.println("Есть ли 'Молоко' в корзине? " + basket.containsProduct("Молоко"));
        System.out.println("Есть ли 'Яблоко' в корзине? " + basket.containsProduct("Яблоко"));

        // Очищаем корзину
        basket.clearBasket();

        basket.printBasket();
        System.out.println("Общая стоимость корзины после очистки: " + basket.getTotalPrice());
        System.out.println("Есть ли 'Молоко' в пустой корзине? " + basket.containsProduct("Молоко"));
    }
}