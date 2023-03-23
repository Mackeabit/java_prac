package ex0323;

import java.util.Arrays;

public class ArrayDup {

    /*
    * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
    * 최빈값이 여러 개면 -1을 return 합니다.
    * */

    public static void main(String[] args) {

        int[] array = {999, 8, 8, 999, 5, 0, 0};

        int[] data = new int[1000];

        int max = 0;
        int cnt = 0;
        int answer = 0;

        for (int i = 0; i < array.length; i++) {

            data[array[i]]++;

        }

        for (int i = 0; i < data.length; i++) {

            if (max < data[i]) {
                max = data[i];
                answer = i;
            }

            if (max == data[i]) {
                cnt = i;
            }

        }


    }



}
