package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (Product product : products) {
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;

        for (Product product : products) {
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (Product product : products) {
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println("Проверка работы метода delete. Исходный массив:");
        Product[] productsTestDelete = new Product[5];
        productsTestDelete[0] = new Product("Milk", 10);
        productsTestDelete[1] = new Product("Bread", 4);
        productsTestDelete[2] = new Product("Egg", 19);
        productsTestDelete[3] = new Product("Meat", 13);
        productsTestDelete[4] = new Product("Apple", 3);
        for (Product pr : productsTestDelete) {
            if (pr != null) {
                System.out.println(pr.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println("С помощью метода delete удаляем i=2. И получаем массив:");
        delete(productsTestDelete, 2);
        for (Product pr : productsTestDelete) {
            if (pr != null) {
                System.out.println(pr.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (; index < products.length - 1; index++) {
            Product temp = products[index];
            products[index] = products[index + 1];
            products[index + 1] = temp;
        }
        products[products.length - 1] = null;
        return products;
    }

}