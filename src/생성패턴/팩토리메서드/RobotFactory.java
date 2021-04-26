package 생성패턴.팩토리메서드;

import 로봇.Robot;

public interface RobotFactory {
    Robot makeRobot(String name);
}
