package ex0321;

import java.util.Arrays;

public class ArrayCenter {

    /*
    * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    * 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
    * 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
    * */

    public static void main(String[] args) {


        int[] array = {9, -1 ,10};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int cert = 0;
                if (array[j] < array[i]) {
                    cert = array[j];
                    array[j] = array[i];
                    array[i] = cert;
                }
            }
        }



    }


}
