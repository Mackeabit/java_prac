package ex0414;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 3;
        int num2 = 4;

        int[] answer = solution(numbers, num1, num2);

        System.out.println("answer = " + Arrays.toString(answer));

    }

    private static int[] solution(int[] numbers, int num1, int num2) {

        int[] answer = new int[num2 - num1 + 1];
        int cnt = 0;

        for (int i = 0; i <= num2; i++) {

            if (i >= num1) {
                answer[cnt] = numbers[num1];
                num1++;
                cnt++;
            }

        }

        return answer;
    }

}
