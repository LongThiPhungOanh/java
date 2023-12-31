package KeThua.BaiTap.Point2D_Point3D;

public class Point2D {
    float x;
    float y;
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getXY(float[] arr) {
     return arr[2];
    }
    public void setXY(float y, float x) {
        this.y = y;
        this.x = x;
    }
    public Point2D(){}
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point2D{" + "x=" + x + ", y=" + y + '}';
    }
}
