package ex0401;

public class SbTest implements Runnable {
    StringBuilder sb;

    public SbTest() {
        sb = new StringBuilder();
    }

    public void run() {
        addChar();
    }

    public void addChar() {
        for (int i = 0; i < 100; i++) {
            sb.append("1");
            sb.append("0");
        }
    }

    public static void main(String[]args){
        SbTest sbTest = new SbTest();
        Thread threadOne = new Thread(sbTest, "ThreadOne");
        Thread threadTwo = new Thread(sbTest, "ThreadTwo");

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("length:" + sbTest.sb.length());

    }
}
