package com.tw;

import java.util.ArrayList;

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
        else return null;
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

        StringBuilder result = new StringBuilder();
        for (String element : row) {
            result.append(element).append(" ");
        }
        return result.toString().trim();
    }
    public String createMultiplicationTable(int start, int end) {
        ArrayList<String> table = new ArrayList<String>();
        for(int  i=0; i <= end-start; i ++){
            String row = createMultiplicationTableRow(start, start+i);
            table.add(row);
        }
        StringBuilder result = new StringBuilder();
        for (String row : table) {
            result.append(row).append(System.lineSeparator());
        }
        return result.toString();
    }



}
