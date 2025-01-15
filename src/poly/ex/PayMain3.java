package poly.ex;

interface PaySystem {
    boolean connect();

    boolean pay(int amount);
}

class Pay {
    public boolean pay(int amount) {
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}

class KakaoPay extends Pay implements PaySystem {
    @Override
    public boolean connect() {
        System.out.println("카카오페이 시스템과 연결합니다.");
        return true;
    }
}

class NaverPay extends Pay implements PaySystem {
    @Override
    public boolean connect() {
        System.out.println("네이버페이 시스템과 연결합니다.");
        return true;
    }
}

class DefaultPay implements PaySystem {
    @Override
    public boolean connect() {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 실패: 유효하지 않은 결제 수단");
        return false;
    }
}

class PayService {
    public static void processPay(String option, int amount) {
        PaySystem paySystem = findPaySystem(option);

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        boolean isConnected = paySystem.connect();

        if (isConnected && paySystem.pay(amount)) {
            System.out.println("결제 성공");
        } else {
            System.out.println("결제 실패");
        }
    }

    public static PaySystem findPaySystem(String option) {
        return switch (option.toLowerCase()) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            default -> new DefaultPay();
        };
    }
}

public class PayMain3 {
    public static void main(String[] args) {
        PayService.processPay("kakao", 5000);
        PayService.processPay("naver", 10000);
        PayService.processPay("bad", 15000);
    }
}

