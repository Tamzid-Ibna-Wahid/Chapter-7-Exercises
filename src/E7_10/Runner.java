package E7_10;

public class Runner {

    public static void main(String[] args) {
        DataSet value = new DataSet(5);

        value.add(34);
        value.add(3);
        value.add(4);
        value.add(347);
        value.add(54);

        System.out.println(value.getSum());
        System.out.println(value.getAverage());
        System.out.println(value.getMin());
        System.out.println(value.getMax());

    }
}
