package codingbat.string;

public class String2 {
	// doubleChar
	public String doubleChar(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(i);
			result += str.charAt(i);
		}
		return result;
	}

	// countHi
	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi"))
				count++;
		}
		return count;
	}

	// catDog
	public boolean catDog(String str) {
		int countCat = 0;
		int countDog = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat"))
				countCat++;
			if (str.substring(i, i + 3).equals("dog"))
				countDog++;
		}

		return countCat == countDog;
	}

	// countCode
	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e')
				count++;
		}
		return count;
	}

	// endOther
	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		String longStr = a;
		String shortStr = b;
		if (a.length() < b.length()) {
			longStr = b;
			shortStr = a;
		}

		int longL = longStr.length();
		int shortL = shortStr.length();

		if (longStr.substring(longL - shortL).equals(shortStr))
			return true;

		return false;

	}

	// xyzThere
	public boolean xyzThere(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("xyz") && (i == 0 || str.charAt(i - 1) != '.'))
				return true;

		}
		return false;
	}

	// bobThere
	public boolean bobThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
				return true;
		}
		return false;
	}

	// xyBalance
	public boolean xyBalance(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == 'x') {
				for (int j = i; j < str.length(); j++) {
					if (str.charAt(j) == 'y')
						return true;
				}
				return false;
			}
		}
		return true;
	}

	// mixString
	public String mixString(String a, String b) {
		String longStr = a;
		String shortStr = b;
		String result = "";
		if (a.length() < b.length()) {
			longStr = b;
			shortStr = a;
		}

		for (int i = 0; i < shortStr.length(); i++) {
			result += a.charAt(i);
			result += b.charAt(i);
		}
		for (int i = shortStr.length(); i < longStr.length(); i++) {
			result += longStr.charAt(i);
		}
		return result;
	}

	// repeatEnd
	public String repeatEnd(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str.substring(str.length() - n);
		}
		return result;
	}

}
