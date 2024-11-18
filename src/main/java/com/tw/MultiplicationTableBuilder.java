package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;

        boolean isValidRange = builder.checkValidRange(start, end);
        System.out.println(isValidRange);

        boolean areValidNumbers = builder.checkValidNumbers(start, end);
        System.out.println(areValidNumbers);
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
}
