package sorting_tricky;

public class NearestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 3, 0, 2, 5};
				
	
		System.out.print("_,");
		
		for(int i=1;i< a.length;i++){
			if(a[i-1]<a[i]) {
				System.out.print(a[i-1]+",");
				
			}
			else {
				int flag=0;
				for(int j=i-1;j>=0;j--){
					if(a[j]<a[i]){
						System.out.print(a[j]+",");
						flag=1;
						break;
					}
				}
				if(flag==0)System.out.print("_,");
			}
		}
			
	}

}
