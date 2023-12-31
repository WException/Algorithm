package lanqiao;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/*
使用bfs广度优先搜索
*/
// SCHOOL 经典BFS
public class lq_1216_走迷宫 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt(),M=scan.nextInt();
        int[][] map = new int[150][150];//地图
        int[][] flg = new int[150][150];//0-未走，1-已走
        Queue<Point> r = new LinkedList<Point>();//队列
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        for(int i=1;i<=N;i++)
            for(int j=1;j<=M;j++)
                map[i][j] = scan.nextInt();
        int start_x=scan.nextInt(), start_y=scan.nextInt();//起点
        int end_x=scan.nextInt(), end_y=scan.nextInt();//终点

        //开始bfs
        Point point = new Point(start_x,start_y,0);
        r.offer(point);//起点入队
        flg[start_x][start_y] = 1;

        while(!r.isEmpty()){
            //判断现在队首是否在终点
            int x=r.peek().x;
            int y=r.peek().y;
            if(x==end_x && y==end_y){
                System.out.println(r.peek().step);
                return;
            }
            //四个方向试探
            for(int k=0;k<4;k++){
                int tx = x+dx[k];
                int ty = y+dy[k];
                if(map[tx][ty]==1 && flg[tx][ty]==0){
                    //入队
                    r.offer(new Point(tx,ty,r.peek().step+1));
                    flg[tx][ty] = 1;
                }
            }
            r.poll();//拓展完了需要将队首元素出队
        }
        System.out.println(-1);
        scan.close();
    }
}
class Point{
    int x;
    int y;
    int step;
    public Point(){}
    public Point(int x,int y,int step){
        this.x=x;
        this.y=y;
        this.step=step;
    }
}