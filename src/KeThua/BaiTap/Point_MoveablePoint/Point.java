package KeThua.BaiTap.Point_MoveablePoint;

public class Point {
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
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point(){}
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
