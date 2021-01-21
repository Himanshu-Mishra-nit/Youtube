import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		
		 int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
         int n = arr.length; 
         System.out.println("Length of lis is " 
                           + lis( arr, n ) + "\n" ); 

	}

	private static int lis(int[] a, int n) {
		// TODO Auto-generated method stub
		
		int temp[]=new int[n];
		
		Arrays.fill(temp, 1);
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]>a[j] && temp[j]+1 > temp[i])
					temp[i]=temp[j]+1;
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int i:temp) {
			max=Math.max(max, i);
		}
		return max;
	}

}
