package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int res = 0;
        for (int value : values) res += value;
        return res;
    }

    public static double average(int[] values) {
        double sum = sum(values);
        return (sum / values.length);
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) if (min > value) min = value;
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) if (max < value) max = value;
        return max;
    }
}
