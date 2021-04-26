package 생성패턴.전략패턴;

public class PunchAttack implements Attack{
    @Override
    public void attack() {
        System.out.println("핵 꿀주먹 펀치!!");
    }
}
