package 로봇;

public class IronRobot extends Robot {
    @Override
    public void say() {
        System.out.println("i am 아이언맨");
    }

    @Override
    public void attack() {
        System.out.println("펄스건 발사 - 아이언맨");
    }
}
