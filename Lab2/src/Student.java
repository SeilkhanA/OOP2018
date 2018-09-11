import java.util.concurrent.atomic.AtomicInteger;

public class Student {

    private String name;
    private int id;
    private int year = 1;

    public Student(String name,int id){
        this.name = name;
        this.id = id;
        this.year = 1;

    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }

    public void incrYear(){
        year++;
    }


    public void print(){
        System.out.println("Student's Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Year of study in 2017: " + year);
    }

    /*
    AtomicInteger at = new AtomicInteger(0);

    public int getNextCountValue() {
        return at.incrementAndGet();
    }
    */
    public static void main (String [] args){

        Student st = new Student("Akniet",17110380);
       // System.out.println("Student's Name: " + getName());
        st.print();
        st.incrYear();
        System.out.println("Year of study in 2018: " + st.year);
    }

}
