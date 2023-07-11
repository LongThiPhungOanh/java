package KeThua.BaiTap.Point_MoveablePoint;

public class TestPoint{
    public static void main(String[] args) {
        Point object = new Point(1,1);
        System.out.println(" object 1: " +object);
        String s = object.toString();
        System.out.println(s);
        Point object1 = new Point();
        System.out.println(" object 2: " + object1);
        String str = object1.toString();
        System.out.println(str);
    }
}
