package sorting_tricky;

import java.util.ArrayList;
import java.util.List;import javax.security.auth.login.CredentialException;

public class TournamentTree {
	
	//http://www.geeksforgeeks.org/second-minimum-element-using-minimum-comparisons/
	//Second minimum element using minimum comparisons
	//Also minimum element with minimum comparison
	
	public Node createNode(int data){
		Node n = new Node();
		n.data=data;
		n.left=null;
		n.right=null;
		return n;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3, 6, 100, 9, 10, 12, 7, -1};
		int level = (int) Math.log(a.length);
		TournamentTree obj = new TournamentTree();
		int size=a.length;
		int init=0;
		List<Node> li =  new ArrayList<Node>();
		for(int i=init;i<size;i++){
			li.add(obj.createNode(a[i]));
		}
		int lisize=li.size();
		while(size>1){
			for(int i=init;i<lisize;i=i+2){
				if(li.get(i).data<li.get(i+1).data){
					li.add(obj.createNode(li.get(i).data));
					li.get(li.size()-1).left=li.get(i);
					li.get(li.size()-1).right=li.get(i+1);
					
				}
				else{
					li.add(obj.createNode(li.get(i+1).data));
					li.get(li.size()-1).left=li.get(i);
					li.get(li.size()-1).right=li.get(i+1);
				}
				//System.out.println(li.get(li.size()-1).data+" "+i+" "+lisize);
			}
		//	System.out.println(size);
			init=init+size;
			size=size/2;
			lisize=li.size();
		}
		
		obj.secondMin(li,level);
		
//		
//		System.out.println(li.get(li.size()-1).right.data);
//		System.out.println(li.get(li.size()-1).left.data);

		
	}
	
	
	public void secondMin(List<Node> li,int level){
		Node temp=new Node();
		temp=li.get(li.size()-1);
		int min=li.get(li.size()-1).data;
		int min2=li.get(li.size()-3).data;
		while(temp.left!= null ){
			if(temp.left.data!=min && temp.left.data<min2) 
				{ min2=temp.left.data;}
			else if(temp.right.data!=min && temp.right.data<min2) 
				{min2=temp.right.data;}
			
			if(temp.left.data==min) temp=temp.left;
			if(temp.right.data==min) temp=temp.right;

		}
		System.out.println(min2);
	}
	
	
	//inner class
	class Node{
		int data;
		Node left;
		Node right;
	}

}
