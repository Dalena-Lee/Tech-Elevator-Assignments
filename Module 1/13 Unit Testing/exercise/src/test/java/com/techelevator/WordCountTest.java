package com.techelevator;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class WordCountTest {
    @Test
    public void GetCountTest() {
        WordCount test = new WordCount();
        Map<String, Integer> testMap = new HashMap<>();

        Map<String, Integer> output = test.getCount(new String[]{"a", "b", "a", "c", "b"});
        int outputSize = output.size();
        testMap.put("a", 2);
        testMap.put("b", 2);
        testMap.put("c", 1);

        assertTrue(testMap.equals(output));
        assertEquals(outputSize, 3);

        output = test.getCount(new String[]{"c", "b", "a"});
        outputSize = output.size();
        testMap.clear();
        testMap.put("c", 1);
        testMap.put("b", 1);
        testMap.put("a", 1);

        assertTrue(testMap.equals(output));
        assertEquals(outputSize, 3);

        output = test.getCount(new String[]{"ba", "ba", "black", "sheep"});
        outputSize = output.size();
        testMap.clear();
        testMap.put("ba", 2);
        testMap.put("black", 1);
        testMap.put("sheep", 1);

        assertTrue(testMap.equals(output));
        assertEquals(outputSize, 3);

        output = test.getCount(new String[]{"ba", "ba", "black", "sheep", "ba", "ba", "black", "sheep"});
        outputSize = output.size();
        testMap.clear();
        testMap.put("ba", 4);
        testMap.put("black", 2);
        testMap.put("sheep", 2);

        assertTrue(testMap.equals(output));
        assertEquals(outputSize, 3);

        output = test.getCount(new String[]{"apple", "apple", "banana", "apple", "carrot", "banana", "dill", "dill", "banana", "apple"});
        outputSize = output.size();
        testMap.clear();
        testMap.put("apple", 4);
        testMap.put("banana", 3);
        testMap.put("carrot", 1);
        testMap.put("dill", 2);

        assertTrue(testMap.equals(output));
        assertEquals(outputSize, 4);

        output = test.getCount(new String[]{"apple", "apple", "apple", "apple", "apple", "apple"});
        outputSize = output.size();
        testMap.clear();
        testMap.put("apple", 6);

        assertTrue(testMap.equals(output));
        assertEquals(outputSize, 1);
    }
}
