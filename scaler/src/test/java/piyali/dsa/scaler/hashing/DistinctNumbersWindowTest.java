package piyali.dsa.scaler.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DistinctNumbersWindowTest {
    DistinctNumbersWindow distinctNumbersWindow;

    @BeforeEach
    void setup(){
        distinctNumbersWindow = new DistinctNumbersWindow();
    }

    @Test
    public void dist3WindowTest(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3));
        int window = 3;
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(2, 3, 3, 2));
        assertEquals(output, distinctNumbersWindow.dNums(input, window));
    }
}