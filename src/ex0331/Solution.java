package ex0331;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] num_list = {1, 0, 1, 1, 1, 3, 5};

        int[] solution = solution(num_list);

        System.out.println("solution = " + Arrays.toString(solution));

    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        int j = 0;
        for (int i = num_list.length-1; i >= 0; i--) {
            answer[j] = num_list[i];
            j++;
        }

        return answer;
    }

}
