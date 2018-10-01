public class Manager extends Employee {

    private String team;


    Manager(){
        team = "no_name";
    }

     Manager(String name, double salary,int year,String insuranceNumber,String team){
        super(name,salary,year,insuranceNumber);
        this.team = team;
    }

    public String getTeam(){
        return team;
    }
    public String toString(){
        return "Manager of department:\t" + getName()+"\n"+
                "Income:   \t" + getSalary()+"\n" +
                "Year of intrance:\t" + getYear() + "\n" +
                "Insurance number:\t" + getInsuranceNumber() + "\n" +
                "Team:\t" + getTeam();
    }
    public boolean equals(Person otherTeam){
        Manager otherManager = (Manager) otherTeam;
        return this.getTeam()== ((Manager) otherTeam).getTeam();
    }

    public void bonus(){
        if(getYear() <= 2009){
            System.out.println("Team of " + getName() + " gets bonuses to salary " +
                    "in size of 20000.");
        }
    }
    public static void main (String [] args){
        Manager mn1 = new Manager("Hary", 200000, 2010, "6545", "Rocks");
        Manager mn = new Manager("Sally", 200000.0, 2009, "7878", "Achievers");
        String s = mn.toString();
        String ss = mn1.toString();
        boolean equals = s.equals(ss);
        System.out.println(s + "\n" + ss + "\n" + equals);
        mn1.bonus();
        mn.bonus();

    }

}
