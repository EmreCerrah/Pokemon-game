
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
        player1.info();
        System.out.println("1-Saldır   2-Kaçın");
        int pick =input.nextInt();
        switch (pick) {
            default:
                System.out.println("Lütfen 1 yada 2'ye basınız.");
                break;
            case 1:
                attacking(player1, player2);
                break;
            case 2:
                dodging(player1);
                break;
        }
        if (player2.getHealth()<=0){
            System.out.println("Maçı "+player1.getName()+" kazandı");
            break;
        }
        player2.info();
        System.out.println("1-Saldır   2-Kaçın");
        pick =input.nextInt();
        switch (pick) {
            default:
                System.out.println("Lütfen 1 yada 2'ye basınız.");
                break;
            case 1:
                attacking(player2, player1);
                break;
            case 2:
                dodging(player2);
                break;
        }
        if (player1.getHealth()<=0){
            System.out.println("Maçı "+player2.getName()+" kazandı");
            break;
        }












    }






}

private void dodging(Pokemon player) {
    player.dodge();
}

private void attacking(Pokemon player,Pokemon foe) {
    player.hit(foe);
}

public void intro(){
    System.out.println("START BATTLE");
    System.out.println(player1.getName()+"  VS    "+player2.getName());



}
}