package piyali.dsa.scaler.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber implements Comparator<Integer> {
    public String largestNumber(final List<Integer> A) {
//        StringBuffer largestString = new StringBuffer();
//        A.sort(this::compare);
        return A.stream()
                .sorted(this::compare)
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }

    private int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    @Override
    public int compare(Integer a, Integer b) {


        int sumDigitsA = sumDigits(a);
        int sumDigitsB = sumDigits(b);

        if (sumDigitsA < sumDigitsB) {
            return +1;
        } else if (sumDigitsA == sumDigitsB) {
            return Integer.compare(a, b);
        } else {
            return -1;
        }

    }
}
