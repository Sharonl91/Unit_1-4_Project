import java.util.Scanner;

public class Player {
    public static final Scanner s = new Scanner(System.in);
    int l;
    int h;
    int patk = 0;
    int matk = 0;

    public Player(int level, int hp){
        l = level;
        h = hp;
        patk = (int)(Math.random()*10)+level;
    }

    public Monster(int level){
        level = (int)(Math.random()*l);
        matk = (int)(Math.random()*11)+level;
    }

    public String checkChoice(String choice1, String choice2) {
        while (!(Main.c.equals(choice1) || Main.c.equals(choice2))) {
            System.out.println("Please enter a valid option:");
            Main.c = s.nextLine();
        }
        return Main.c;
    }

}

