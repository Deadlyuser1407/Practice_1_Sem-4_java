import java.util.Arrays;

   
public class Q_02 {
   static boolean areArraysEqual(int[]a,int[]b) {
	   int len=a.length;
	   if(len!=b.length) {
		   return false;
	   }
	   Arrays.sort(a);
	   Arrays.sort(b);
	   
	   for(int i=0;i<len;i++) {
		   if(a[i]!=b[i]) {
			   return false;
		   }
		   
	   }
	   return true;
   }
    public static void main(String[] args) {
        
        int[] b = {5, 4, 3, 8, 1};
        int[] c = {1, 2, 3, 3, 5};

      
        System.out.println(areArraysEqual(b, c));
    }
}
        