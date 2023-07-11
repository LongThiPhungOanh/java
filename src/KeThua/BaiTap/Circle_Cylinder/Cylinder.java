package KeThua.BaiTap.Circle_Cylinder;

public class Cylinder extends Circle{
      public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public Cylinder(){}
    public Cylinder(double height, double radius){
          this.height = height;
          this.radius = radius;
    }
    public double theTich(){
        double sum = 3.14 * radius * radius * height;
        return sum;
    }

    @Override
    public String toString() {
        return " Cylinder " +
                " height = " + height +
                ", radius = " + radius;
    }
}
