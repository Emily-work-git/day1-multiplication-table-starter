package com.tw;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);
        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        boolean isValidInput = validateInput(start, end);
        if (isValidInput) {
            return createMultiplicationTable(start, end);
        }
        return null;
    }

    public boolean checkValidRange(int start, int end) {
        return start <= end;
    }
    public boolean checkValidNumber(int number) {
        return number>=1 && number<= 1000;
    }
    public boolean validateInput(int start, int end) {
        boolean isValidRange = checkValidRange(start, end);
        boolean areValidNumbers = checkValidNumber(start) && checkValidNumber(end);
        return isValidRange && areValidNumbers;
    }
    public String createMultiplicationTableRow(int start, int end) {
        return IntStream.rangeClosed(start, end) // Generates a stream from start to end (inclusive)
                .mapToObj(i -> i + "*" + end + "=" + (i * end)) // Maps each integer to the desired string format
                .collect(Collectors.joining(" ")); // Joins all strings with a space
    }
    public String createMultiplicationTable(int start, int end) {
        return IntStream.rangeClosed(0, end-start) // Generates a stream from 0 to end-start
                .mapToObj(i ->createMultiplicationTableRow(start, start+i)) // for each integer, generate a row
                .collect(Collectors.joining(System.lineSeparator())); // Joins all rows with new line character

    }
}

