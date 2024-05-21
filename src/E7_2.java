import java.util.Random;

public class E7_2 {

    public static void main(String[] args) {

        int value[] = new Random().ints(10,1,100).toArray();


        for(int i=0;i<value.length;i+=2){
            System.out.print(value[i]+" ");
        }
        System.out.println();
        for(int i=0;i<value.length;i++){
            if(value[i]%2==0){
                System.out.print(value[i]+" ");
            }
        }
        System.out.println();
        for(int i=value.length-1;i>=0;i--){

            System.out.print(value[i]+" ");
        }
        System.out.println(value[0]+" "+value[value.length-1]);
    }
}
