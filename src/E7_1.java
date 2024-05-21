import java.util.Scanner;

public class E7_1 {

    public static void main(String[] args) {
        int value[] = new int[10];

       Scanner sc = new Scanner(System.in);

       for(int i = 0; i < value.length; i++){
           value[i] = sc.nextInt();
       }

       for(int i = value.length-1; i >= 0; i--){
           System.out.println(value[i]);
       }

    }
}
