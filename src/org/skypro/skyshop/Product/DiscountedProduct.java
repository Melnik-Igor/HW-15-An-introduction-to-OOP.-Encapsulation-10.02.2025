package org.skypro.skyshop.Product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discountPercent;

    public DiscountedProduct(String name, int basPrice, int discountePrice) {
        super(name);
        this.basePrice = basPrice;
        this.discountPercent = discountePrice;
    }

    @Override
    public boolean isSpecial(){
        return true;
    }

    @Override
    public int getPrice() {
        return basePrice - (basePrice * discountPercent / 100);
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " руб. (" + discountPercent + "%)";
    }
}

