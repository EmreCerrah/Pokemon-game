
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
                    attakinng(player1, player2);
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
                    attakinng(player2, player1);
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

    private void attakinng(Pokemon attacker,Pokemon defender) {
        int a =defender.getHealth();
        int b=attacker.hit();
        int d20=(int) (Math.random()*20)+attacker.getPower();
        if (d20>defender.getAc()){
        defender.setHealth(a-b);
        System.out.println(attacker.getName()+" "+b+" hasar verdi"+"\n");}
        else System.out.println(attacker.getName()+" hasar veremedi \n");

    }

    public void intro(){
        System.out.println("START BATTLE");
        System.out.println(player1.getName()+"  VS    "+player2.getName());



    }
}