package time_space_complexity.sort012;
// public class Main{
//     public static void main(String[] args)

//     {
//         int n = 7;
//         int a[] = {1,2,3,4,5,6};
//        for(int i=0 ; i<n-1 ; i++){
//            int minIndex = i;
//            int min = a[i];
//            for(int j = i+1 ; j < n ; j++){
//                if(a[j]<a[i]){
//                    minIndex = j;
//                    min = a[j];
//                }
//            }
//            if(minIndex!=i){
//                a[minIndex] = a[i];
//                a[i] = min;
//            }
//        }
//     }
// }



import java.util.*;
public class Main {
	public static void main(String diksha[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		selectionSort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
		
	}
}