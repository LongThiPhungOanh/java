package KeThua.BaiTap.Point_MoveablePoint;

public class MoveablePoint extends Point{
    float xSpeed;
    float ySpeed;
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){}
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float setSpeed(float[] arr) {
        return arr[2];
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ", x=" + x + ", y=" + y;
    }
}
