package KeThua.BaiTap.Point_MoveablePoint;

public class TestMoveablePoint{
    public static void main(String[] args) {
        MoveablePoint object = new MoveablePoint(10,10);
        System.out.println(" object 1: " +object);
        String s = object.toString();
        System.out.println(s);
        MoveablePoint object1 = new MoveablePoint();
        System.out.println(" object 2: " + object1);
        String str = object1.toString();
        System.out.println(str);
     }

}
