package ex0416;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] emergency = {1, 2, 3, 4, 5};

        int[] answer = solution(emergency);

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

    }

    private static int[] solution(int[] emergency) {

        int[] answer = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(answer);
        int cnt;
        for (int i = 0; i < answer.length; i++) {
            cnt = answer.length;
            for (int j = 0; j < answer.length; j++) {

                if (answer[i] == emergency[j]) {
                    answer[i] = cnt;
                    break;
                }
                cnt--;
            }
        }

        return answer;
    }

}
