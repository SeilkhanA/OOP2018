public class Cube extends Shape {

    private double height;
    private double width;

    private Cube(){
        super();
        height = 2;
        width = 2;
    }
    public Cube(double l){
        super(l);
        /*
        this.height = height;
        this.length = length;
        this.width = width;
        */
    }
    public double getL(){
        return 2.0;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void volume(){
        double v = getWidth() * getHeight() * getL();
        System.out.println("Volume is " + v);
    }
    public void surfaceArea(){
        double a = 6 * (getWidth() * getL());
        System.out.println("Surface area is " + a);
    }
    public void diagonal(){
        double d = getL() * Math.sqrt(3.0);
        System.out.println("Diagonal is " + d);
    }

    public static void main (String [] args){
        Cube sh = new Cube();
        System.out.println("CUBE" + "\n" +"-------------");
        sh.volume();
        sh.surfaceArea();
        sh.diagonal();
    }

}