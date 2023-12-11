package dotcpp;

import java.util.Scanner;

public class dc_1040_实数的打印 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        for(int i=1;i<=3;i++){
            for(int j=0;j<i;j++){
                System.out.printf("%6.2f ",f);
            }
            System.out.println();
        }
        scanner.close();
    }
}
