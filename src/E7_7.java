import java.util.Scanner;

public class E7_7 {

    public static void main(String[] args) {
        int value[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < value.length; i++){
            value[i] = sc.nextInt();
        }
        value = reversearray(value);

        for(int i = 0; i < value.length; i++){
            System.out.print(value[i]+" ");
        }

    }
    public static int[] reversearray(int value[]){
        int array[] = new int[10];

        for(int i = 0; i < value.length; i++){
            array[value.length-1-i] = value[i];
        }
        return array;
    }
}
