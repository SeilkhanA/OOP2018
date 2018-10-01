 public class Person {
    private String name;

    Person(){
        name = "no_name";
    }
    Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

     @Override
     public String toString() {
         return "Name: " + getName() + " //checkOK";
     }

     public boolean equals(Person otherName){
         Person otherPerson = (Person)otherName;
         return this.getName()== otherPerson.getName();
     }

     public static void main (String [] args){
        Person ps = new Person();
        Person ps1 = new Person("Sally");
         String s = ps.toString();
         String s1 = ps1.toString();
         System.out.println(s);
         System.out.println(s1);
             boolean equals = ps1.equals(ps);
            System.out.println(equals);
     }
 }
