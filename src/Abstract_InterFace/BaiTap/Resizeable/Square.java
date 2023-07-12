package Abstract_InterFace.BaiTap.Resizeable;

public class Square implements Resizeable{
    public double height;
    public double chuvi;
    public double dientich;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getChuvi() {
        return chuvi;
    }
    public void setChuvi(double chuvi) {
        this.chuvi = chuvi;
    }
    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public Square(double height) {
        this.height = height;
        this.chuvi = this.height*4;
        this.dientich = this.height* this.height;
    }

    @Override
    public void resize(double percen) {
        this.height = height * percen;
        this.chuvi = height*4;
        this.dientich = height* height;
    }
}
