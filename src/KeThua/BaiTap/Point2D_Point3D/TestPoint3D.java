package KeThua.BaiTap.Point2D_Point3D;

public class TestPoint3D extends Point3D {
    public static void main(String[] args) {
        Point3D object3 = new Point3D(5,5,5);
        System.out.println("đối tượng 2 : " + object3);
        String str = object3.toString();
        System.out.println("trả mảng " + str);
        Point3D point3D = new Point3D();
        System.out.println("đối tượng 1 : " + point3D);
        String s = point3D.toString();
        System.out.println("trả mảng " + s);
    }
}
