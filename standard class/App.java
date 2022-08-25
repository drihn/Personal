import javafx.scene.shape.Arc;

public class App {
    public static void main(String[] args) {

        Character Swordsman = new Character();

        Swordsman.strength = 10;
        Swordsman.agility = 10;
        Swordsman.intelligence = 10;
        Swordsman.name = "Zoro";
        Swordsman.sayMyName();
        Swordsman.sayMyStrength();
        Swordsman.sayMyIntelligence();
    
        Character Navigator = new Character();

        Navigator.strength = 0;
        Navigator.agility = 0;
        Navigator.intelligence = 10;
        Navigator.name = "Nami";
        Navigator.sayMyName();
        Navigator.sayMyStrength();
        Navigator.sayMyIntelligence();

        Character Cook = new Character();

        Cook.strength = 10;
        Cook.agility = 10;
        Cook.intelligence = 0;
        Cook.name = "Sanji ";
        Cook.sayMyName();
        Cook.sayMyStrength();
        Cook.sayMyIntelligence();

        Character Archer = new Character();

        Archer.strength = 0;
        Archer.agility = 10;
        Archer.intelligence = 10;
        Archer.name = "Usopp";
        Archer.sayMyName();
        Archer.sayMyStrength();
        Archer.sayMyIntelligence();

        Character Priest = new Character();

        Priest.strength = 0;
        Priest.agility = 0;
        Priest.intelligence = 10;
        Priest.name = "Chopper";
        Priest.sayMyName();
        Priest.sayMyStrength();
        Priest.sayMyIntelligence();

        
    }
}
