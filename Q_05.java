public class Q_05 {
static void preandpast(int[]arr,int sum) {
	for(int i=0;i<arr.length;i++) {
		int sum1=0;
		for(int j=i;j<arr.length;j++) {
			sum1=sum1+arr[j];
			if(sum1==sum) {
				System.out.println(arr[i-1]+" this is pre"+arr[j+1]+" this is post");
			}
		}
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {0,1,2,3,4,5};
		int key=9;
		preandpast(arr,key);
	}

}