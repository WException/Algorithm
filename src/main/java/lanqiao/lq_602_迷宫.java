package lanqiao;

import java.util.Scanner;

// TODO DFS 迷宫问题 待理解
public class lq_602_迷宫 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] map  = new int[100][100]; //地图
        int start_x  = 1, start_y  = 1;   //起点
        int end_x    = 30, end_y   = 50;  //终点

        for(int i=1;i<=30;i++){
            String line = scan.nextLine();
            for(int j=1;j<=50;j++){
                map[i][j] = line.charAt(j-1) - 48;
            }
        }

        //输出检查地图是否与题目一致
        for(int i=1;i<=50;i++){
            System.out.print(map[1][i]);
        }
        scan.close();
    }

    public static void dfs(){

    }
}
