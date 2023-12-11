package lanqiao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// TODO DFS 迷宫问题 待理解
public class lq_602_迷宫 {
    static int min = 99999999;
    static int[][] map  = new int[100][100]; //0通路，1障碍物
    static int[][] flg  = new int[100][100]; //0未访问，1已访问

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start_x  = 1, start_y  = 1;   //起点
        int end_x    = 30, end_y   = 50;  //终点

        for(int i=1;i<=30;i++){
            String line = scan.nextLine();
            for(int j=1;j<=50;j++){
                map[i][j] = line.charAt(j-1) - 48;
            }
        }
        flg[1][1]=1;
        dfs(start_x,start_y,0);
        System.out.println(min);

        //输出检查地图是否与题目一致
        // for(int i=1;i<=50;i++){
        //     System.out.print(map[1][i]);
        // }
        scan.close();
    }

    public static void dfs(int x,int y,int step){
        //到达终点
        if(x==30 && y==50){
            if(min>step){
                min = step;
            }
            return;
        }
        //向下试探
        if(map[x+1][y]==0 && flg[x+1][y]==0){
            flg[x+1][y]=1;
            dfs(x+1,y,step+1);
            flg[x+1][y]=0;
        }
        //左
        if(map[x][y-1]==0 && flg[x][y-1]==0){
            flg[x][y-1]=1;
            dfs(x,y-1,step+1);
            flg[x][y-1]=0;
        }
        //右
        if(map[x][y+1]==0 && flg[x][y+1]==0){
            flg[x][y+1]=1;
            dfs(x,y+1,step+1);
            flg[x][y+1]=0;
        }
        //上
        if(map[x-1][y]==0 && flg[x-1][y]==0){
            flg[x-1][y]=1;
            dfs(x-1,y,step+1);
            flg[x-1][y]=0;
        }
    }
}

//BFS

//public class lq_602_迷宫 {
//
//    private static String[] nn= {};
//    static int[][] map    = new int[100][100];
//    static int[][] dis    = new int[100][100];
//    static Queue<point> r = new LinkedList<point>();
//    static int[]  dx      = {0,1,0,-1};
//    static int[]  dy      = {1,0,-1,0};
//
//    public static void main(String[] args) {
//
//        int startx  = 1, starty  = 1;   //起点
//        int endx    = 30, endy   = 50;  //终点
//        for(int i=0;i<30;i++) {
////            map[i]=nn[i].toCharArray();
//        }
//        //BFS
//        point start = new point(startx,starty,0);
//        r.offer(start); //起点入队
//        dis[startx][starty] = 1;
//        while(!r.isEmpty()){
//            int x = r.peek().x;
//            int y = r.peek().y;
//            if(x==endx && y==endy){
//                System.out.println(r.peek().step);
//                break;
//            }
//            //四个方向试探
//            for(int k=0;k<4;k++){
//                int tx = x + dx[k];
//                int ty = y + dy[k];
//                if(map[tx][ty]==1 && dis[tx][ty]==0){
//                    //入队
//                    point temp = new point(tx,ty,r.peek().step+1);
//                    r.offer(temp);
//                    dis[tx][ty] = 1;
//                }
//            }
//            r.poll();//拓展完了需要将队首元素出队
//        }
//    }
//}
//class point{
//    int x;
//    int y;
//    int step;
//    public point(){}
//    public point(int x,int y,int step){
//        this.x=x;
//        this.y=y;
//        this.step=step;
//    }
//}
