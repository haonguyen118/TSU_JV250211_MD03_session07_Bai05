package ProductManager;

import java.util.Scanner;

public class ManagerApp {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("****Quan ly san pham*****");
            System.out.println("1. Them moi san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Cap nhat san pham");
            System.out.println("4. Xoa san pham");
            System.out.println("5. Thoat");
            System.out.println("Nhap vao lua chon tu 1-5");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ID san pham");
                    String id = sc.nextLine();

                    System.out.println("Nhap name san pham");
                    String name = sc.nextLine();
                    System.out.println("Nhap gia san pham");
                    double price = sc.nextDouble();
                    manager.addProduct(id, name, price);
                    break;
                case 2:
                    manager.displayProducts();

                    break;
                case 3:
                    System.out.println("Nhap ID san pham can cap nhat: ");
                    String updateID = sc.nextLine();
                    System.out.println("Nhap ten moi (hoac de trong de giu nguyen): ");
                    String updateName = sc.nextLine();
                    System.out.println("Nhap gia moi (hoac de trong de giu nguyen): ");
                    double updatePrice = sc.nextDouble();
                    manager.updateProduct(updateID, updateName, updatePrice);
                    break;
                case 4:
                    System.out.println("Nhap ID san pham can xoa: ");
                    String deleteId = sc.nextLine();
                    manager.deleteProduct(deleteId);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui long chon tu 1-5");
            }
        } while (true);
    }
}
