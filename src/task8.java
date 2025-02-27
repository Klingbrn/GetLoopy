import java.util.Random;
public class task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int tries = 0;
        int sum;

        System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("------------------------------------------------");

        int die1, die2, die3;
        do {
            die1 = 1 + rand.nextInt(6);
            die2 = 1 + rand.nextInt(6);
            die3 = 1 + rand.nextInt(6);
            sum = die1 + die2 + die3;
            tries++;
            System.out.printf("%-8d%-8d%-8d%-8d%-8d%n", tries, die1, die2, die3, sum);
        } while (!(die1 == die2 && die2 == die3));

        System.out.println("You won after " + tries + " tries!");
    }
}
