public abstract class Shape {
    private double length;
    //private double height;
    //private double width;
    private float radius;

    public Shape(){
        length = 1;
        radius = 6;
        /*
        height = 1;
        width = 1;
        radius = 0;
        */

    }
    public double getL(){
        return length;
    }
    public float getR(){
        return radius;
    }

    public Shape(double l){
        this.length = l;

    }
    public Shape(float r){
        this.radius = r;

    }
    public abstract void volume();
    public abstract void surfaceArea();
    public abstract void diagonal();
}
