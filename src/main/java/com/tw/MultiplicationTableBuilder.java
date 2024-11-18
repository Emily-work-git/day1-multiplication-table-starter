package com.tw;

import java.util.ArrayList;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;

        boolean isValidInput = builder.validateInput(start, end);
        System.out.println(isValidInput);

        if (isValidInput) {
            String testRow = builder.createMultiplicationTableRow(2, 2);
            String testRow2 = builder.createMultiplicationTableRow(2, 3);
            String testRow3 = builder.createMultiplicationTableRow(2, 4);
            System.out.println(testRow);
            System.out.println(testRow2);
            System.out.println(testRow3);
        }

//        String multiplicationTable = builder.build(start, end);
//        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    public boolean checkValidRange(int start, int end) {
        return start <= end;
    }
    public boolean checkValidNumbers(int start, int end) {
        return start>=1 && start<= 1000 && end>=1 && end<= 1000;
    }
    public boolean validateInput(int start, int end) {
        boolean isValidRange = checkValidRange(start, end);
        System.out.println(isValidRange);
        boolean areValidNumbers = checkValidNumbers(start, end);
        System.out.println(areValidNumbers);
        return isValidRange && areValidNumbers;
    }

    public String createMultiplicationTableRow(int start, int end) {
        ArrayList<String> row = new ArrayList<String>();
        for(int  i=start; i <= end; i ++){
            int result = i * end;
            row.add(i+"*"+end+"="+result);
        }
        return row.toString();
    }
}
