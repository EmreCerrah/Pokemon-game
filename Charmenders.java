
public class Charmenders extends Pokemon{
    public Charmenders(String name, int health, int ac, int power, String attribute) {
        super(name, health, ac, power,attribute);
    }
    @Override
    public void special(Pokemon foe){
        int combo;
        if (foe.getAttribute()=="grass") {combo = hit(foe) * 5;
       }else {combo= hit(foe)*2; }
           foe.setHealth(foe.getHealth() - combo);
           System.out.println("özelsaldırı " + combo + " hasar verdi\n");
           setMana(5);
        setAc(super.firstAC);
       }
       }