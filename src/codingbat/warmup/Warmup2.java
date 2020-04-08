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

	// stringMatch
	public int stringMatch(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		int min = aLength;
		int count = 0;
		if (min > bLength)
			min = bLength;
		for (int i = 0; i < min - 1; i++) {
			if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1))
				count++;
		}
		return count;
	}

	// stringX
	public String stringX(String str) {
		String result = "";
		if (str.length() < 2)
			return str;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'x')
				result += str.charAt(i);
		}
		if (str.charAt(0) == 'x')
			result = 'x' + result;
		if (str.charAt(str.length() - 1) == 'x')
			result += 'x';
		return result;
	}

	// altPairs
	public String altPairs(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i += 4) {
			result += str.charAt(i);
			if (i + 1 < str.length())
				result += str.charAt(i + 1);
		}
		return result;
	}

	// stringYak
	public String stringYak(String str) {
		String result = "";
		for (int i = 0; i < str.length() - 2; i++) {
			if (!str.substring(i, i + 3).equals("yak")) {
				result += str.charAt(i);
			} else
				i += 2;
		}
		if (!str.substring(str.length() - 3).equals("yak"))
			result += str.substring(str.length() - 2);
		return result;
	}

	// array667
	public int array667(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))
				count++;
		}
		return count;
	}
	
	//noTriples
	public boolean noTriples(int[] nums) {
		  for(int i = 0; i< nums.length-2;i++){
		    if(nums[i]==nums[i+1]&&nums[i]==nums[i+2])
		    return false;
		  }
		  return true;
		}

	//has271
	public boolean has271(int[] nums) {
		  for( int i = 0 ; i < nums.length-2;i++){
		    if(nums[i]+5==nums[i+1]&&Math.abs(nums[i+2]-nums[i]+1)<=2)
		  return true;
		    
		  }
		  return false;
		}

	
}
