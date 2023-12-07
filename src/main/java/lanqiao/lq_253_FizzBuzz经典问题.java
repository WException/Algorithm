package lanqiao;

import java.util.Scanner;

public class lq_253_FizzBuzz经典问题 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N%3==0)
            if(N%5==0)
                System.out.print("FizzBuzz");
            else
                System.out.print("Fizz");
        else if(N%5==0)
            System.out.print("Buzz");
        else
            System.out.print(N);
        scan.close();
    }
}
