package ex0402;

public class TestMain {

    public static void main(String[] args) {

        에어컨리모콘 에어컨리모콘 = new 에어컨리모콘("삼성");

        System.out.println("에어컨리모콘 maker = " + 에어컨리모콘.getMaker());

        TV리모콘 tv리모콘 = new TV리모콘();

        에어컨리모콘.전원("에어컨");//에어컨 켜기
        에어컨리모콘.아래방향화살표(); // 온도 조절
        에어컨리모콘.전원("에어컨");//에어컨 끄기


        tv리모콘.전원("TV");//TV 켜기
        tv리모콘.위방향화살표();//사운드 조절
        tv리모콘.전원("TV");//TV 끄기

//        에어컨리모콘.터보();//터보 사용!
        System.out.println("에어컨리모콘 = " + 에어컨리모콘);

    }

}
