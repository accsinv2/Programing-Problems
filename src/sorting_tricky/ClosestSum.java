package sorting_tricky;

public class ClosestSum {
	//NOTE: Remember to take math.abs
	//Given a sorted array and a number x,
	//find the pair in array whose sum is closest to x

	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 7, 10}, x = 15,v1=0,v2=0;
		int diff= Integer.MAX_VALUE;
		
		int i=0,j=arr.length-1;
		while(i<j){
			if(Math.abs(arr[i]+arr[j]-x)<diff){
				diff = Math.abs(arr[i]+arr[j]-x);
				v1=arr[i];v2=arr[j];				
			}
			
			if(arr[i]+arr[j]>x)j--;
			else i++;
		}
		
		System.out.println(v1+" "+v2);

	}

}
