public class Cylinder extends Shape {
    private double height;

    private Cylinder(){
        super();
        height = 3;
    }
    private Cylinder(double l){
        super(l);
        //this.height = height;
    }
    @Override
    public double getL(){
        return height;
    }

    public void volume(){
        double v = Math.PI * Math.pow(getR(),2.0) * getL();
        System.out.println("Volume is " + v);
    }
    public void surfaceArea(){
        double s = (2 * Math.PI * Math.pow(getR(),2.0)) +
                (2 * Math.PI * getR() * getL());
        System.out.println("Surface is " + s);
    }
    public void diagonal(){
        double d = Math.sqrt(Math.pow(getL(),2.0) + (2 * 2 * Math.pow(getR(),2.0)));
        System.out.println("Diagonal is " + d);
    }

    public static void main (String[] args){
        Cylinder cl = new Cylinder();
        cl.volume();
        cl.surfaceArea();
        cl.diagonal();
    }
}
