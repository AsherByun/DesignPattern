import 로봇.Robot;
import 생성패턴.싱글톤.Budget;
import 생성패턴.전략패턴.MissileAttack;
import 생성패턴.전략패턴.PunchAttack;
import 생성패턴.팩토리메서드.RobotFactory;
import 생성패턴.팩토리메서드.RobotFactoryImpl;

public class main1 {
    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactoryImpl();

        Robot ironman = robotFactory.makeRobot("아이언맨");
        ironman.say();
        ironman.setAttack(new MissileAttack());
        ironman.attack();
        ironman.setAttack(new PunchAttack());
        ironman.attack();

        Budget.addBills(100);
    }
}
