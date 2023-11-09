import java.util.Scanner;

public class Player {
    public static final Scanner s = new Scanner(System.in);
    //level
    private int l;
    //health points
    private double h;
    //player attack damage
    private int patk = 0;
    //monster level
    private int ml;
    //monster attack damage
    private int matk = 0;
    //monster health points
    private double mhp;
    //the following constructs a player object where the player gets to assign level and health points to the object
    public Player(int level, double hp) {
        l = level;
        h = hp;
    }
    //the following method allows me to check if the player entered a valid choice
    //without repeating the code multiple times throughout the Main class
    public String checkChoice(String c1, String c2) {
        while (!(Main.c.equals(c1) || Main.c.equals(c2))) {
            System.out.println("Please enter a valid option:");
            Main.c = s.nextLine();
        }
        return Main.c;
    }
    //the following method returns the health point of the monster
    public double getMhp() {
        return mhp;
    }
    //the following method creates a chance encounter with a monster whose stats are randomized and based on the player level
    //the monster's stats corresponds with the player's level
    public void monsterAppears() {
        ml = (int) (Math.random() * l);
        mhp = (0.95 * h);
        System.out.println("A monster has appeared with " + mhp + " health.");
    }
    //the following
    public void attack() {
        while (mhp > 0) {
            patk = (int)(Math.random() * 20) + l;
            matk = (int) (Math.random() * 15) + ml;
            mhp = getMhp() - patk;
            h -= matk;
            System.out.println("You strike for " + patk);
            System.out.println("You have been hit for " + matk);
            if (mhp < 0){
                mhp = 0;
            }
            if (h < 0){
                h = 0;
            }
            System.out.println("You have " + h + " hp left.\nThe enemy has " + mhp + " hp left.");
        }
        if (h <= 0) {
            System.out.println("You died. THE END!");
            System.exit(15);
        } else {
            System.out.println("You survived the battle!");
        }
    }
}

