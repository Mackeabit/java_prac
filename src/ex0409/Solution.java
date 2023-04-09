package ex0409;

public class Solution {

    public static void main(String[] args) {

        int n = 64;
        int k = 6;

        int answer = solution(n, k);

        System.out.println("answer = " + answer);

    }

    private static int solution(int n, int k) {

        int answer = 0;

        int cnt = n / 10;
        k -= cnt;

        answer = 12000 * n + 2000 * k;

        return answer;
    }

}
