package BaiTapGVGiao;

import java.util.Scanner;
public class MainProduct {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("Nhập số 1 để thêm");
            System.out.println("Nhập số 2 để sửa");
            System.out.println("Nhập số 3 để xóa");
            System.out.println("Nhập số 4 để xem tất cả hàng hóa trong kho");
            System.out.println("Nhập số 5 tim Max price");
            System.out.println("Nhập số 6 tim Min price");
            System.out.println("Nhập số 7 tim Max quantity");
            System.out.println("Nhập số 8 tim Min quantity");
            System.out.println("Nhập số 9 để xem tổng tiền hàng trong kho");
            choice = scanner.nextInt();
       switch (choice){
           case 0:
               break;
           case 1:
               manager.add();
               break;
           case 2:
               manager.edit();
               break;
           case 3:
               manager.delete();
               break;
           case 4:
               manager.getAll();
               break;
           case 5:
               manager.maxPriceProducts();
               break;
           case 6:
               manager.minPriceProducts();
               break;
           case 7:
               manager.mostQuantity();
               break;
           case 8:
               manager.littleQuantity();
               break;
           case 9:
               manager.sumMoney();
               break;
           default:
               System.out.println("vui lòng nhập đúng");
       }
   } while (choice != 0 );
 }













}


