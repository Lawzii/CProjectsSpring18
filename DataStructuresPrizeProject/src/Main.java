
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

            //prize pool
        stack.push("A Health Potion");
        stack.push("A Mana Potion");
        stack.push("A Stamina Potion");
        stack.push("A Really Sharp Sword");
        stack.push("A Cake");

        System.out.println("The current prize pool is: " + stack);
        System.out.println("Now lets shuffle them!");

        Collections.shuffle(stack); //put them all in a bag and shuffle!

            //line of people and random numbers
        /* Random rand = new Random();
        int value = rand.nextInt(10); // 0-9 */

        Queue<String> queue = new LinkedList<String>();

        queue.add("A Mage");
        queue.add("A Warrior");
        queue.add("A Rogue");

            Collections.shuffle((List<?>) queue); //shuffles the line instead of using rand

        ((LinkedList<String>) queue).add(2, "A Warlock");
        ((LinkedList<String>) queue).add(3, "A Druid");
        System.out.println("A raffle has been held for two lucky adventurers! The new line is now:  " + queue);

            for (int i = 0; i < 5; i++){
                System.out.println(queue.remove() + " gets " + stack.pop());
            }

            /*String prize = stack.pop();
            int winner = queue.remove();

        System.out.println(prize +" goes to number " + winner);*/






    }
}
