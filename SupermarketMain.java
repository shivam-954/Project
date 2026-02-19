package supermarket;

import java.util.Scanner;

public class SupermarketMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();
        int choice;

        do {
            System.out.println("\n--- SUPERMARKET MENU ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Stock");
            System.out.println("4. Delete Product");
            System.out.println("5. Search Product by ID");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Category: ");
                    String cat = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    service.addProduct(name, cat, price, stock);
                    break;

                case 2: service.viewProducts(); break;
                case 3:
                    System.out.print("Product ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Stock: ");
                    int newStock = sc.nextInt();
                    service.updateStock(id, newStock);
                    break;
                case 4:
                    System.out.print("Product ID: ");
                    service.deleteProduct(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Product ID: ");
                    service.searchProduct(sc.nextInt());
                    break;
                case 6:
                    System.out.println("👋 Exiting system...");
                    break;
                default:
                    System.out.println("⚠️ Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
