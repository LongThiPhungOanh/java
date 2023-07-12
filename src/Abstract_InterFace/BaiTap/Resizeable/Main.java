package Abstract_InterFace.BaiTap.Resizeable;

public class Main {
    public static void main(String[] args) {
        Rectangle[] recs = new Rectangle[3];
        recs[0] = new Rectangle(20,30);
        recs[1] = new Rectangle(20,30);
        recs[2] = new Rectangle(20,30);
        for(Rectangle re: recs){
            double randomSize = Math.random()*0 *100;
            System.out.println("before: " + re);
            re.resize(randomSize);
            System.out.println("after: " + re);
            System.out.println("---------------------------------------------------");
        }
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(20);
        circles[1] = new Circle(20);
        circles[2] = new Circle(20);
        for(Circle circle: circles){
            double randomSize = Math.random()*0 *100;
            System.out.println("before: " + circle);
            circle.resize(randomSize);
            System.out.println("after: " + circle);
            System.out.println("---------------------------------------------------");
        }
        Square[] squares = new Square[3];
        squares[0] = new Square(20);
        squares[1] = new Square(20);
        squares[2] = new Square(20);
        for(Square square: squares){
            double randomSize = Math.random()*0 *100;
            System.out.println("before: " + square);
            square.resize(randomSize);
            System.out.println("after: " + square);
        }
    }
}
