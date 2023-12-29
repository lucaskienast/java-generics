package exercises.w3resource.ex2;

import java.util.List;

public class SumOfEvenAndOdds {

    public static <T extends Number> void calculateSumsOfEvensAndOdds(List<T> numbers) {
        double evenSum = 0;
        double oddSum = 0;

        for (T number : numbers) {
            if (number.doubleValue() % 2 == 0)
                evenSum += number.doubleValue();
            else
                oddSum += number.doubleValue();
        }

        System.out.println("Original list: " + numbers);
        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }

}
