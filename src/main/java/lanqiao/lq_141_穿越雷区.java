package lanqiao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// SCHOOL 交替走的BFS
public class lq_141_穿越雷区 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] map = new String[200][200];//存储地图
        int[][]  flg = new int[200][200];//记录该点1-走过，0-未走
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int startX=0,startY=0,endX=0,endY=0;//起点终点坐标
        int n = scan.nextInt();
        //接收地图
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                map[i][j] = scan.next();
                //赋值地图的同时寻找起点和终点坐标
                if(map[i][j].equals("A")){
                    startX = i;
                    startY = j;
                } else if(map[i][j].equals("B")){
                    endX = i;
                    endY = j;
                }
            }
        }
        //创建栈q
        Queue<Node> q = new LinkedList<Node>();
        //起点入栈，flg改为1
        //两种出发方式所以要入两次，一种"+" 一种"-"
        Node start = new Node("+",startX,startY,0);
        Node start2 = new Node("-",startX,startY,0);
        q.offer(start);
        q.offer(start2);
        flg[startX][startY] = 1;
        //开始BFS
        while(!q.isEmpty()){
            int x=q.peek().x;
            int y=q.peek().y;
            String c = q.peek().c;
            //判断现在队首是否在终点
            if(x==endX && y==endY){
                System.out.println(q.peek().step);
                return;
            }
            //四个方向试探
            for(int k=0;k<4;k++){
                int tx = x+dx[k];
                int ty = y+dy[k];
                //第一层if判断坐标是否在地图范围内
                //第二层if判断是否交替行走和该点是否已经走过
                if (tx>=1 && ty>=1 && tx<=n && ty<=n) {
                    if(!map[tx][ty].equals(c) && flg[tx][ty]==0){
                        q.offer(new Node(map[tx][ty],tx,ty,q.peek().step+1));//入队
                        flg[tx][ty] = 1;
                    }
                }
            }
            q.poll();//拓展完了需要将队首元素出队
        }
        System.out.println(-1);
    }
}

class Node{
    String c;//本题特殊(正负能量交替)，需要记录当前坐标是什么字符
    int x, y, step;
    public Node(){}
    public Node(int x,int y,int step){
        this.c = c;
        this.x = x;
        this.y = y;
        this.step = step;
    }
    public Node(String c,int x,int y,int step){
        this.c = c;
        this.x = x;
        this.y = y;
        this.step = step;
    }
}
