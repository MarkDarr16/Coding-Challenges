import java.util.*;

class ArrayLeft{

   public static void main(String[] args){
      int d, n;
      
      Scanner input = new Scanner(System.in);
      n = input.nextInt();
      d = input.nextInt();
      
      int[] a = new int [n];
      for (int i=0; i < n; i++){
         a[i] = input.nextInt();
      
      }
      
      rotLeft(a, d, n);
   
   }
   
   private static int[] rotLeft(int[]a, int d, int n){
      
      int mod = d % n;
      
      for (int i = 0; i < n; i++){
         System.out.print(a[(i + mod) % n]
                                 + " ");
      }
   
   
      return a;
   }

}