package KeThua.BaiTap.Point2D_Point3D;

public class Point3D extends Point2D {
    float z;
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float getXYZ(float arr[]) {
        return arr[3];
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(float x, float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(){}
    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
