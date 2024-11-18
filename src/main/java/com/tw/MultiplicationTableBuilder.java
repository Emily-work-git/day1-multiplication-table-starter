package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        boolean isValidRange = builder.checkValidRange(start, end);
        System.out.println(isValidRange);
//        String multiplicationTable = builder.build(start, end);
//        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    public boolean checkValidRange(int start, int end) {
        return start <= end;
    }
}
