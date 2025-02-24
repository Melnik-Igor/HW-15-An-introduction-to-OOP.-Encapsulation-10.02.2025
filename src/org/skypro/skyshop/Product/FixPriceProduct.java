package org.skypro.skyshop.Product;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE = 80;

    public FixPriceProduct(String name) {
        super(name);
    }
    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return getName() + ": Фиксированная цена " + FIX_PRICE + " руб.";
    }
}
