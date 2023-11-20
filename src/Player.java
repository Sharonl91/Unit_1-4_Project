import java.util.Scanner;
public class Player {
    public static final Scanner s = new Scanner(System.in);
    //level
    private int l;
    //health points
    public double h;
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
    //without the need to type all these code multiple times throughout the Main class
    public String checkChoice(String c1, String c2) {
        while (true) {
            Main.c = s.nextLine().trim();
            if (Main.c.equalsIgnoreCase(c1) || Main.c.equalsIgnoreCase(c2)) {
                break;  // Exit the loop if the choice is valid
            } else {
                return "Please enter a valid option: (" + c1 + "/" + c2 + ")";
            }
        }
        return ""; //this code won't run because either the if or the else statement will compile first
    }
    //the following method creates a chance encounter with a monster whose stats are randomized and based on the player level
    //the monster's stats corresponds with the player's level
    public String monsterAppears() {
        ml = (int) (Math.random() * l);
        mhp = (int) (Math.random() * 0.95) + h;
        return "A monster has appeared with " + mhp + " health.";
    }
    //the following method copies the real-life situation of fighting against a monster and returns the amount being dealt to the monster,
    //the amount received, and the remaining hp left for both the user and the monster
    //when the hp drops to 0 or below for either side, a corresponding message will be returned and the game will continue on
    public String attack() {
        patk = (int) (Math.random() * 15) + l;
        matk = (int) (Math.random() * 15) + ml;
        mhp -= patk;
        h -= matk;
        String result = "You strike for " + patk + ".\nYou have been hit for " + matk +
                ".\nYou have " + h + " hp left.\nThe enemy has " + mhp + " hp left.\n";
        if (mhp <= 0) {
            result+= "You survived the battle!";
        } else if (h <= 0) {
            result+= "You died. THE END!";
        }
        try {
            // Introduce a 2-second delay (2000 milliseconds) before returning the result
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Restore interrupted status
            Thread.currentThread().interrupt();
        }
        return result;  // Return the result of the attack
    }
}
