package poly.ex2;

public class AmimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();

        // Animal 은 부모이기에 자식 모두를 담을 수 있다.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // '다형적 참조' 덕분에 Animal이 Dog, Cat, Cow 인스턴스 참조 가능 !!
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        // 오버라이딩된 메서드가 우선.. 자신의 메서드를 호출할 수 있게 해주는 느낌
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
