package 생성패턴.싱글톤;

//싱그톤 패턴 요금 계산서
public class Budget {
    static private volatile long bills=0;

    public static long getBills(){
        return bills;
    }

    public static synchronized void addBills(long money){
        bills+=money;
    }
}
