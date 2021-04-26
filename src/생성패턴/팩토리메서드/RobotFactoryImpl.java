package 생성패턴.팩토리메서드;

import 로봇.GrangzoRobot;
import 로봇.IronRobot;
import 로봇.Robot;

public class RobotFactoryImpl implements RobotFactory {

    @Override
    public Robot makeRobot(String name) {
        if (name.equals("아이언맨")){
            return new IronRobot();
        }else if (name.equals("그랑죠")){
            return new GrangzoRobot();
        }

        return null;
    }
}
