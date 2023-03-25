package ex0325;

public class SlicePizza {

    /*
    * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
    * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를
    * return 하는 solution 함수를 완성해보세요.
    * */

    public static void main(String[] args) {


        // 사람 수
        int n = 15;

        // 한판 당 피자 조각
        int pizza = 7;

        int need;

        if (n % pizza == 0) {
            need = n / pizza;
        } else {

            int cnt = n/pizza > 0 ? n/pizza : 0;

            need = cnt+1;

        }


        System.out.println("need = " + need);

        /*
        * 다른 사람 답안 중
        *
        * need = (n+6)/7;
        *
        * */


    }




}
