package KeThua.BaiTap.Circle_Cylinder;

public class Circle {
     double radius;
     String color;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public Circle(){}

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
public double getArea(){
        double sum = 3.14 * (radius* radius);
        return sum;
}

    @Override
    public String toString() {
        return "Circle " +
                "radius = " + radius +
                ", color = '" + color + '\'' ;
    }
}
