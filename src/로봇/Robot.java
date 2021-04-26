package 로봇;

import 생성패턴.전략패턴.Attack;

public abstract class Robot {
   public abstract void say();
   public abstract void attack();
   public abstract void setAttack(Attack attack);
}
