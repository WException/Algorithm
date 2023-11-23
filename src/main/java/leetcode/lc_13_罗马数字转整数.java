package leetcode;

import java.util.HashMap;
import java.util.Map;

// TODO 复习
public class lc_13_罗马数字转整数 {
    public static void main(String[] args) {
        System.out.println(romanToInt("II"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }

//    public static int romanToInt(String s) {
//        Map<String, Integer> map = new HashMap();
//        map.put("I",1);
//        map.put("V",5);
//        map.put("X",10);
//        map.put("L",50);
//        map.put("C",100);
//        map.put("D",500);
//        map.put("M",1000);
//
//        if (s.length() == 1) return map.get(s);
//        for (int i = 0; i < s.length(); i++) {
//            if ((s.charAt(i)+s.charAt(i+1)) == "IV")
//        }
//        return 0;
//    }
}
