package E7_12;

public class Runner {
    public static void main(String[] args) {
        Sequence first =new Sequence(5);
        Sequence other = new Sequence(5);

        first.set(0,6);
        first.set(1,4);
        first.set(2,5);
        first.set(3,6);
        first.set(4,7);

        other.set(0,1);
        other.set(1,4);
        other.set(2,5);
        other.set(3,6);
        other.set(4,7);

        if(first.equals(other)){
            System.out.println("Sequence equals");
        }
        else {
            System.out.println("Sequence not equals");
        }

    }
}
