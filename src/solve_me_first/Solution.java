package solve_me_first;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int solveMeFirst(int a, int b) {
     return a+b;
      
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
//        sum = solveMeFirst(a, b);
        sum = solveMeFirst(2, 3);
        System.out.println(sum);
   }
}