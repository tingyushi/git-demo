public class BinSearch {
	
	
	//The return value is the index of the array
	public static int Bin(int key, int a[]) {
		int low = 0;
		int high = a.length - 1;
		int mid;
		
		while (low <= high) {
			
			mid = (low + high) / 2;
			
			if (a[mid] == key) {
				return mid;
			}
			else if (a[mid] < key) {
				low = mid;
			}
			else {
				high = mid;
			}
		}
		//-1 means not found
		return -1;
	}
	
	public static void BinSearch(int key, int a[]) {
		if (Bin(key, a) == -1) {
			System.out.println("The item is not found");
		}else {
			System.out.print("The item is found, the index value is ");
			System.out.println(Bin(key, a));
		}
	}
}

//Adding a comment
