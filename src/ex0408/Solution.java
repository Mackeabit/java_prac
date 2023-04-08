package ex0408;

public class Solution {

    public static void main(String[] args) {

        String my_string = "hello";
        int n = 3;
        String answer = solution(my_string, n);

        System.out.println("answer = " + answer);

    }

    private static String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

}
