import java.util.Scanner;
public class Main {
    public static final Scanner s = new Scanner(System.in);
    public static String c;

    public static void main(String[] args) {
        Player p = new Player();
        System.out.println("\nYou are a slave living in the middle East. You have been tortured for as long as you can remember. Your master had just \nleft for the hospital with his son and told you to watch the house. He forgot to lock the windows, you decide to: \n(choose run away or stay put).");
        c = s.nextLine();
        p.checkChoice("run away","stay put");
        if (c.equals("stay put")){
            System.out.println("You waited until late evening, when your master finally came home. In his arms is the corpse of his son. As soon as he saw you, he \nlaid the corpse on the sofa and walked toward you. He started kicking and stomping on you while shouting \"Why are you still alive when my son is gone? You piece of filth\".\nBecause you ate nothing the entire day and could not endure your master's abuse, you died.\nTHE END");
        }
        if (c.equals("run away")){
            System.out.println("You escaped from the place you had lived in for over a decade. The future looks both bright and bleak.\nYou see a forest to the east and the town you frequented to the west. Where will you go now: \n(choose east or west)");
            c = s.nextLine();
            p.checkChoice("east","west");
            if (c.equals("east")){
                System.out.println("You set foot into an unknown terrain. While stumbling around, you accidentally fell into a pit. \nAs you ponder what to do, you saw a shadow loom overhead. You see a: \n(choose living thing or nonliving thing)");
                c = s.nextLine();
                p.checkChoice("living thing","nonliving thing");
                if (c.equals("living thing")){
                    System.out.println("You see a bear above you and before you can react, it had already jumped down and ate you.\nTHE END");
                }
                if (c.equals("nonliving thing")){
                    System.out.println("You see some ropes dangling from a tree above you and wonder if someone left it there to help humans that accidentally got trapped. \nEither way, you're grateful for its existence and climbed out of the wh");
                    c = s.nextLine();
                }
            }
            if (c.equals("west")){
                System.out.println("It has been one week. Without your master, you could only eat some nuts on the way to the city. You ended up on the living on the streets and an old man offers to take you home. You:\n(refuse or accept)");
                c = s.nextLine();
            }
            p.checkChoice("refuse","accept");
        }

    }
}