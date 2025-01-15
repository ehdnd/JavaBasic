package poly.ex.pay2;

public abstract class PayStore {

    // 항상 Pay 리턴 보장. null 체크 필요 없다.
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            // null object 패턴
            return new DefaultPay();
        }
    }
}
