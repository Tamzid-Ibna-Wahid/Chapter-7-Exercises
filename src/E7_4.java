import java.util.Scanner;

public class E7_4 {



    public static void main(String[] args) {
        int value[] = new int[10];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            value[i] = sc.nextInt();
        }
        int ans = sumWithoutSmallest(value,10);
        System.out.println(ans);

    }

    public static int sumWithoutSmallest(int array[], int size){
        int sum=0,min=array[0];
        for(int i=0;i<size;i++){
            sum+=array[i];
            min=Math.min(min,array[i]);
        }
        return sum-min;
    }
}

