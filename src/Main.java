import java.util.Scanner;
public class Main {
    public static final Scanner s = new Scanner(System.in);
    public static String c;

    public static void main(String[] args) {
        Player p = new Player(2,300);
        System.out.println("\nYou are a slave living in city of Atlantis. You have been tortured for as long as you can remember. Your master had just " +
                "\nleft for the hospital with his son and told you to watch the house. He forgot to lock the windows, you decide to: " +
                "\n(choose run away or stay put).");
        c = s.nextLine();
        p.checkChoice("run away","stay put");
        if (c.equals("stay put")){
            System.out.println("You waited until late evening, when your master finally came home. In his arms is the corpse of his son. As soon as he saw you, he " +
                    "\nlaid the corpse on the sofa and walked toward you. He started kicking and stomping on you while shouting \"Why are you still alive when my son is gone? You piece of filth\"." +
                    "\nBecause you ate nothing the entire day and could not endure your master's abuse, you died.\nTHE END");
        }
        if (c.equals("run away")){
            System.out.println("You escaped from the place you had lived in for over a decade. The future looks both bright and bleak." +
                    "\nYou see a forest to the east and the town you frequented to the west. Where will you go now: \n(choose east or west)");
            c = s.nextLine();
            p.checkChoice("east","west");
            if (c.equals("east")){
                System.out.println("You set foot into an unknown terrain. While stumbling around, you accidentally fell into a pit. " +
                        "\nAs you ponder what to do, you saw a shadow loom overhead. You see a: \n(choose living thing or nonliving thing)");
                c = s.nextLine();
                p.checkChoice("living thing","nonliving thing");
                if (c.equals("living thing")){
                    System.out.println("You see a bear above you and before you can react, it had already jumped down and ate you.\nTHE END");
                    System.exit(15);
                }
                else if (c.equals("nonliving thing")){
                    System.out.println("You see some ropes dangling from a tree above you and wonder if someone left it there to help humans that accidentally got trapped. " +
                            "\nEither way, you're grateful for its existence and climbed out of the pit. As you explore deeper, you encountered a monster.");
                    p.monsterAppears();
                    System.out.println("What will you do now: (choose attack or run)");
                    c = s.nextLine();
                    p.checkChoice("attack","run");
                    if (c.equals("attack")){
                        p.attack();
                        System.out.println("You realized that the monster you just defeated was the king of this forest. Now that you've defeated it, you became the new ruler of this forest.\nTHE END!");
                        System.exit(15);
                    }
                    else if (c.equals("run")){
                        System.out.println("You quickly turned tail and ran from the monster, little did you know that it's speed is way faster than you." +
                                "\nIt caught up to you in seconds and slaughtered you.\nTHE END!");
                        System.exit(15);
                    }
                }
            }
            else if (c.equals("west")){
                System.out.println("It has been one week. Without your master, you could only eat some nuts on the way to the city. You ended up on the living on the streets and an old man offers to take you home. You:\n(refuse or accept)");
                c = s.nextLine();
            }
            p.checkChoice("refuse","accept");
            if (c.equals("refuse")){
                System.out.println("The old man decides to leave you alone and threw a loaf of bread down. You were grateful for the help and swore to repay it somehow in the future." +
                        "\nYou decided to work for any store that will accept you. In the next decade, you became a young and rich merchant who had everything a person could want." +
                        "\nYou bought a house and is living a peaceful life with your spouse. You encountered the old man that helped you, and hired him to be your butler." +
                        "\nYou even have a son who's both humble and wise. All in all, you lived a happy life at the end and died with your family! " +
                        "\nSadly it turns out you were dreaming this entire time, you never escaped and you are trapped forever! THE END!");
                System.exit(15);
            }
            else if (c.equals("accept")){
                System.out.println("You decided to follow the old man home and became his child. You studied in school and became a brilliant person. You were able to live a life filled with parental love and successes.");
                System.exit(15);
            }
        }
    }
}