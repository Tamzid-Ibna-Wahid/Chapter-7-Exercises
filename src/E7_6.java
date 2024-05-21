import java.util.Scanner;

public class E7_6 {
    public static void main(String[] args) {
        int value[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            value[i] = sc.nextInt();
        }
        int ans=0;

        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                ans+=value[i];
            }
            else ans-=value[i];
        }
        System.out.println(ans);

    }
}
