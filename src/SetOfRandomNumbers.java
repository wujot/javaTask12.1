import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfRandomNumbers {

    public static void main(String[] args) {

        TreeSet<Integer> setOfRandomNumbers = new TreeSet<>();

        Methods methods = new Methods();

        Random randomGenerator = new Random();
        for (int i = 0; i < 50; i++) {
            setOfRandomNumbers.add(randomGenerator.nextInt(1001));
        }

        // print set of 50 random numbers in range between 0-1000
        System.out.println("Set of 50 random numbers in range between 0-1000:");
        System.out.println(setOfRandomNumbers + "\n");

        // print minimum value
        System.out.printf("Minimum value in set: %d\n", methods.minValue(setOfRandomNumbers));

        // print maximum value
        System.out.printf("Maximum value in set: %d\n", methods.maxValue(setOfRandomNumbers));

        // print average of all numbers
        System.out.printf("Average of all numbers in set is: %d\n", methods.average(setOfRandomNumbers));

        // print set of all numbers greater then average
        System.out.println("Set of all numbers greater then average:");
        System.out.println(methods.greater(setOfRandomNumbers, methods.average(setOfRandomNumbers)));

    }
}
