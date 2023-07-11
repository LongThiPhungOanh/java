package KeThua.BaiTap.Point2D_Point3D;

public class TestPoint2D extends Point2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println("đối tượng 1 : " + point2D);
        String s = point2D.toString();
        System.out.println("trả mảng " + s);
        Point2D object = new Point2D(5,5);
        System.out.println("đối tượng 2 : " + object);
        String str = object.toString();
        System.out.println("trả mảng " + str);

    }
}
