package dsa;
 //SWAPPING ALTERNATE ELEMENTS IN AN ARRAY
public class Quest_1 {
	//creating a method to swap elements
	public static void swap(int arr[]) {
		int temp;
		for(int i = 0; i <arr.length -1 ; i +=2) {
			temp = arr [i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}
	public static void main (String [] args) {
		int arr[] = {9,3,6,12,4,32};
		System.out.println("befor swappinig");
		for(int x  :arr) {
			System.out.print(x);
		}
		System.out.println();
		swap(arr);
		System.out.println("after swapping");
		for (int x :arr) { 
			System.out.print(x);
		}
		System.out.println();
	}

}
