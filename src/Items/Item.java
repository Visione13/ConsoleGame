package Items;

public class Item {
    int value;
    String name;

    public Item(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}