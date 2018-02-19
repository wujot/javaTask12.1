import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Methods {

    // method returns minimum value of TreeSet
    public int minValue(TreeSet setOfNumbers) {
        return (int) setOfNumbers.first();
    }

    // method returns maximum value of TreeSet
    public int maxValue(TreeSet setOfNumbers) {
        return (int) setOfNumbers.last();
    }

    // method calculate and returns average of all numbers
    public int average(TreeSet setOfNumbers) {
        Iterator<Integer> iterator = setOfNumbers.iterator();
        int sumOfNumbers = 0;
            while (iterator.hasNext()) {
                Integer number = iterator.next();
                sumOfNumbers += number;
            }
        int averageValue = sumOfNumbers / setOfNumbers.size();
        return  averageValue;
    }

    // method returns all numbers greater then average
    public Set<Integer> greater(TreeSet setOfNumbers, double average) {
        Set<Integer> greaterThenAverage = new TreeSet<>();
        Iterator<Integer> iterator = setOfNumbers.iterator();
            while (iterator.hasNext()) {
                Integer number = iterator.next();
                    if (number > average) {
                        greaterThenAverage.add(number);
                    }
            }
            return greaterThenAverage;
    }
}
