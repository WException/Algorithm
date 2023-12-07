package lanqiao;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.util.Scanner;
//public class Main {
//  public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    //长度为n，删m个字符
//    int n=scan.nextInt();
//    int m=scan.nextInt();
//    //每次删除字母之后，都把m-删除次数。结果为剩余删除机会
//    String str = scan.next();
//    //找出前m+1个字符中最小的，如果有多个则选定第一个最小的
//    //判断最小的前面有几个字符，删除并给m减去相应值
//    //判断m是否为0，为0则返回结果str
//    //不为0，继续判断前m+1个字符中最小的
//    while(m>0){
//      int index=0;//记录最小且最前的字符下标
//      // System.out.println("m="+m);
//      for(int i=1;i<=m;i++){
////        System.out.println("i ascill="+(str.charAt(i)-0));
////        System.out.println("i-1 ascill="+(str.charAt(i-1)-0));
//        if((str.charAt(i)-0) < (str.charAt(i-1)-0)){
//          index=i;
////          System.out.println("index="+index);
//        }
//      }
//      //删除index前面的字符
//      str = str.substring(index);
//      m-=index;
//      System.out.println(str);
//    }
//    System.out.println(str);
//    scan.close();
//  }
//}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        int n = 2;
        List<String> result = new ArrayList<>();
        deleteCharacters(str, n, 0, result, new StringBuilder());
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void deleteCharacters(String str, int n, int index, List<String> result, StringBuilder sb) {
        if (n == 0) {
            result.add(sb.toString());
            return;
        }
        if (index == str.length()) {
            return;
        }
        // 删除当前字符
        sb.append(str.charAt(index));
        deleteCharacters(str, n - 1, index + 1, result, sb);
        sb.deleteCharAt(sb.length() - 1);

        // 保留当前字符
        deleteCharacters(str, n, index + 1, result, sb);
    }
}

class lanqiaoTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...




        //浅梦没对子 但有王炸 直接赢
        //浅梦没对子 后手有王炸 后手赢
        //双方都没对子 最大的牌一样大 浅梦赢
        //双方都没对子 最大的牌没后手大 后手赢
        //双方都没对子 最大的牌比后手大 浅梦赢
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            String a = scan.next();
            String b = scan.next();
            //1 浅梦有对子  直接赢
            if(a.charAt(0) == a.charAt(1)) System.out.println("ShallowDream");
            //浅梦没对子 后手有，但是单牌没有浅梦大 浅梦赢
            if(a.charAt(0) != a.charAt(1)
                    && b.charAt(0) == b.charAt(1)
                    && bijiao(a.charAt(0),b.charAt(0))==1
                    && bijiao(a.charAt(1),b.charAt(0))==1
            ) System.out.println("ShallowDream");
            //浅梦没对子 后手有，并且单牌比浅梦大 后手赢
            if(a.charAt(0) != a.charAt(1)
                    && b.charAt(0) == b.charAt(1)
                    && bijiao(b.charAt(0),a.charAt(0))==1
                    && bijiao(b.charAt(1),a.charAt(0))==1
            ) System.out.println("Joker");
            //浅梦没对子 后手有，最大的单牌一样大 浅梦赢
            if(a.charAt(0) != a.charAt(1)
                    && b.charAt(0) == b.charAt(1)
                    && bijiao(a.charAt(0),b.charAt(0))==1
                    && bijiao(a.charAt(1),b.charAt(0))==1
            ) System.out.println("ShallowDream");
        }
        scan.close();
    }

    private static int bijiao(char c,char d) {
        // a>b==>1
        // a=b==>2
        // a<b==>3
        Map<String, Integer> map = new HashMap<>();
        map.put("3", 1);
        map.put("4", 2);
        map.put("5", 3);
        map.put("6", 4);
        map.put("7", 5);
        map.put("8", 6);
        map.put("9", 7);
        map.put("X", 8);
        map.put("J", 9);
        map.put("Q", 10);
        map.put("K", 11);
        map.put("A", 12);
        map.put("2", 13);
        map.put("M", 14);
        map.put("F", 15);
        if (map.get(c) > map.get(d)) return 1;
        if (map.get(c) == map.get(d)) return 2;
        if (map.get(c) < map.get(d)) return 3;
        else return -1;
    }




//	private void fun1() {
//		int n=scan.nextInt();
//        int[] arr = new int[10000];
//        long result = 0;
//        for(int i=0;i<n;i++){
//        	arr[i] = scan.nextInt();
//        	if(arr[i] < 500) {
//        		//音
//        		result+=arr[i] - arr[i]/20;
//        		System.out.println(result+"  111");
//        	}
//        	if(arr[i] >= 500 && arr[i] <1000) {
//        		//猫
//        		result+=arr[i] - arr[i]/10;
//        		System.out.println(result+"  222");
//        	}
//        	if(arr[i] >= 1000 && arr[i]<=1500 && arr[i] != 1111) {
//        		//东
//        		result+=arr[i]-150;
//        		System.out.println(result+"  333");
//        	}
//        	if(arr[i] == 1111) {
//        		//音
//        		result+=0;
//        		System.out.println(result+"  444");
//        	}
//        	if(arr[i] > 1500) {
//        		//音
//        		result+=arr[i] - arr[i]/10;
//        		System.out.println(result+"  555");
//        	}
//        }
//        System.out.println(result);
//	}

}

class lanqiaoTest2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l = scan.nextDouble();
        int result = 0;
        while (true) {
            l = l / 2;
            result++;
            if(l <= 1) break;
        }
        System.out.println(result);
        scan.close();
    }

}


//11题
//Scanner scan = new Scanner(System.in);
//int[] arr = new int[64];
//for(int i=0;i<64;i++) {
//	arr[i] = scan.nextInt();
////	System.out.println(arr[i]);
//}
//int sum = 0;
//for(int i=0;i<64;i++) {
//	while(arr[i]!=0) {
//		sum = sum + arr[i]%10;
//		arr[i] = arr[i]/10;
//	}
//	System.out.println(i+" "+sum);
//	sum = 0;
//}

// 6题
//	Scanner scan = new Scanner(System.in);
//	int w = scan.nextInt();
//	long n = scan.nextInt();
//	if((w+n)%7 == 0) System.out.println(7);
//	else System.out.println((w+n)%7);
//	scan.close();