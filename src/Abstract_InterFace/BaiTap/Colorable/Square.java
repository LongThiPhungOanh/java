package Abstract_InterFace.BaiTap.Colorable;

public class Square extends Abstract_InterFace.BaiTap.Resizeable.Square implements Colorable {
    String color;
    public Square(double height) {
        super(height);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void howToColor() {
     this.color = color;
     this.chuvi = this.height*4;
    this.dientich = this.height* this.height;
    }
}
