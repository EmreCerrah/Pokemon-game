
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Pokemon> pokedex=new ArrayList<>();

        pokemonSetup(pokedex);
        switch (opening()) {

            case 1:
                int p = choosePokemon(pokedex);
                startMatch(p,pokedex);
                break;
            case 2:
                int p1 = choosePokemon(pokedex);
                int p2 = choosePokemon(pokedex);
                startMatch(p1,p2,pokedex);
                break;
        }
    }

    private static void startMatch(int i,ArrayList<Pokemon> pokedex) {
        int pick= (int) (Math.random() * pokedex.size());// aynı pokemon seçme sorunu?
        Match round1 = new Match(pokedex.get(i),pokedex.get(pick));
            round1.runPvC();
    }
    private static void startMatch(int i,int j,ArrayList<Pokemon> pokedex){
        Match round1 = new Match(pokedex.get(i),pokedex.get(j));// aynı pokemon seçme sorunu?
        round1.runPvC();
    }

    private static int choosePokemon(ArrayList<Pokemon> pokedex) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir pokemon seçin.");
        for (int i=1; i<=pokedex.size();i++){
            System.out.println(i+"- "+pokedex.get(i-1).getName());
        }
        return input.nextInt()-1;
    }

    public static int opening(){
        Scanner input = new Scanner(System.in);
        System.out.println("POKEMON\nGotta Catch 'Em All!\nLütfen oyuncu satısı seçin.");
        System.out.println("1- Tek oyuncu   2- Çift oyuncu");
        return input.nextInt();
    }
    public static ArrayList<Pokemon> pokemonSetup(ArrayList <Pokemon> pokedex){
        //ArrayList <Pokemon> pokedex = new ArrayList <>();
        Pokemon charmender= new Charmenders("Charmender",70,10,9, "fire");
        Pokemon squirtle= new Squirtles("Squirtle",90,13,5,"water");
        Pokemon bulbasaur= new Bulbasaurs("Bulbasaur",80,8,9,"grass");

        pokedex.add(charmender);
        pokedex.add(squirtle);
        pokedex.add(bulbasaur);


        return pokedex;
    }

}
