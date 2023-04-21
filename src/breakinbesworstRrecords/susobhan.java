package breakinbesworstRrecords;
import java.util.*;
public class susobhan {
	 public static void main(String[] args) {
	        Scanner sc  =  new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        
	        int arr[] = new int[n];
	        
	        
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        
	     int mim= countmin(arr,n);
	     int mxm = countmax(arr,n);
	        System.out.print(mxm+" "+mim);
	    	 
	       }
	       
	       
	       
	       
	       
	       
	       
	   
	    
	 
	 
	 
	 public static int maximum(int arr[], int n) {
		 int max =arr[0];
		 for(int i =0;i<n;i++) {
			 if(arr[i]>max) {
				 max=  arr[i];
			 }
		 }
		 return max;
		 
	 }
	 
	 
	 
	 public static int minimum(int arr[],int n) {
		int  min  = arr[0];
		 
		for(int i =0;i<n;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	 }
	 
	 public static int countmax(int arr[] ,int n) {
		 int maxcount =0;
		 int maxarr[] = new int[n]; int k =1;
			maxarr[0]= arr[0]; int max = arr[0];
			
			for(int i =1;i<n;i++) {
				if(arr[i]>max) {
					max = arr[i];
					maxcount++;
					maxarr[k]= arr[i];
					k++;
				}
				else {
					maxarr[k]= max;
					k++;
				}
			}
			
//			for(int i =0;i<n;i++) {
//				
//				if( maximum(arr,n)==maxarr[i]) {
//					maxcount++;
//				}
//			}
			return maxcount;
	 }
	 
	 
	 public static int countmin(int arr[],int n) {
		 int mincount =0;
		 int minarr[] = new int[n]; int j =1;
			minarr[0]=arr[0];int  min = arr[0];
			for(int i =1;i<n;i++) {
				if(arr[i]<min) {
					min = arr[i];
					mincount++;
					minarr[j]= arr[i];
					j++;
				}else {
					minarr[j]= min;
					j++;
				}
				
				
			}
			
//			for(int i=0;i<n;i++) {
//				if( minarr[i]==minimum(arr,n)) {
//					mincount++;
//				}
//			}
			
		 
		 return mincount;
	 }
	 
	 

}
