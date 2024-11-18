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
            ArrayList<String> table = builder.createMultiplicationTable(start, end);
            String formattedTable = builder.formatMultiplicationTable(table);
            System.out.println(formattedTable);
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
    public ArrayList<String> createMultiplicationTable(int start, int end) {
        ArrayList<String> table = new ArrayList<String>();
        for(int  i=0; i <= end-start; i ++){
            String row = createMultiplicationTableRow(start, start+i);
            table.add(row);
        }
        return table;
    }

    public String formatMultiplicationTable(ArrayList<String> table) {
        StringBuilder result = new StringBuilder();
        for (String row : table) {
            result.append(row).append("\n");
        }
        return result.toString();
    }


}
