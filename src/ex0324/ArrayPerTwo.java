package ex0324;

import java.util.Arrays;

public class ArrayPerTwo {

    public static void main(String[] args) {

        /*
        * 정수 n이 매개변수로 주어질 때,
        * n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
        * */

        int n = 10;

        int[] answer = new int[(n+1)/2];

        for (int i = 1; i<=n; i++){

            if (i % 2 != 0) {
                answer[i/2] = i;
            }


        }

        System.out.println("answer = " + Arrays.toString(answer));

    }

}
