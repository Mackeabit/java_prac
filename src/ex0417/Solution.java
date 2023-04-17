package ex0417;

public class Solution {

    public static void main(String[] args) {
        int n = 100;
        int answer = solution(n);
        System.out.println("answer = " + answer);

    }

    private static int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                answer++;
            }
        }

        return answer;
    }

}
