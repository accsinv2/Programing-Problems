package sorting_tricky;

public class NearlySortedSearch {
	//http://www.geeksforgeeks.org/search-almost-sorted-array/
	static int key;
	static int loc=-1;
	
	private int find(int a[],int l, int h){
		
		//
		while(l<h){
			int mid = (l+h)/2;
			if(a[mid]==key) { loc=mid; break;}
			if(a[mid-1]==key){ loc=mid-1; break;}
			if(a[mid+1]==key) { loc=mid+1; break;}
			if(mid+2<7 && mid-2 >-1){
				if(key>a[mid])l=mid;
				if(key<a[mid])h=mid;
			}
			else break ;
			//System.out.println(l+" " +h+ " "+mid);
		}//while
		
		return loc;
		
	}
	
	public static void main(String[] args) {
		int a [] = {10, 3, 40, 20, 50, 80, 70};
		int l=0;
		int h=6;
		key=70;
		NearlySortedSearch obj = new NearlySortedSearch();
		int ans = obj.find(a,l,h);
		System.out.println(ans);
	}

}
