package 생성패턴.데코레이트;

public class ShieldDecorator extends Shield{
    private Shield shield;

    public ShieldDecorator(Shield shield){
        this.shield=shield;
    }

    @Override
    public void skills() {
        shield.skills();
    }
}
