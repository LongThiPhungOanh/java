package KeThua.BaiTap.Triangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Màu");
        String color = input.nextLine();
        System.out.println("Độ dài đáy");
        int side1 = input.nextInt();
        System.out.println("Chiều cao cạnh A");
        int side2 = input.nextInt();
        System.out.println("Chiều cao cạnh B");
        int side3 = input.nextInt();
        Triangle object = new Triangle(side1,side2,side3,color);
        System.out.println("diện tích: " + object.getArea());
        System.out.println("chu vi: " + object.getPerimeter());
        System.out.println("Màu: " + object.color);
        String display = object.toString();
        System.out.println(display);
    }
}
