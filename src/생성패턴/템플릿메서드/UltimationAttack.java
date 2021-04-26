package 생성패턴.템플릿메서드;

public class UltimationAttack {

    public void ultimationAttacking(){
        System.out.println("---- 기모으기");
        attack();
        System.out.println("---- 방전상태");
    }
    public void attack(){
        System.out.println("필살기 사용!");
    }
}
