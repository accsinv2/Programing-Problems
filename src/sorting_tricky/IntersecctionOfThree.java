package sorting_tricky;

public class IntersecctionOfThree {

	//Find common elements in three sorted arrays
	//Given three arrays sorted in non-decreasing order,
	//print all common elements in these arrays.



	public static void main(String[] args) {
		
		int a[] = {1, 5, 10, 20, 40, 80};
		int b[] = {6, 7, 20, 80, 100};
		int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length && k<c.length){
			if(a[i]==b[j] && b[j]==c[k]) System.out.println(a[i]);
		    if (a[i]<b[j] ) i++; // i is smaller than j
		    else  if (b[j]<c[k])j++; // j is smaller than k
		    else k++; //k is the smallest
		}
		
		
	}

}
