package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            products[i] = products[i++];
        }
        products[products.length -1] = null;
        return products;
    }
}
