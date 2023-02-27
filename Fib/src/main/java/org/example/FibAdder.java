package org.example;

public class FibAdder {
    public static int getSumOfFibSequence(int sequenceLength) {
        if (sequenceLength < 0) {
            throw new RuntimeException("Bad input");
        }
        int firstNum = 0;
        int secondNum = 1;
        for(int i = 1; i <= sequenceLength; i++) {
            int temp = secondNum;
            secondNum = temp + firstNum;
            firstNum = temp;
        }
        return firstNum;
    }
}