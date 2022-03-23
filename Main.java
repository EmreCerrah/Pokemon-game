import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner intext = new Scanner(System.in);
        Pokemon charmender= new Pokemon("Charmender",70,10,7);
        Pokemon squirtle= new Pokemon("Squirtle",90,13,3);
        Pokemon bulbasaur= new Pokemon("Bulbasaur",80,8,7);

        Pokemon [] pokedex= {charmender,squirtle,bulbasaur};

        System.out.println("POKEMON\nGotta Catch 'Em All!\nLütfen pokemon seçin.");
        System.out.println("1- "+charmender.getName()+"\n2- "+squirtle.getName()+"\n3- "+bulbasaur.getName());

        int choose = intext.nextInt();

        Match round1= new Match(pokedex[choose-1], squirtle);
        round1.run();
    }
}