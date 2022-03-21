public class Main {
    public static void main(String[] args) {

        Pokemon charmender= new Pokemon("Charmender",70,10,7);
        Pokemon squirtle= new Pokemon("Squirtle",90,13,3);
        Match round= new Match(charmender,squirtle);
        round.run();
    }
}
