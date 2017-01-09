package sorting_tricky;

public class Count1Binary {

	//in O(log n)
	//can also be dne by finding the last index of 1.
	
	//Count 1�s in a sorted binary array
	
	/*
	 *  Given a binary array sorted in non-increasing order, count the number of 1�s in it.
	Examples:
		Input: arr[] = {1, 1, 0, 0, 0, 0, 0}
		Output: 2

	 */
	public static void main(String[] args) {
		//using binary search searh for first occurence of 1
		//linear addition in the low high bracket;
		int arr[] = {1, 1, 1, 1, 0, 0, 0},l=0,h=(arr.length-1),count=0;
		 while(l<h){
			 int m=(l+h)/2;
			 if(arr[m]==0)h=m-1;
			 else {
				 for(int i=0;i<=h;i++) count=count+arr[i];
				 break;
			 }
				 
		 }
		 System.out.println(count);
		
		
	}

}
