import java.util.Scanner;
public class findValue {

    public static void main(String[] args) {
        long input1,input2 ,input3 ;

       Scanner myScanner = new Scanner(System.in);
        System.out.println("Input 3 value Pls ");
       input1=myScanner.nextInt();
        input2=myScanner.nextInt();
        input3=myScanner.nextInt();
        System.out.println("Value 3 : \n"+input1+"\n"+input2+"\n"+input3);
        System.out.println("=============================================");
        if(input1 > input2 && input1 > input3){

            System.out.println("Value Greatest is : "+input1);
            }else if (input2>input1 && input2>input3){
            System.out.println("value Greatest is "+input2);
        }else if (input3>input1 && input3>input2){
            System.out.println("Value Greatest is "+input3);
        }else

        System.out.println("has one Error ");

        /*Middle Statement  */



//        Statement minimum
        if (input1<input2 && input1<input3){
            System.out.println("value smallest "+input1);
        } else if (input2<input1 && input2<input3) {
            System.out.println("value smallest is "+input2);

        } else if (input3<input1 && input3<input2) {
            System.out.println("value smallest is " +input3);

        }
        System.out.println("============================");
        if (input1<input2&&input1>input3){
            System.out.println("middle"+input1);
        }else if (input3<input2&&input3>input1){
            System.out.println("MIddle"+input3);
        }else
            System.out.println("middle"+input2);


    }

}
