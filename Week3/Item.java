
public class item {
    // item objective
    String name;
    int price;
    float weight;
    int quantity;
    String description;
    boolean canbetraded;


    // item method
    public void itemDialogue() {
        System.out.println("\nI am a:" + name + "\nFear not who this item was. It can teleport you to an near enemy like a blink-_-" + " the price:" + price + "\nweight:" + weight + "\nquantity:" + quantity + "\nThe description:" + description + "\nCan be traded? " + true ) ;
    }
        
    // constructor
    public item(String itemname, int itemprice, float itemweight, int itemquantity, String itemdescription, boolean itemcanbetraded) {
        name = itemname;
        price = itemprice;
        weight = itemweight;
        quantity = itemquantity;
        description = itemdescription;
        canbetraded = itemcanbetraded;
        
    }

}
