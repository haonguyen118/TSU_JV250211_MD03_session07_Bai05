package ProductManager;

import java.util.ArrayList;
import java.util.List;

class Products {
     String id;
     String name;
     double price;

    Products(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "San pham {" + "id = " + id + ", Ten = " + name + ", Gia = " + price + '}';
    }
}
 class ProductManager {
    List<Products> products = new ArrayList<>();

    void addProduct(String id, String name, double price) {
        products.add(new Products(id, name, price));
        System.out.println("San pham da duoc them thanh cong");

    }
    void displayProducts() {
       if (products.isEmpty()) {
           System.out.println("Khong co san pham nao trong danh sach");
           return;
       }
       for (Products product : products) {
           System.out.println(product);
       }
    }
    void updateProduct(String id, String name, double price) {
        for (Products product : products) {
            if(product.id.equals(id)){
                if(name != null){
                    product.name = name;
                }
                if(price >= 0) product.price = price;
                System.out.println("San pham da duoc cap nhat thanh cong");
                return;
            }
        }
        System.out.println("San pham khong ton tai");
    }
    void deleteProduct(String id) {
        for (Products product : products) {
            if(products.equals(id)){
                products.remove(product);
                System.out.println("San pham da duoc xoa thanh cong");
                return;
            }
        }
        System.out.println("San pham khong ton tai");
    }

}
