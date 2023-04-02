package ex0402;

public class TV리모콘 extends 리모콘{

    private boolean check = true;
    private int sound = 1;

    @Override
    void 전원(String message) {
        message += check == true ? " 켜기" : " 끄기";
        System.out.println(message);
        check = !check;
    }

    @Override
    void 위방향화살표() {
        sound += sound < 30 ? 1 : 0;

        System.out.println("사운드 : " + sound);
    }

    @Override
    void 아래방향화살표() {
        sound -= sound > 0 ? 1 : 0;

        System.out.println("사운드 : " + sound);
    }
}
