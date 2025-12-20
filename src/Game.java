import Items.Item;
import Items.Stick;

import java.util.Scanner;

public class Game {
    Player player = new Player("Alice");
    boolean run = true;

    public void play() {
        while(run){
            printMainMenu();
            getAction();
        }
    }

    public void printMainMenu(){
        System.out.print("\n \n \n \n \n");
        System.out.println("Was möchtest du tun?");
        System.out.println("1) Erkunden");
        System.out.println("2) Bergbau");
        System.out.println("3) Schmieden");
        System.out.println("4) Inventar Öffnen");
        System.out.println("5) Beenden");
    }

    public void getAction(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==1){
            calcExplore();
        }else if(i==4){
            for (Item item : player.getItems()){
                System.out.println(item.getName());
            }
        }else if(i==5){
            run = false;
        }
    }

    private void calcExplore() {
        double value = Math.random()*10;
        if(value <= 3) {
            System.out.println("Du hast einen Stock gefunden!");
            player.addItem(new Stick());
        }
    }
}
