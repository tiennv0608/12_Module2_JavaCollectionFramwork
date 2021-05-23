import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> lists;

    public ProductManager() {
        lists = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> lists) {
        this.lists = lists;
    }

    public void addProduct(Product product) {
        lists.add(product);
    }

    public int searchByID(String id) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkByID(String id) {
        int index = searchByID(id);
        if (index != -1) {
            return true;
        }
        return false;
    }

    public void editById(String id, Scanner scanner) {
        int index = searchByID(id);
        if (checkByID(id)) {
            System.out.println("Nhap ID moi");
            lists.get(index).setId(scanner.nextLine());
            System.out.println("Nhap ten moi");
            lists.get(index).setName(scanner.nextLine());
            System.out.println("Nhap gia moi:");
            lists.get(index).setPrice(scanner.nextInt());
        } else {
            System.out.println("Khong tim thay san pham");
        }
    }

    public void deleteByID(String id) {
        int index = searchByID(id);
        if (checkByID(id)) {
            lists.remove(index);
        } else {
            System.out.println("Khong tim thay san pham");
        }
    }

    public void display() {
        for (Product product : lists) {
            System.out.println(product);
        }
    }

    public int searchByName(String name) {
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkByName(String name) {
        int index = searchByName(name);
        if (index != -1) {
            return true;
        }
        return false;
    }

    public void displayByName(String name) {
        int index = searchByName(name);
        if (!checkByName(name)) {
            System.out.println("Khong tim thay san pham");
        } else {
            System.out.println(lists.get(index));
        }
    }
    public void sortByPrice(){
        Collections.sort(lists, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
    }
}
