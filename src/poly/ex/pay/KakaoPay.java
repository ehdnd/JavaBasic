package poly.ex.pay;

public class KakaoPay extends Pay implements PaySystem {

    @Override
    public boolean connect() {
        System.out.println("카카오페이 시스템과 연결합니다.");
        return true;
    }

}
