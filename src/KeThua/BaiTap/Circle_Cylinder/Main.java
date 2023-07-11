package KeThua.BaiTap.Circle_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10,"hồng");
        Cylinder cylinder = new Cylinder(10,10);
        String a = circle.toString();
        System.out.println(a);
        System.out.println(circle.getArea());
        String b = cylinder.toString();
        System.out.println(b);
        System.out.println(cylinder.theTich());
    }
}
