package static2.ex;

public class Car {

    private static int totalCars;
    private final String car;

    public Car(String car) {
        this.car = car;
        totalCars++;
        System.out.println("차량 구입, 이름: " + car);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
