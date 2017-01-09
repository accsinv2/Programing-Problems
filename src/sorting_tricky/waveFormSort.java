package sorting_tricky;

public class waveFormSort {
	
//	/http://www.geeksforgeeks.org/sort-array-wave-form-2/
	//in O(n)
	//My sol, if last is increasing...this shud be decreasing. nvicecersa.
	//if thats not happening swap.
	
	public int [] wavesort(int a[]){
		
		int dec=0;
		int inc=0;
		int i=2;
		if(a[1]>a[0]) inc=1; 
		else dec=1;
		while(i<a.length){
			System.out.println("dec= "+dec+" inc= "+inc+" i "+i +"  "+ a[i-1]+" "+a[i]);
			if(inc==1){
				if(a[i]> a[i-1])a=swap(a,i);
				inc=0;dec=1;
			}
			else if(dec==1){
				if(a[i]< a[i-1]) a=swap(a,i);
					inc=1; dec=0;
			}
			i++;
			
			
		}
	return a;
	}
	public int [] swap(int a[],int i){
		int temp = a[i];
		a[i]=a[i-1];
		a[i-1]=temp;
		return a;
	}
	public static void main(String[] args) {

		int a [] = {10, 3, 1, 20, 50, 80, 70};
		waveFormSort obj = new waveFormSort();
		a=obj.wavesort(a);
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+ " , ");
	}

}
