package mobile.shop.management.system;

import java.util.Scanner;

public class main 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MobileShop shop = new MobileShop();
        int choice;

        do {
            System.out.println("\n===== Mobile Shop Menu =====");
            System.out.println("1. Add Latest Launch");
            System.out.println("2. Add Regular Stock");
            System.out.println("3. Display Mobiles");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Mobile ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Brand Name: ");
                    String brand1 = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price1 = sc.nextDouble();

                    shop.insertAtHead(id1, brand1, price1);
                    break;

                case 2:
                    System.out.print("Enter Mobile ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Brand Name: ");
                    String brand2 = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price2 = sc.nextDouble();

                    shop.insertAtTail(id2, brand2, price2);
                    break;

                case 3:
                    shop.display();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}