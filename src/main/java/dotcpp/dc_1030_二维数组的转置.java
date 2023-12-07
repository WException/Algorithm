package dotcpp;

import java.util.Scanner;

public class dc_1030_二维数组的转置 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=scan.nextInt();
            }
        }
        //转
        arr2[0][0] = arr1[0][0];
        arr2[1][0] = arr1[0][1];
        arr2[2][0] = arr1[0][2];

        arr2[0][1] = arr1[1][0];
        arr2[1][1] = arr1[1][1];
        arr2[2][1] = arr1[1][2];

        arr2[0][2] = arr1[2][0];
        arr2[1][2] = arr1[2][1];
        arr2[2][2] = arr1[2][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
        scan.close();
    }
}
