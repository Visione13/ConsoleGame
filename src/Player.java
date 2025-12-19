import java.util.LinkedList;
import Items.*;

public class Player {

    int maxHp = 10;
    int currentHp= 10;
    int money = 0;
    LinkedList<Item> items = new LinkedList<Item>();

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
}
