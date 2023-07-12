package Abstract_InterFace.BaiTap.Resizeable;

public class Circle implements Resizeable{
double radius;
double dientich;
double chuvi;
public Circle(){}
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDientich() {
        return dientich;
    }
    public void setDientich(double dientich) {
        this.dientich = dientich;
    }
    public double getChuvi() {
        return chuvi;
    }
    public void setChuvi(double chuvi) {
        this.chuvi = chuvi;
    }
    public Circle(double radius) {
        this.radius = radius;
        this.chuvi = 2*3.14*radius;
        this.dientich = 3.14 * (radius * radius);
    }
    @Override
    public void resize(double percen) {
        this.radius = radius * percen;
        this.chuvi = 2*3.14*radius;
        this.dientich = 3.14 * (radius * radius);
    }

}
