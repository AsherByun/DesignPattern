package 생성패턴.데코레이트;

public class FireShield extends ShieldDecorator{

    public FireShield(Shield shield) {
        super(shield);
    }

    @Override
    public void skills() {
        super.skills();
        addSkills();
    }

    private void addSkills(){
        System.out.println("----- 불속성 방어");
    }
}
