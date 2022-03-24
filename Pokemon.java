
public abstract class Pokemon {

    private String name;
    private int health;
    private int ac;
    private int power;
    final int firstAC;
    private int mana;
    private String attribute;
    public Pokemon(String name, int health, int ac, int power, String attribute) {
        this.name = name;
        this.health = health;
        this.ac = ac;
        this.firstAC = ac;
        this.power = power;
        this.mana = 3;
        this.attribute=attribute;
    }
    public void attack(Pokemon foe){
        int combo=hit(foe);
        if (combo>0){foe.setHealth(foe.getHealth()-combo);
            System.out.println(name+" "+combo+" hasar verdi"+"\n");}
        else System.out.println(name+" hasar veremedi \n");
        ac=firstAC;
        mana++;
    }

    public int hit(Pokemon foe){
        int combo= (int) (Math.random() * (10))+power;
        int d20= (int) (Math.random() * (20))+power;
        if (d20> foe.getAc()){
            return combo;
        }else return 0;
    }

    public void dodge(){
        ac+=7;
    }

    public void info(){
        System.out.println("Tur Sırası "+ name);
        System.out.print("Can : "+health+" ");
        System.out.println("kaçınma şansı : "+ac);
        System.out.println("mana : "+mana);

}
   void special(Pokemon foe){

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

    public void setMana(int mana) {
        this.mana -= mana;
    }

    public int getMana() {
        return mana;
    }

    public String getAttribute() {
        return attribute;
    }
}
