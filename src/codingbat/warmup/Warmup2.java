package codingbat.warmup;

public class Warmup2 {

	// arrayCount9
	public int arrayCount9(int[] nums) {
		int count = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 9)
				count++;
		}
		return count;
	}

	// arrayFront9
	public boolean arrayFront9(int[] nums) {
		int count = 0;

		if (nums.length > 4) {
			for (int i = 0; i < 4; i++) {
				if (nums[i] == 9)
					count++;
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 9)
					count++;
			}
		}
		return count > 0;
	}

	public boolean arrayFront9_2(int[] nums) {
		if (nums.length > 4) {
			for (int i = 0; i < 4; i++) {
				if (nums[i] == 9)
					return true;
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 9)
					return true;
			}
		}
		return false;
	}

	public boolean arrayFront9_3(int[] nums) {
		int loop = 4;
		if (nums.length < 4)
			loop = nums.length;

		for (int i = 0; i < loop; i++) {
			if (nums[i] == 9)
				return true;

		}
		return false;
	}

	// array123

	public boolean array123(int[] nums) {

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] == 3 && nums[i - 1] == 2 && nums[i - 2] == 1)
				return true;
		}
		return false;

	}

}
