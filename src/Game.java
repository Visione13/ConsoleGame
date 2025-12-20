import java.util.Scanner;

public class Game {
    boolean run = true;

    public void play() {
        while(run){
            printMainMenu();
            getAction();
        }
    }

    public void printMainMenu(){
            System.out.println("Was möchtest du tun?");
            System.out.println("1) Erkunden");
            System.out.println("2) Bergbau");
            System.out.println("3) Schmieden");
            System.out.println("4) Beenden");
    }

    public void getAction(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==1){
            printExploreMenu();
        }
        if(i==4){
            run = false;
        }
    }

    private void printExploreMenu() {
        calcExplore();
    }

    private void calcExplore() {
        double value = Math.random()*10;
        if(value <= 3) {
            System.out.println("Du hast einen Stock gefunden!");
        }
    }
}
