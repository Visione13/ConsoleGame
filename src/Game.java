import java.util.Scanner;

public class Game {

    public void play() {
        printMainMenu();
        getAction();
    }

    public void printMainMenu(){
        System.out.println("Was möchtest du tun?");
        System.out.println("1) Erkunden");
        System.out.println("2) Bergbau");
        System.out.println("3) Schmieden");
    }

    public void getAction(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==1){
            printExploreMenu();
        }
    }

    private void printExploreMenu() {
        calcExplore();
    }

    private void calcExplore() {
        double value = Math.random()*10;
        if(value == 1) {
            System.out.println("Du hast einen Stock gefunden!");
        }
    }
}
