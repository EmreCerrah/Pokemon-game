public class Pokemon {

    private String name;
    private int health;
    private int ac;
    private int power;
    protected int dodgeChance;

    public Pokemon(String name, int health, int ac, int power) {
        this.name = name;
        this.health = health;
        this.ac = ac;
        this.dodgeChance=ac;
        this.power = power;
    }

    public int hit(){
        int combo= (int) (Math.random() * (10))+power;
        ac=dodgeChance;
        return combo;
    }

    public void dodge(){
        ac+=5;
    }

public void info(){
    System.out.println("Tur Sırası "+ name);
    System.out.print("Can : "+health+" ");
    System.out.println("kaçınma şansı : %"+ac);

}

    public int getDodgeChance() {
        return dodgeChance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
