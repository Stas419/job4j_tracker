package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        int num = 0;
        for (int i = 0; i < products.length; i++) {
            if(products[i].equals(index)){
                products[i] = products[i++];
            }
        }
        return products;
    }

    public static void main(String[] args) {
        int[] mas = new int[]{0,1,2,3,4,5};
        int num = 0;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == 1){
                mas[i] = mas[i++];
            }

            System.out.println(mas[i]);
        }

    }
}
