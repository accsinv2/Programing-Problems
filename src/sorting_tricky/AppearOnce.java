package sorting_tricky;

public class AppearOnce {
//Find the element that appears once in a sorted array
//Given a sorted array in which all elements appear twice
	//(one after one) and one element appears only once. 
	//Find that element in O(log n) complexity.
	
	/*
	 * Input:   arr[] = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8}
Output:  4

Input:   arr[] = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8}
	indexarr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
Output:  8
	 */
	static int index=0;
	public static int binsearch(int a[],int l,int h){
		
		int m=(h+l)/2;
		if(l>h) return 0;	
		//if(l==h) return l;
		//VVVVVIIIIIIPPP CONDITION TO NOTICE
		if(l==h){
			index=l;
			return index;
		}
		// If mid is even and element next to mid is
	    // same as mid, then output element lies on
	    // right side, else on left side
		//System.out.println("outside1"+" "+l+" "+h+" "+m);
		if(m%2==0 ){ //if middle is even  then amid==amid-1 under normal circum
			if(a[m]==a[m+1]){
				binsearch(a,m+2,h);
			System.out.println("inside1"+" "+l+" "+h+" "+m);//no harm on left element in right
			}
				
			else{
				System.out.println("inside2"+" "+l+" "+h+" "+m);
				binsearch(a,l,m);
				
			}
				
						//int a[] ={1, 1, 3,3,4, 5, 5, 7, 7, 8,8};
		}	
		else{
			if(a[m]==a[m-1]){
				System.out.println("inside3"+" "+l+" "+h+" "+m);
				binsearch(a,m+1,h);
			}
				
			else{
			System.out.println("inside4"+" "+l+" "+h+" "+m+" "+a[m]+" "+a[m-1]);
				binsearch(a,l,m-1);
			}
				
		}
		
		System.out.println(index+" rec");
		return index;
	}
	public static void main(String[] args) {
		int a[] ={1, 1, 3,4,4, 5, 5, 7, 7, 8,8};
		
		int index=binsearch(a,0,a.length-1);
		System.out.println(index);
	}

}
