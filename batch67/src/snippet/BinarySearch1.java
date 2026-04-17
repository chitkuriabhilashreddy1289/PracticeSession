package snippet;

public class BinarySearch1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int key = 7;
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high )/ 2;
			if (arr[mid] == key) {
				System.out.println("key index:" + mid);
				break;
			} else if (key<arr[mid] ) {
				high=mid - 1;
			} else if(key>arr[mid]){
				low=mid + 1;
			}
		}
	}

}
