import 생성패턴.데코레이트.*;

public class main2 {
    public static void main(String[] args) {
        Shield shield = new ShieldDecorator(new HealthShield(new FireShield(new NormalShield())));

        shield.skills();
    }
}
