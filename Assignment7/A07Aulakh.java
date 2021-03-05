//package IT2650.A07;

public class A07 {
	
	// logic to sort the elements
	public static void bubbleSort(int array[]) {
		int n = array.length;
	    for (int i = 0; i < n; i++) {                      // for(int i = 0; i < n + 1; i++){ to run an extra time at the end
	    	for (int j = 0; j < (n - i - 1); j++) {
	    		if (array[j] > array[j + 1]) {
	    			swap(j, j + 1, array);

	    		}
	    	}
			System.out.println("\npass: " + (i + 1));
			printArray(array);
			System.out.println("");
	    }
	}
	
	private static void swap(int i, int j, int[] array) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
	    
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		//int[] input = { 5, 3, 56, 0, 22, 2, 4, 6, 33333, 34453, 23445432, 6, 4, 2, 1, 9};
		
        System.out.print("A07 - written by Arshpreet Aulakh\n\n");
        System.out.print("Initial Array:\n");
        printArray(input);
        System.out.print("\n");
        
        System.out.print("\nIntermediate Steps:");
		bubbleSort(input);
		
        System.out.print("\n\nSorted Array:\n");
        printArray(input);
	}
}

/*
NOTE: In sample output it ran an extra time but to match constraint #6 i have made the program end right when it is completely sorted
*/