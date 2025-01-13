package poly.ex2;

public class AmimalPolyMain2 {

    public static void main(String[] args) {
        // ctrl + alt + N -> alt + I 로 변경함
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animalArr) {
            // ctrl + alt + M
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
