package ex0319;

import java.util.Arrays;

public class PlusSolution {

    public static void main(String[] args) {

        /*
        *  첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        *  두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
        * */

        //분자
        int numer1 = 1;
        int numer2 = 9;

        //분모
        int denom1 = 5;
        int denom2 = 5;


        int num1 = numer1 * denom2;
        int num2 = numer2 * denom1;
        int denom = denom1 * denom2;

        //더한 이후 분자
        int finNumer = denom1 == denom2 ? numer1 + numer2 : num1 + num2;

        //더한 이후 분모
        int finDenom = denom1 == denom2 ? denom1 : denom;

        if (finDenom == finNumer) {
            int[] answer = {1,1};
        }

        int max = finNumer < finDenom ? finDenom : finNumer;
        int min = finNumer < finDenom ? finNumer : finDenom;

        if (max % min == 0) {
            int resMax = max / min;
            int[] answer = finNumer == min ? new int[]{1, resMax} : new int[]{resMax, 1};
        }

        int maximum = 1;

        for(int i = 2 ; i <= finNumer ; i ++) {
            if (finNumer % i == 0 && finDenom % i == 0) {
                maximum = i;
            }
        }

        int[] answer = {finNumer / maximum, finDenom / maximum};



    }

}
