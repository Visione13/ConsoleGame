import java.util.LinkedList;
import Items.*;

public class Player {

    String name = "";
    int maxHp = 10;
    int currentHp= 10;
    int money = 0;
    LinkedList<Item> items = new LinkedList<Item>();

    public Player(String name){
        this.name = name;
    }

    public void setMoney(int amount) {
        this.money = amount;
    }

    public void setCurrentHp(int hp) {
        this.currentHp = hp;
    }

    public void setMaxHp(int hp) {
        this.maxHp = hp;
    }

    public int getCurrentHp() {
        return this.currentHp;
    }

    public int getMoney() {
        return this.money;
    }

    public void addItem(Item item) {
        this.items.addLast(item);
    }

    public LinkedList<Item> getItems(){
        return items;
    }
}
