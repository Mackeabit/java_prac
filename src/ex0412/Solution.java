package ex0412;

public class Solution {

    public static void main(String[] args) {

        String my_string = "abcdef";
        String letter = "f";

        String answer = solution(my_string, letter);
        System.out.println("answer = " + answer);
    }

    private static String solution(String my_string, String letter) {

        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {

            String charAt = ""+my_string.charAt(i);

            answer += !charAt.equals(letter) ? charAt : "";

        }

        return answer;
    }

}
