import java.util.Arrays;
import java.lang.String;
public class arraysorted {
    public static void main(String[]args){
        long [] myNum={2, 3, 0, 10, 36, 4, 1, -1, 49, 100};
        System.out.println("=============================================");
        System.out.println("Original Of Arrays :" + Arrays.toString(myNum));
        Arrays.sort(myNum);
        System.out.println("Sorted of Array Methods :"+ Arrays.toString(myNum));
        System.out.println("=================================================");

    }

}
