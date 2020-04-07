package codingbat.array;

public class Array1 {
//firstLast6
	public boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

	// sameFirstLast
	public boolean sameFirstLast(int[] nums) {
		return nums.length > 0 ? nums[0] == nums[nums.length - 1] : false;
	}

	// makePi
	public int[] makePi() {
		int[] a = new int[3];
		a[0] = 3;
		a[1] = 1;
		a[2] = 4;
		return a;
	}

	// commonEnd
	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] != b[0] && a[a.length - 1] != b[b.length - 1])
			return false;
		return true;
	}

	// sum3
	public int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += nums[i];
		}
		return sum;
	}

	// rotateLeft3
	public int[] rotateLeft3(int[] nums) {
		int a = nums[0];
		for (int i = 0; i < 2; i++) {
			nums[i] = nums[i + 1];
		}
		nums[2] = a;
		return nums;
	}

	// reverse3
	public int[] reverse3(int[] nums) {
		int a = nums[0];
		nums[0] = nums[2];
		nums[2] = a;
		return nums;
	}

	// maxEnd3
	public int[] maxEnd3(int[] nums) {
		int max = nums[0];
		if (nums[2] > max)
			max = nums[2];
		for (int i = 0; i < 3; i++) {
			nums[i] = max;
		}
		return nums;
	}

	// sum2
	public int sum2(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (i == 1)
				break;
		}
		return sum;
	}

	// middleWay
	public int[] middleWay(int[] a, int[] b) {
		int[] newArray = new int[2];
		newArray[0] = a[1];
		newArray[1] = b[1];
		return newArray;
	}

	// makeEnds
	public int[] makeEnds(int[] nums) {
		int[] newArray = new int[2];
		newArray[0] = nums[0];
		newArray[1] = nums[nums.length - 1];
		return newArray;
	}

	// has23
	public boolean has23(int[] nums) {
		for (int i = 0; i < 2; i++) {
			if (nums[i] == 2 || nums[i] == 3)
				return true;
		}
		return false;
	}

	// no23
	public boolean no23(int[] nums) {
		for (int i = 0; i < 2; i++) {
			if (nums[i] == 2 || nums[i] == 3)
				return false;
		}
		return true;
	}

	// makeLast
	public int[] makeLast(int[] nums) {
		int l = nums.length;
		int[] newArray = new int[2 * l];
		newArray[2 * l - 1] = nums[l - 1];
		return newArray;
	}

	// double23
	public boolean double23(int[] nums) {
		int c2 = 0;
		int c3 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2)
				c2++;
			if (nums[i] == 3)
				c3++;
		}
		return c2 >= 2 || c3 >= 2;
	}

	// fix23
	public int[] fix23(int[] nums) {

		for (int i = 0; i < 2; i++) {
			if (nums[i] == 2 && nums[i + 1] == 3)
				nums[i + 1] = 0;
		}
		return nums;
	}

	// start1
	public int start1(int[] a, int[] b) {
		int c = 0;
		if (a.length >= 1 && a[0] == 1)
			c++;
		if (b.length >= 1 && b[0] == 1)
			c++;
		return c;
	}

	// biggerTwo
	public int[] biggerTwo(int[] a, int[] b) {
		int c = 0;
		if (a[0] + a[1] < b[0] + b[1])
			c++;
		return c > 0 ? b : a;
	}

	// makeMiddle
	public int[] makeMiddle(int[] nums) {
		int l = nums.length / 2;
		int[] newArray = new int[2];

		for (int i = 0; i < 2; i++) {
			newArray[i] = nums[l - 1 + i];
		}

		return newArray;
	}

	// plusTwo
	public int[] plusTwo(int[] a, int[] b) {
		int[] newArray = new int[4];
		for (int i = 0; i < 2; i++) {
			newArray[i] = a[i];
			newArray[i + 2] = b[i];
		}
		return newArray;
	}

	// swapEnds

	public int[] swapEnds(int[] nums) {
		int l = nums.length;
		int a = 0;
		a = nums[0];
		nums[0] = nums[l - 1];
		nums[l - 1] = a;
		return nums;
	}

	// midThree
	public int[] midThree(int[] nums) {
		int l = nums.length / 2;
		int[] newArray = new int[3];
		for (int i = 0; i < 3; i++) {
			newArray[i] = nums[l - 1 + i];
		}
		return newArray;
	}

	// maxTriple
	public int maxTriple(int[] nums) {
		int l = nums.length;
		int max = nums[0];
		if (max < nums[l / 2])
			max = nums[l / 2];
		if (max < nums[l - 1])
			max = nums[l - 1];
		return max;
	}

	// frontPiece
	public int[] frontPiece(int[] nums) {
		int newArrayLength;
		if (nums.length > 1)
			// int[] newArray = new int[2];
			newArrayLength = 2;
		else
			// int[] newArray = new int[nums.length];
			newArrayLength = nums.length;

		int[] newArray = new int[newArrayLength];
		for (int i = 0; i < nums.length; i++) {
			newArray[i] = nums[i];
			if (i == 1)
				break;
		}
		return newArray;
	}

	// unlucky1
	public boolean unlucky1(int[] nums) {
		if (nums.length < 2)
			return false;

		if (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3
				|| nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)
			return true;

		return false;

	}

	// make2
	public int[] make2(int[] a, int[] b) {
		int[] newArray = new int[2];

		for (int i = 0; i < a.length; i++) {
			newArray[i] = a[i];
			if (i == 1)
				break;
		}
		for (int j = a.length, k = 0; j < 2; j++, k++) {
			newArray[j] = b[k];
			if (j == 1)
				break;

		}
		return newArray;
	}

	// front11
	public int[] front11(int[] a, int[] b) {
		int l = 0;
		int k = 0;
		if (a.length > 0)
			l++;
		if (b.length > 0)
			l++;
		int[] newArray = new int[l];
		if (a.length > 0) {
			newArray[k] = a[0];
			k++;
		}
		if (b.length > 0) {
			newArray[k] = b[0];
			k++;
		}
		return newArray;
	}
}
