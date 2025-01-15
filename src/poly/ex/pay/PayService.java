package poly.ex.pay;

public class PayService {

    public static void processPay(String option, int amount) {
        PaySystem paySystem = findPaySystem(option);
        
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
                amount);

        boolean isConnected = paySystem.connect();

        boolean isPay = false;
        if (isConnected) isPay = paySystem.pay(amount);

        if (isPay) System.out.println("결제 성공");
        else System.out.println("결제 실패");
    }

    public static PaySystem findPaySystem(String option) {
        if (option.equals("kakao")) return new KakaoPay();
        if (option.equals("naver")) return new NaverPay();
        return new DefaultPay();

    }
}
