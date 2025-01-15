package poly.ex.pay;

public interface PaySystem {
    boolean connect();

    boolean pay(int amount);
}
