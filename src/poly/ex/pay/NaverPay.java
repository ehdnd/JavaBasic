package poly.ex.pay;

public class NaverPay extends Pay implements PaySystem {

    @Override
    public boolean connect() {
        System.out.println("네이버페이 시스템과 연결합니다.");
        return true;
    }

}
