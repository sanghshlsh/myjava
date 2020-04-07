package codingbat.warmup;

public class Warmup2 {
	// stringTimes
	public String stringTimes(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}

	// frontTimes
	public String frontTimes(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < str.length(); j++) {
				result += str.charAt(j);
				if (j == 2)
					break;
			}
		}
		return result;
	}

	// countXX
	int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
				count++;
		}
		return count;
	}

	// doubleX
	boolean doubleX(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				if (str.charAt(i + 1) == 'x')
					return true;
				break;
			}
		}
		return false;
	}

	// stringBits
	public String stringBits(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i = i + 2) {
			result += str.charAt(i);
		}
		return result;
	}

	// stringSplosion
	public String stringSplosion(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += str.substring(0, 1 + i);

		}
		return result;
	}

	// last2
	public int last2(String str) {
		int count = 0;
		int l = str.length();
		if (l < 3)
			return 0;
		String last = str.substring(l - 2);

		for (int i = 0; i < l - 2; i++) {
			if (str.substring(i, i + 2).equals(last))
				count++;
		}
		return count;
	}

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

//arrayFront9
	public boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9)
				return true;
			if (i == 3)
				break;
		}
		return false;

	}

	// arrayFront9_2
	public boolean arrayFront9_2(int[] nums) {
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

	// arrayFront9_3
	public boolean arrayFront9_3(int[] nums) {
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

	// arrayFront9_4
	public boolean arrayFront9_4(int[] nums) {
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
