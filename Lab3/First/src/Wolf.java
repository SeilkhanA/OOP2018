public class Wolf extends Animal {
    private String detachment;
    private String clan;
    private int lifeExp;

    public Wolf(){
        super();
        detachment = "Predator";
        clan = "Wolf";
        lifeExp = 8;
    }

    public Wolf(String phylum, String klass, String detachment, String clan, int lifeExp){
        super(phylum, klass);
        this.detachment = detachment;
        this.clan = clan;
        this.lifeExp = lifeExp;
    }

    public String getDetachment(){
        return detachment;
    }
    public String getClan(){
        return clan;
    }
    public int getLifeExp(){
        return lifeExp;
    }
    /*
    public void setDetachment(String newDetachment){
        detachment = newDetachment;
    }
    public void setClan(String newClan){
        clan = newClan;
    }
    public void setLifeExp(int newLifeExp){
        lifeExp = newLifeExp;
    }
    */
    @Override
    public String getPhylum(){
        return "Chordata" + "\n";
    }

    @Override
    public String getKlass(){
        return "Mammalia";
    }

    public void print(){
        System.out.println("Detachment: " + getDetachment() + "\n" +
                "Clan: " + getClan() + "\n" + "Life Expactancy: " + getLifeExp() + " years");
    }
    public void print(int a, int b){
        int sum = a + b;
        System.out.println("Population in Kazakhstan and Russia: " + sum);
    }

    public static void main (String [] args){
        Animal anim = new Wolf();
        System.out.println("Wolf");
        System.out.println("Phylum: " + anim.getPhylum() + "Class: " + anim.getKlass());
        ((Wolf) anim).print();
        ((Wolf) anim).print(90000,45000);
    }
}
