package module5BasicOfOOP.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    static int generateID = 0;

    private int id = generateID++;
    private String name;
    private List<Product> products = new ArrayList<>();
    private int cost;


    private class Product {

        private String name;

        private int cost;


        public Product(String name, int cost) {

            this.name = name;
            this.cost = cost;

        }

        public String getName() {

            return this.name;

        }

        public int getCost() {

            return this.cost;

        }

    }


    public Payment(String name) {

        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addProduct(String productName, int productCost) {

        products.add(new Product(productName, productCost));
        cost += productCost;

    }

    public void print() {


        if (!products.isEmpty()) {

            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Id=   " + id);
            System.out.println("Name= " + name);

            for (Product product : products) {

                System.out.printf("%16s", product.name);
                System.out.printf("%6d", product.cost);
                System.out.println();

            }

            System.out.print("Общая стоимость: ");
            System.out.printf("%11d", cost);
            System.out.println();
            System.out.println("++++++++++++++++++++++++++++++");


        } else {
            System.out.println("В корзине ничего нет");
        }
    }
}
