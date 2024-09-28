package Sep_14;

import java.util.Scanner;

public class Code_1 {
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       long  mul = 1;
       for(int i=n; i>=1; i--){
        mul = mul*i;
       }
       System.out.println(mul);
   } 
}
