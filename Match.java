
import java.util.Scanner;

public class Match {
    public static Scanner input;
        Pokemon player1;
        Pokemon player2;
    public Match(Pokemon p1,Pokemon p2){
        this.player1= p1;
        this.player2=p2;
    }
    public void run(){
        input = new Scanner(System.in);
        boolean play=true;
        intro();

        while (play){
            action(player1, player2);
            if (isWin(player1,player2))break;
            action(player2, player1);
            if (isWin(player2,player1))break;












        }






    }
    private void action(Pokemon player, Pokemon foe) {
        player.info();
        System.out.print("1-Saldır   2-Kaçın");
        if (player.getMana() > 5) System.out.println("   3- özel");
        System.out.println();
        int pick = input.nextInt();
        switch (pick) {
            default:
                System.out.println("Lütfen 1 yada 2'ye basınız.");
                break;
            case 1:
                player.attack(foe);
                break;
            case 2:
                player.dodge();
                break;
            case 3:
                if (player.getMana() > 5) player.special(foe);
                else System.out.println("Mana yeterli değil");
            }
        }
    private boolean isWin(Pokemon player, Pokemon foe) {
        boolean win = false;
        if (foe.getHealth() <= 0) {
            System.out.println("Maçı " + player.getName() + " kazandı");
            win = true;
        }
        return win;
    }

    public void intro(){
        System.out.println("START BATTLE");
        System.out.println(player1.getName()+"  VS    "+player2.getName());
    }
}
