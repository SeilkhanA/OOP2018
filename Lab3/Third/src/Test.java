public class Test {
    public static void main (String [] args){
        Employee p1 = new Employee("Filip", 156878.87, 2012, "2234");
        Employee p2 = new Employee("Alice",156878.87, 2013, "7642");
        // Employee p3 = new Employee();
        String s1 = p1.toString();
        String s2 = p2.toString();

        System.out.println("IT Department\n\n" +"1. " + s1);
        System.out.println("2. " + s2);
        boolean equals = p1.equals(p2);
        boolean equals1 = p1.equals1(p2);
        System.out.println(equals + "\n" + equals1 + "\n");

        Manager mn = new Manager("Sally", 200000.0, 2009, "7878", "Achievers");
        Manager mn1 = new Manager("Hary", 200000, 2010, "6545", "Rocks");
        String s = mn.toString();
        String ss = mn1.toString();
        System.out.println(s + " " + "(" + p1.getName() + ", " + p2.getName() + ")");

        mn1.bonus();
        mn.bonus();
    }
}
