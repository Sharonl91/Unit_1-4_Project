import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        System.out.println("You are a slave living in the middle East. You have been tortured for as long as you can remember. Your master had just left for the hospital with his son and told you to watch the house. \nHe forgot to lock the windows, you decide to: \n(run away or stay put).");
        String c = s.nextLine();
        while (!(c.equals("run away") || c.equals("stay put"))){
            System.out.println("Please enter a valid option:");
            c = s.nextLine();
        }
        if (c == "stay put"){
            System.out.println("You waited until late evening, when your master finally came home. In his arms is the corpse of his son. As soon as he saw you, he laid the corpse on the sofa and walked toward you. He started kicking and stomping on you while shouting \"Why are you still alive when my son is gone? You piece of filth\".\n Because you ate nothing the entire day and could not endure your master's abuse, you died.\n THE END");
        }
        if (c == "run away"){
            System.out.println("You escaped from the place you had lived in for over a decade. The future looks both bright and bleak.\n You see a forest to the east and the town you frequented to the west. Where will you go now: \n (east or west)");
            while (!(c.equals("east") || c.equals("west"))){
                System.out.println("Please enter a valid option:");
                c = s.nextLine();
            }
            if (c == "east"){
                System.out.println("You set fot into an unknown terrain.");

            }
            else if (c == "west"){
                System.out.println("It has been one week. Without your master, you could only eat some nuts on the way to the city. You ended up on the living on the streets and an old man offers to take you home. You:\n(refuse or accept)");
            }
        }

    }
}