package 생성패턴.전략패턴;

public class MissileAttack implements Attack{

    @Override
    public void attack() {
        System.out.println("미사일 발사~~!!");
    }
}
