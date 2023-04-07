package ex0407;

public class Solution {
    public static void main(String[] args) {

    }

    private static int[] solution(int[] num_list) {

        int num1 = 0;
        int num2 = 0;


        for (int i = 0; i < num_list.length; i++) {

            if(num_list[i] % 2 == 0){
                num1++;
            } else {
                num2++;
            }

        }

        return new int[]{num1, num2};
    }

}
