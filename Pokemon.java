public class Pokemon {
    private String name;
    private int health;
    private int ac;
    private int power;

    public Pokemon(String name, int health, int ac, int power) {
        this.name = name;
        this.health = health;
        this.ac = ac;
        this.power = power;
    }

    public void hit(){


    }

    public void dodge(){


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
