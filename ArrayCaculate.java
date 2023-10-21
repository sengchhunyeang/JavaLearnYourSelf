package JavaLearnYourSelf;
import java.util.Arrays;
public class ArrayCaculate {
    public static void main(String[] args) {



        long[] numbers = {70,60,50,40,30,20,10};
        double sum=0;
        for(int i=0 ; i< numbers.length; i++){
            sum += numbers[0];
        }
        System.out.println("Array original : " );
        System.out.println("Result Array Sum  : "+sum);
        System.out.println("==============================");
        System.out.println("Reasult Array Average: " +sum/numbers.length);
        System.out.println(numbers.length);

    }




    }

