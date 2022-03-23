public class Pokemon {

    private String name;
    private int health;
    private int ac;
    private int power;
    final int firstAC;

    public Pokemon(String name, int health, int ac, int power) {
        this.name = name;
        this.health = health;
        this.ac = ac;
        this.firstAC=ac;
        this.power = power;
    }

    public void hit(Pokemon foe){
        int combo= (int) (Math.random() * (10))+power;
        ac=firstAC;
        int d20= (int) (Math.random() * (20))+power;
        if (d20>foe.getAc()){
            foe.setHealth(foe.getHealth()-combo);
            System.out.println(name+" "+combo+" hasar verdi"+"\n");}
        else System.out.println(name+" hasar veremedi \n");
    }

    public void dodge(){
        ac+=7;
    }

    public void info(){
        System.out.println("Tur Sırası "+ name);
        System.out.print("Can : "+health+" ");
        System.out.println("kaçınma şansı : %"+ac);

}


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAc() {
        return ac;
    }

}
