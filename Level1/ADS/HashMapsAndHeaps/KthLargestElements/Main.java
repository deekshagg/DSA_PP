import java.util.*;
 import java.lang.*;
 import java.io.*;
 class Main
  {
 	 public static void main (String[] args) throws IOException
 	  {
 	 	 Scanner scn= new Scanner(System.in);
 	    	 int n = scn.nextInt();
 	 	 int[] num = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 num[i] = scn.nextInt();
 	 	 	 }
 	 	 int k = scn.nextInt();
 	 	 solve(n,num,k);
 	  }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array,n length of array and k.
 	 // It should print required output.
 	  public static void solve(int n,int[] arr,int k){
 	     //Write your code here
		  PriorityQueue<Integer> pq = new PriorityQueue<>();
		  for(int i = 0 ; i < arr.length ; i++){
			  if(i < k){
				  pq.add(arr[i]);
			  }else{
				  if(arr[i]>pq.peek()){
					  pq.remove();
					  pq.add(arr[i]);
				  }
			  }
		  }
		PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
		  while(pq.size()>0){
			  ans.add(pq.remove());
		  }
		  while(ans.size()>0){
			  System.out.print(ans.remove()+" ");
		  }
     }
 }