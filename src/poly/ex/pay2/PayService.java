package poly.ex.pay2;

public class PayService {
    // 중복 수행 하는 부분을 쪼개자

    // 역할에만 의존하는 클라이언트를 만들자
    // 실질적인 클라이언트 코드는 변화하지 않도록 변경
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
                amount);

        Pay pay = PayStore.findPay(option); // 부모로 + 결제 수단 선택은 메서드로 추출

        // 실제 결제
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}


