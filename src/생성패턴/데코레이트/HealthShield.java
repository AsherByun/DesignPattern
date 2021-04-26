package 생성패턴.데코레이트;

public class HealthShield extends ShieldDecorator{
    public HealthShield(Shield shield) {
        super(shield);
    }
    
    public void skills(){
        super.skills();
        addSkills();
    }
    private void addSkills(){
        System.out.println("----- 에너지 충전");
    }
}
