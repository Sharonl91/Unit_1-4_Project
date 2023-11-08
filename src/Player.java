import java.util.Scanner;

public class Player {
    public static final Scanner s = new Scanner(System.in);
    private int l;
    private double h;
    private int patk = 0;
    private int matk = 0;
    private int mhp;

    public Player(int level, int hp) {
        l = level;
        h = hp;
        patk = (int) (Math.random() * 10) + level;
    }

    public String checkChoice(String c1, String c2) {
        while (!(Main.c.equals(c1) || Main.c.equals(c2))) {
            System.out.println("Please enter a valid option:");
            Main.c = s.nextLine();
        }
        return Main.c;
    }

    public String levelUp() {
        l++;
        h += 0.25 * l;
        return "Player has become level" + l;
    }

    public int getMhp() {
        return mhp;
    }

    public void monsterAppears() {
        int level = (int) (Math.random() * l);
        matk = (int) (Math.random() * 9) + level;
        mhp = (int) (0.95 * h);
        System.out.println("A monster has appeared with " + mhp + " health.");
    }

    public void attack() {
        while (mhp > 0) {
            mhp = getMhp() - patk;
            h -= matk;
            System.out.println("You strike for " + patk);
            System.out.println("You have been hit for " + matk);
            System.out.println("You have " + h + " hp left.\nThe enemy has " + mhp + " hp left.");
            }
        if (h <= 0) {
            System.out.println("You died. THE END!");
            System.exit(15);
        } else if (h > 0) {
            System.out.println("You survived the battle!");
            levelUp();
        }
    }
}

