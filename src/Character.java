import java.util.Random;
public class Character {
    String name;
    int hp = 30;
    int mana = 10;

    Character(){}
    Character(String word){
        name = word;
    }
    Character(String word, int health, int mana1){
        name = word;
        hp = health;
        mana = mana1;
    }

    void printInfo(){
        System.out.println(name);
        System.out.println("HP: " +hp+ "  |  MANA: " +mana);
    }
    void getDamaged(int damage) {
        hp -= damage;
        System.out.println(name+ " got damaged for " +damage+ " damage");
    }

    void healHealth(){
        int heal = randomNumber(1, 10);
        hp += heal;
        System.out.println("You healed for " +heal+ " hp");
    }

    void getMana(){
        mana += randomNumber(1, 2);
    }

    void attackDamage(Character character, int high, int low) {
        character.getDamaged(randomNumber(low, high));
        mana -= 1;
    }

    private int randomNumber(int lowest, int highest) {
        Random rand = new Random();
        int randomNum = rand.nextInt(highest - lowest + 1) + lowest;
        return randomNum;
    }
}
