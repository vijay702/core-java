package javaCoding;

public class ArraySorting {

	public static void main(String[] args) {
		
		int arr[] = {7,88,2,33,20,15};
		int maxvalue =0;
		
		for (int i=0; i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					maxvalue = arr[i];
					arr[i] =arr[j];
					arr[j] = maxvalue;
					
				}
			}
			
		}

		
		for(int i=0; i<arr.length;i++) {
			System.out.println();
			
			System.out.print(arr[i]);
		}
	}

}
