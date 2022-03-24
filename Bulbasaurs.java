
public class Bulbasaurs extends Pokemon{
    public Bulbasaurs(String name, int health, int ac, int power, String attribute) {
        super(name, health, ac, power, attribute);
    }

    @Override
    public void special(Pokemon foe) {
        int combo;
        if (foe.getAttribute()=="water") {combo = hit(foe) * 5;
        }else {combo= hit(foe)*2; }
        foe.setHealth(foe.getHealth() - combo);
        System.out.println("özelsaldırı " + combo + " hasar verdi");
        setMana(5);
    }
}
