package JavaLearnYourSelf;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1, 14, 2, 5,0};
        System.out.println("=====================");
        System.out.println("original Array : ");
        for(int a =0 ; a<arr.length; a++){
            System.out.println(a+"="+arr[a]);
        }

        System.out.println("============");
        System.out.println("Array Reverse : ");
        for(int a=arr.length-1 ; a>=0;a--){
            System.out.println(a+"="+arr[a]);

        }


    }
}
