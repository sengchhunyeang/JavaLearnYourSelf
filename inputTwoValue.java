package JavaLearnYourSelf;

import java.util.Scanner;
import java.lang.Math;
public class inputTwoValue {
    static Integer abs(int a ,int b){

    return a-b;
    }

    public static void main(String[] args) {

        long a,b;




        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please input value a:\t");
        a=myScanner.nextInt();

        System.out.print("Please input value b:\t");
        b=myScanner.nextInt();
        System.out.println("is value A: " +a);

        System.out.println("Is value B: " +b);
        System.out.println("_________________");
        System.out.println("This is Value A+B ="+(a+b));
//       This Exercise 2
        System.out.println("==================================");
//if a>b a-b if a<b : wrong
        if (a>b){
            System.out.println("This is Result A-B ="+(a-b));
        }else {
            System.out.println("value A Not Correct : ");
        }
        System.out.println("This Multiple A and B * ==========");
        System.out.println("Result: "+ a*b);
        //Average is ((A+B)/2)
        System.out.println("=================================");
        System.out.println("Average A and B is :"+((a+b))/2.  );
        System.out.println("=================================");
        System.out.println("This is : function ==========JAVA ");
        if (a>b){
            System.out.println("Used Methods abs() Java : " +abs((int) a, (int) b));

        }
        System.out.println("====================================");
        System.out.println("Result Minimum A and B : "+Math.min(a,b ));
        System.out.println("======================================");
        System.out.println("Result Maximum A and B :" +Math.max(a,b));

    }
}
