package com.conference.date_220728;

public class ChangeStringToNumber {
    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("num.length : " + num.length);

        System.out.println("String 값 : " + s);
        for (int i = 0; i < num.length; i++) {

            System.out.println("num[" + i + "] :" + num[i]);

            s = s.replace(num[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
