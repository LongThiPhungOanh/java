package BaiTapGVGiao;

import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    Product cake = new Product(000, "cake",
            7000, 100, "Made in VietNam");
    Product water = new Product(001, "water",
            12000, 100, "Made in VietNam");
    Product lollipop = new Product(002, "lollipop",
            5000, 100, "Made in VietNam");
    Product softDrink = new Product(003, "softDrink",
            15000, 100, "Made in VietNam");
    Product beer = new Product(004, "beer",
            17000, 100, "Made in VietNam");

    Product[] products = {cake, water, lollipop, softDrink, beer};

    @Override
    public String toString() {
        return "Sản phẩm bạn vừa thêm lz" +
                "quantityProduct=" + Arrays.toString(products);
    }
    public void getAll(){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
    public void add(){
        int id = 004;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm bạn muốn thêm");
        int length = scanner.nextInt();
        Product[] newArr = new Product[length];
        for (int i = 1; i <= newArr.length ; i++) {
            id++;
            scanner.nextLine();
            System.out.println("Nhập tên sản phẩm thứ " + i);
            String name = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm thứ " + i);
            int price = scanner.nextInt();
            System.out.println("Nhập số lượng sản phẩm thứ " + i);
            int quantiny = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ghi chú sản phẩm thứ " + i);
            String description = scanner.nextLine();
            System.out.println("Bạn sửa thành công");
            Product product = new Product(id, name, price, quantiny, description);
            newArr[i-1] = product;
        }
        int newLength = products.length + length;
        Product[] tempArr = new Product[newLength];
        for (int i = 0; i < products.length; i++) {
            tempArr[i] = products[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            tempArr[i+ products.length] = newArr[i];
        }
        products = tempArr;
        getAll();
    }
//    public Product[] quantityProduct(){
//      Product[] quantityProductCheck = new Product[myList.length + quantityProduct.length];
//        for (int i = 0; i < myList.length; i++) {
//            quantityProductCheck[i] = myList[i];
//        }
//        for (int i = 0; i < quantityProductCheck.length; i++) {
//            quantityProductCheck[i + myList.length] = quantityProduct[i];
//        }
//       return quantityProduct = quantityProductCheck;
//    }

    public void edit() {
        Boolean contains = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm bạn muốn sửa");
        int checkMaId = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (checkMaId == products[i].getId()) {
                contains = true;
                scanner.nextLine();
                System.out.println("Nhập tên sản phẩm thứ ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm thứ ");
                int price = scanner.nextInt();
                System.out.println("Nhập số lượng sản phẩm thứ ");
                int quantiny = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ghi chú sản phẩm thứ ");
                String description = scanner.nextLine();
                System.out.println("Bạn thêm thành công");
                Product product = new Product(checkMaId, name, price, quantiny, description);
                products[i] = product;
                break;
            }
        }
        if(!contains){
            System.out.println("Not found");
        }
    }
    public void delete(){
        Boolean contains = false;
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm bạn muốn xóa");
        int id = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            if(products[i].getId() == id){
                index = i;
                contains = true;
                break;
            }
        }
        if(!contains){
            System.out.println("Not Found");
        }else {
            Product[] tempArr = new Product[products.length - 1];
            for (int i = 0; i < index; i++) {
                tempArr[i] = products[i];
            }
            for (int i = index; i < products.length-1; i++) {
                tempArr[i] = products[i+1];
            }
            products = tempArr;
    }
    }
        public void maxPriceProducts(){
        Product pMax = products[0];
            for (int i = 1; i < products.length; i++) {
                if(products[i].getPrice() > pMax.getPrice()){
                    pMax = products[i];
                }
            }
            System.out.println("Product have max price is " + pMax);
        }
   public void minPriceProducts(){
       Product pMin = products[0];
       for (int i = 1; i < products.length; i++) {
           if(products[i].getPrice() < pMin.getPrice()){
               pMin = products[i];
           }
       }
       System.out.println("Product have min price is " + pMin);
   }
    public void mostQuantity(){
        Product pMax = products[0];
        for (int i = 1; i < products.length; i++) {
            if(products[i].getQuantity() > pMax.getQuantity()){
                pMax = products[i];
            }
        }
        System.out.println("Product have max quantity is " + pMax);

    }
    public void littleQuantity(){
        Product pMin = products[0];
        for (int i = 1; i < products.length; i++) {
            if(products[i].getQuantity() < pMin.getQuantity()){
                pMin = products[i];
            }
        }
        System.out.println("Product have min quantity is " + pMin);
    }
    public void sumMoney(){
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice() * products[i].getQuantity();
        }
        System.out.println("Total is " + total);
    }
}
