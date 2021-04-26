package 로봇;

public class GrangzoRobot extends Robot {
    @Override
    public void say() {
        System.out.println("나는 그랑죠");
    }

    @Override
    public void attack() {
        System.out.println("소드 어택 - 그랑죠");
    }
}
