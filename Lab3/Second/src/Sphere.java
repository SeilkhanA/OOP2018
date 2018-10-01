public class Sphere extends Shape {

    private double radius;

    private Sphere(){
    }

   private Sphere(float r){
        super(r);
    }

    public void volume(){
        double v = 4.0/3 * Math.PI * Math.pow(getR(),3.0);
        System.out.println("Volume is " + v);
    }
    public void surfaceArea(){
        double a = 4 * Math.PI * Math.pow(getR(),2.0);
        System.out.println("Surface area is " + a);
    }
    public void diagonal(){
        double d = 2 * getR();
        System.out.println("Diagonal is " + d);
    }
    public static void main(String [] args){
        Sphere sp = new Sphere();
        sp.volume();
        sp.surfaceArea();
        sp.diagonal();
    }
}
