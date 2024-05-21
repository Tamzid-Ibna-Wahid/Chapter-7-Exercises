import java.util.Scanner;

public class E7_3 {
    public static void main(String[] args) {
        int value[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < value.length; i++){
            value[i] = sc.nextInt();
        }

        int max = value[0],min = value[0];

        for(int i = 1; i < value.length; i++){
            if(value[i] > max){
                max = value[i];
            }
            if(value[i] < min){
                min = value[i];
            }
        }

        for(int i = 0; i < value.length; i++){
            if(value[i] == max){
                System.out.println(value[i]+" <= max value");
            }
            else if(value[i] == min){
                System.out.println(value[i]+" <= min value");
            }
            else{
                System.out.println(value[i]);
            }
        }

    }
}
