package static1;

public class DataCountMain2 {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(Data3.count);
        //클래스를 통합 접근
        System.out.println(Data3.count);
    }
}
