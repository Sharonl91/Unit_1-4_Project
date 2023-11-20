public class Main {
    public static String c;
    public static void main(String[] args) {
        //Starts off the game by creating an Player object
        Player p = new Player(6, 100);
        System.out.println("\nYou are a slave living in the city of Atlantis. You have been tortured for as long as you can remember. Your master had " +
                "\njust left for the hospital with his son and told you to watch the house. He forgot to lock the windows, you decide to: " +
                "\n(choose run away or stay put).");
        p.checkChoice("run away", "stay put");
        if (c.equalsIgnoreCase("stay put")) {
            System.out.println("\nYou waited until late evening, when your master finally came home. In his arms is the corpse of his son. As soon " +
                    "\nas he saw you, he laid the corpse on the sofa and walked toward you. He started kicking and stomping on you while " +
                    "\nshouting. Why are you still alive when my son is gone? You piece of filth. Because you ate nothing the entire day " +
                    "\nand could not endure your master's abuse, you died.\nTHE END...");
        }
        if (c.equalsIgnoreCase("run away")) {
            System.out.println("\nYou escaped from the place you had lived in for over a decade. The future looks both bright and bleak." +
                    "\nYou see a forest to the east and the town you frequented to the west. Where will you go now: " +
                    "\n(choose east or west)");
            p.checkChoice("east", "west");
            if (c.equalsIgnoreCase("east")) {
                System.out.println("\nYou set foot into an unknown terrain. While stumbling around, you accidentally fell " +
                        "\ninto a pit. As you ponder what to do, you saw a shadow loom overhead. You see a: " +
                        "\n(choose living thing or nonliving thing)");
                p.checkChoice("living thing", "nonliving thing");
                if (c.equalsIgnoreCase("living thing")) {
                    System.out.println("\nYou see a bear above you and before you can react, it had already jumped down and ate you.\nTHE END");
                    System.exit(15);
                } else if (c.equalsIgnoreCase("nonliving thing")) {
                    System.out.println("\nYou see some ropes dangling from a tree above you and wonder if someone left it there to help " +
                            "\nhumans that accidentally got trapped. Either way, you're grateful for its existence and climbed out of " +
                            "\nthe pit. As you explore deeper, you encountered something.\n");
                    System.out.println(p.monsterAppears());
                    System.out.println("\nWhat will you do now: \n(choose attack or run)");
                    p.checkChoice("attack", "run");
                    if (c.equalsIgnoreCase("attack")) {
                        while (true) {
                            String attackResult = p.attack();
                            System.out.println(attackResult);
                            if (attackResult.contains("!")) {
                                break;  // Exit the loop if the battle is over
                            }
                        }
                        System.out.println("\nYou realized that the monster you just defeated was the king of this forest. " +
                                "\nNow that you've defeated it, you became the new ruler of this forest.\nTHE END!");
                        System.exit(15);
                    } else if (c.equalsIgnoreCase("run")) {
                        System.out.println("\nYou quickly turned tail and ran from the monster, little did you know that it's " +
                                "\nspeed is way faster than you. It caught up to you in seconds and slaughtered you.\nTHE END!");
                        System.exit(15);
                    }
                }
            } else if (c.equalsIgnoreCase("west")) {
                System.out.println("\nIt has been one week. Without your master, you could only eat some nuts on the way to the " +
                        "\ncity. You ended up on the living on the streets and an old man offers to take you home. You:" +
                        "\n(choose refuse or accept)");
                p.checkChoice("refuse", "accept");
                if (c.equalsIgnoreCase("refuse")) {
                    System.out.println("\nThe old man decides to leave you alone and threw a loaf of bread down. You were grateful for the help " +
                            "\nand swore to repay it somehow in the future. You decided to work for any store that will accept you. " +
                            "\nAfter you earned enough to make a living, you decided to invest your savings and bought a mansion. " +
                            "\nYou encountered the old man that helped you, and hired him to be your butler. You couldn't find it in " +
                            "\nyourself to marry and start a proper family so you adopted a child. All in all, you lived a wonderful life " +
                            "\nat your last moment! You opened your eyes all of a sudden and it turns out you were dreaming this entire time. " +
                            "\nYou never escaped and you're trapped forever! \nTHE END!");
                    System.exit(15);
                } else if (c.equalsIgnoreCase("accept")) {
                    System.out.println("\nYou decided to follow the old man home and became his child. You studied in school and became " +
                            "\na brilliant person. In the next decade, you became a young and rich merchant who had everything " +
                            "\na person could want. You bought a house and is living a peaceful life with your spouse. " +
                            "\nYou even have a son who's both humble and wise. You were able to live a life filled with " +
                            "\nparental love and successes. \nTHE END!");
                    System.exit(15);
                }
            }
        }
    }
}
