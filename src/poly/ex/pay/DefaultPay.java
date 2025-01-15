package poly.ex.pay;

public class DefaultPay extends Pay implements PaySystem {

    @Override
    public boolean connect() {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
