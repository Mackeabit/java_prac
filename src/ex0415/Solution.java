package ex0415;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int age = 235;
        String answer = solution(age);
        System.out.println("answer = " + answer);
    }

    private static String solution(int age) {
        String ageToString = ""+age;
        String answer = "";
        char[] ageInt = new char[ageToString.length()];

        char bet = 'a';
        for (int i = 0; i < ageToString.length(); i++) {

            ageInt[i] = bet;
            int res = Integer.parseInt(String.valueOf(ageToString.charAt(i)));

            for (int j = 0; j < res; j++) {
                bet++;
            }
            ageInt[i] = bet;
            answer += ageInt[i];
            bet = 'a';
        }

        return answer;
    }

}
