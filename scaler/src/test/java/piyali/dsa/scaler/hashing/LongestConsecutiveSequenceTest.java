package piyali.dsa.scaler.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence longestConsecutiveSequence;

    @BeforeEach
    void setup(){
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }

    @Test
    public void test1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(100, 4, 200, 1, 3, 2));
        int output = 4;
        assertEquals(output, longestConsecutiveSequence.longestConsecutive(input));
    }

    @Test
    public void test2() {
        List<Integer> input = new ArrayList<>(Arrays.asList(2, 1, 1));
        int output = 2;
        assertEquals(output, longestConsecutiveSequence.longestConsecutive(input));
    }

    @Test
    public void test3() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, 4, 5, 2, 3));
        int output = 5;
        assertEquals(output, longestConsecutiveSequence.longestConsecutive(input));
    }
}