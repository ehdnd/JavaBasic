package poly.ex.pay;

public class PayMain {

    public static void main(String[] args) {


        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        PayService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        PayService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        PayService.processPay(payOption3, amount3);
    }
}
