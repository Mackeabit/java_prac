package ex0329;

public class Solution {

    public static void main(String[] args) {

        /*
        * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
        * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
        * */

        int solution = solution(580000);
        System.out.println("solution = " + solution);
    }

    private static int solution(int price) {



        int rate = price >= 500000 ? 20 : price >= 300000 ? 10 : price >= 100000 ? 5 : 0;

        int answer = price * (100 - rate) / 100;

        return answer;


    }

}
