package 로봇;

import 생성패턴.전략패턴.Attack;

public class IronRobot extends Robot {
    Attack attack;

    @Override
    public void say() {
        System.out.println("i am 아이언맨");
    }

    @Override
    public void attack() {
        attack.attack();
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

}
