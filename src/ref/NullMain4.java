package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // 참조값을 주면 된다.
        bigData.data = new Data();

        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.count = " + bigData.count);

        System.out.println("bigData.data.value = " + bigData.data.value);
    }

}

// null 값에 `.`을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다 !