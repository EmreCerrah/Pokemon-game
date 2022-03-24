
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pokemon charmender= new Charmenders("Charmender",70,10,9, "fire");
        Pokemon squirtle= new Squirtles("Squirtle",90,13,5,"water");
        Pokemon bulbasaur= new Bulbasaurs("Bulbasaur",80,8,9,"grass");

        Pokemon [] pokedex= {charmender,squirtle,bulbasaur};

        System.out.println("POKEMON\nGotta Catch 'Em All!\nLütfen pokemon seçin.");
        System.out.println("1- "+charmender.getName()+"\n2- "+squirtle.getName()+"\n3- "+bulbasaur.getName());

        int choose = input.nextInt();

        Match round1= new Match(pokedex[choose-1], bulbasaur);
        round1.run();
    }
}
