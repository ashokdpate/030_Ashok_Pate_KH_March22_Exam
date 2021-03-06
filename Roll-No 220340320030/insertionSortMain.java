
import java.util.Arrays;
class insertionSortMain{
	
	public static void insertionSort(int arr[]){
		for(int i=1; i<arr.length;i++){
			int temp=arr[i];
			int j;
			for(j=i-1; j>=0 && arr[j]>temp; j--){
				arr[j+1]=arr[j];
			}
			arr[j+1]=arr[j];
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String []args){
		int arr[]={2,4,6,8,3};
		System.out.println("Before Insertion Sorting: ");
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		insertionSort(arr);
		System.out.println("After Insertion Sorting: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}