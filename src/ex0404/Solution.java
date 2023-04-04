package ex0404;

public class Solution {

    public static void main(String[] args) {
        String my_string = "1234";
        solution(my_string);

    }

    private static String solution(String my_string) {

        String answer = "";

        for (int i = my_string.length()-1; i >= 0; i--) {

            answer += my_string.charAt(i);

        }

        return answer;

    }

}
