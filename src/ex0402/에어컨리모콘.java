package ex0402;

public class 에어컨리모콘 extends 리모콘 {

    private boolean check = true;
    private boolean boost = true;
    private int temp = 20;

    private String maker;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public 에어컨리모콘(String maker) {
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    @Override
    public void 전원(String message) {
        message += check == true ? " 켜기" : " 끄기";
        System.out.println(message);
        check = !check;
    }

    @Override
    void 위방향화살표() {

        temp += temp < 30 ? 1 : 0;

        System.out.println("온도 : " + temp);
    }

    @Override
    void 아래방향화살표() {

        temp -= temp > 0 ? 1 : 0;

        System.out.println("온도 : " + temp);

    }


    //새로운 버튼 추가!!
    void 터보() {

        String message = boost == true ? "터보 발동!!!" : "터보 종료";

        System.out.println(message);
        boost = !boost;

    }


}
