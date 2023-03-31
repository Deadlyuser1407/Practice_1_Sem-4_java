import java.util.Arrays;
import java.util.Scanner;

public class Q_04 {
	
	static void zigZag(int[]arr)
	{
		
		Arrays.sort( arr);
	
		for (int i = 1; i <= arr.length - 2; i += 2) {
			
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}

	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the size of array");
		int n = sc.nextInt();
		int array[] = new int[n] ;
		for(int i=0; i<n;i++){
    		array[i]=sc.nextInt();
    	}
		zigZag(array);
		System.out.println(Arrays.toString(array));
	}
}