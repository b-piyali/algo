package piyali.dsa.scaler.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestNumberTest {
    LargestNumber largestNumber = new LargestNumber();

    @Test
    public void largestNumberTest0() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(34, 9));
        assertEquals("934", largestNumber.largestNumber(nums));
    }

    @Test
    public void largestNumberTest1() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        assertEquals("9534330", largestNumber.largestNumber(nums));
    }

    @Test
    public void largestNumberTest2() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 9, 0));
        assertEquals(largestNumber.largestNumber(nums), "9320");
    }
}