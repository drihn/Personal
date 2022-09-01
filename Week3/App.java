public class App {
    public static void main(String[] args) {
        item dagger = new item("dagger", 10, 3.4F, 10, "can be kill by flash into the enemy", true  );
        dagger.itemDialogue();

        item Bow = new item("Quincy", 20, 6.7F, 10, "can be kill by long range into the enemy", true  );
        Bow.itemDialogue();

        item Vizard = new item("Zanpaktu", 531, 6.4F, 8, "can be kill by ewan into the enemy", true  );
        Vizard.itemDialogue();
    }

     

}
