package piyali.dsa.scaler.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IsDictionaryTest {
    IsDictionary dictionary;

    @BeforeEach
    void setpu(){
        dictionary = new IsDictionary();
    }

    @Test
    public void dictionaryStringTest(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello", "scaler", "interviewbit"));
        String dict ="adhbcfegskjlponmirqtxwuvzy";
        int result = 1;
        assertEquals(result, dictionary.solve(list, dict));
    }

    @Test
    public void notDictionaryStringTest(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("fine", "none", "no"));
        String dict ="qwertyuiopasdfghjklzxcvbnm";
        int result = 0;
        assertEquals(result, dictionary.solve(list, dict));
    }
}