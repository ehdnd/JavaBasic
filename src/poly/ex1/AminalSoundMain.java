package poly.ex1;

public class AminalSoundMain {

    public static void main(String[] args) {
        // ctrl + alt + V;
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // Cow[] cowArr = {dog, cat, cow}; // 다른 타입이라 배열에 담을 수 없다.

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCow(cow);
        // soundCow(cat); // 다른 타입(클래스)이기에 사용 불가능
    }

    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
