package sorting_tricky;

public class FloorOfElement {

	
	/*
	 * 2 methods
	 * 1) linear scan
	 * 2) binary search
	 */
	public static void main(String[] args) {

		int arr[] = {1, 2, 4, 6, 10, 12, 14};
	    int n = arr.length;
	    int x = 13;
	  //method 1
	    //int index = floorSearch1(arr, x);
	    //method2 Binary search
	    int index= floorSearch2(arr,x);
	    if (index == -1)
	        System.out.println("Floor of %d doesn't exist in array "+ x);
	    else
	        System.out.println("Floor of  "+ x+" is  "+ arr[index]);
	   
	}

	private static int floorSearch2(int[] arr, int x) {
		
		int l=0,h=arr.length-1;
		
		return floorSearch(l,h,arr,x);
	}

	private static int floorSearch(int low, int high, int[] arr,int x) {
		 // If low and high cross each other
	    if (low > high)
	        return -1;
	 
	    // If last element is smaller than x
	    if (x >= arr[high])
	        return high;
	 
	    // Find the middle point
	    int mid = (low+high)/2;
	 
	    // If middle point is floor.
	    if (arr[mid] == x)
	        return mid;
	 
	    // If x lies between mid-1 and mid
	    if (mid > 0 && arr[mid-1] <= x && x < arr[mid])
	        return mid-1;
	 
	    // If x is smaller than mid, floor must be in
	    // left half.
	    if (x < arr[mid])
	        return floorSearch(low, mid-1,arr,  x);
	 
	    // If mid-1 is not floor and x is greater than
	    // arr[mid],
	    return floorSearch(mid+1, high,arr,  x);

	}

	private static int floorSearch1(int[] arr,int x) {
		
		//O(n) complexity
		int max=arr[0];
		int index=0;
		int i=0;
		while(i<arr.length){
			if(arr[i] < x && arr[i] >max){
				max=arr[i];
				index=i;
			}
			i++;
		}
		
		return index;
	}

}
