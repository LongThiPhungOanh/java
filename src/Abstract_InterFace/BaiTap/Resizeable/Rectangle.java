package Abstract_InterFace.BaiTap.Resizeable;

public class Rectangle implements Resizeable{

    private double with;
    private double height;

    private double dientich;
    private double chuvi;

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
        this.dientich = this.with* this.height;
        this.chuvi  = (this.with + this.height)*2;
    }

    @Override
    public void resize(double percen) {
        this.height = height*percen;
        this.with = with*percen;
        this.chuvi = (this.with + this.height)*2;
        this.dientich = this.with * this.height;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "with=" + with +
                ", height=" + height +
                ", dientich=" + dientich +
                ", chuvi=" + chuvi +
                '}';
    }
}
