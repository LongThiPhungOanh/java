package Abstract_InterFace.BaiTap.Colorable;

public class Main {
    public static void main(String[] args) {
        Square[] geometry = new Square[3];
        geometry[0] = new Square(20);
        geometry[1] = new Square(30);
        geometry[2] = new Square(10);
        geometry[1].setColor("pink");
        System.out.println("màu: " + geometry[1].getColor());
        geometry[1].howToColor();
        System.out.println("Chu vi: " + geometry[1].chuvi);
        System.out.println("dien tich" + geometry[1].dientich);

    }
}
