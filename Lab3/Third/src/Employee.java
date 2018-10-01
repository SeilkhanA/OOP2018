import java.util.Objects;

public class Employee extends Person {
    //private String emplName;
    private double salary;
    private int year;
    private String insuranceNumber;

    Employee(){
    }
     Employee(String name,double salary,int year, String insuranceNumber){
        super(name);
        this.year = year;
        this.salary = salary;
        this.insuranceNumber = insuranceNumber;
    }
    public double getSalary(){
        return salary;
    }
    public int getYear(){
        return year;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }

    public String toString(){
        return "Employee's name:\t" + getName() +"\n"+
                "Income:   \t" + getSalary()+"\n" +
                "Year of intrance:\t" + getYear() + "\n" +
                "Insurance number:\t" + getInsuranceNumber() + "\n";
    }
    public boolean equals(Person otherSalary){
        Employee otherEmployee = (Employee) otherSalary;
        return this.getSalary()== ((Employee) otherSalary).getSalary();
    }
    public boolean equals1(Person otherYear){
        Employee otherEmployee1 = (Employee) otherYear;
        return this.getYear()== ((Employee) otherYear).getYear();
    }
}