import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        Product product1 = new Product("DT01","Iphone 12",35500000);
        Product product2 = new Product("DT02","Samsung Galaxy Note 10",8990000);
        Product product3 = new Product("DT03","B-phone B86s",9990000);
        Product product4 = new Product("DT04","Xiaomi Mi 11",16690000);
        Product product5 = new Product("DT05","Oppo Reno 5",10650000);
        System.out.println("Test add");
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);
        productManager.addProduct(product5);
        productManager.display();
        System.out.println("Test edit");
        productManager.editById("DT07",scanner);
        productManager.editById("DT02",scanner);
        productManager.display();
        System.out.println("Test delete");
        productManager.deleteByID("DY00");
        productManager.deleteByID("DT03");
        productManager.display();
        System.out.println("Test search by name");
        productManager.displayByName("Iphone 12");
        productManager.displayByName("Nokia 1290");
        System.out.println("Test sort");
        productManager.sortByPrice();
        productManager.display();
    }
}
