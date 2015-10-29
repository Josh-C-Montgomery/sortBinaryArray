import java.util.Arrays;

public class SortBinaryArray {

	public int[] sortBinaryArray(int[] a) {
		int zeroPtr = a.length - 1;
		int tmp;

		for (int i = 0; i<zeroPtr; i++) {
			while (a[zeroPtr] != 0 && zeroPtr > i) {
				zeroPtr--;
			}

			if (a[i] == 1) {
				tmp = a[i];
				a[i] = a[zeroPtr];
				a[zeroPtr] = tmp;
			}
		}

		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {0,0,1,1,0};
		System.out.println(Arrays.toString(a));
		SortBinaryArray sorter = new SortBinaryArray();
		sorter.sortBinaryArray(a);
		System.out.println(Arrays.toString(a));
	}


}