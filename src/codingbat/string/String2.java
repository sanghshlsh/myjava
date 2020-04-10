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

	// repeatFront
	public String repeatFront(String str, int n) {
		String result = "";
		for (int i = n; i > 0; i--) {
			result += str.substring(0, i);
		}
		return result;
	}

	// repeatSeparator
	public String repeatSeparator(String word, String sep, int count) {
		String result = "";

		for (int i = 0; i < count; i++) {
			result += word;
			if (i < count - 1)
				result += sep;

		}
		return result;
	}

	// prefixAgain
	public boolean prefixAgain(String str, int n) {
		String pref = str.substring(0, n);

		for (int i = n; i < str.length() - n + 1; i++) {

			if (str.substring(i, i + n).equals(pref))
				return true;

		}
		return false;
	}

	// xyzMiddle
	public boolean xyzMiddle(String str) {
		int strL = str.length();
		int count = 0;
		for (int i = 0; i < strL - 2; i++) {
			if (str.substring(i, i + 3).equals("xyz") && Math.abs(i - (strL - (i + 3))) < 2)
				count++;
		}
		return count > 0;
	}

	// getSandwich
	public String getSandwich(String str) {
		int strL = str.length();
		for (int i = 0; i < strL - 4; i++) {
			if (str.substring(i, i + 5).equals("bread")) {
				for (int j = strL - 5; j > i; j--) {
					if (str.substring(j, j + 5).equals("bread")) {
						return str.substring(i + 5, j);
					}
				}
			}
		}
		return "";
	}

	// smaeStarChar
	public boolean sameStarChar(String str) {
		int count = 0;
		int sameC = 0;

		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*') {
				if (str.charAt(i - 1) == str.charAt(i + 1))
					sameC++;
				count++;
			}
		}
		return count == sameC;
	}

	// oneTwo
	public String oneTwo(String str) {

		String result = "";
		for (int i = 0; i < str.length() / 3; i++) {
			result = result + str.substring(i * 3 + 1, i * 3 + 3) + str.charAt(i * 3);
		}
		return result;

	}

	// zipZap
	public String zipZap(String str) {
		String result = "";
		for (int i = 1; i < str.length() - 1; i++) {
			if (!(str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p'))
				result += str.charAt(i);
		}
		return str.length() > 2 ? str.charAt(0) + result + str.charAt(str.length() - 1) : str;
	}

	// starOut
	public String starOut(String str) {
		String result = "";
		if (str.length() < 3) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '*')
					return result;
			}
			return str;
		}
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) != '*' && str.charAt(i + 1) != '*' && str.charAt(i - 1) != '*')
				result += str.charAt(i);
		}
		if (str.charAt(0) != '*' && str.charAt(1) != '*')
			result = str.charAt(0) + result;
		if (str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 2) != '*')
			result += str.charAt(str.length() - 1);

		return result;
	}

	// plusOut
	public String plusOut(String str, String word) {
		int strL = str.length();
		int wordL = word.length();
		int count = 0;
		String result = "";
		for (int i = 0; i < strL + 1 - wordL; i++) {
			if (str.substring(i, i + wordL).equals(word)) {
				result += str.substring(i, i + wordL);
				i += wordL - 1;
				count = i;
			}
			else {
				result += "+";
				count = i;
			}
		}
		for (int i = count + 1; i < strL; i++) {
			result += "+";
		}
		return result;
	}

	//wordEnds
	public String wordEnds(String str, String word) {
		  String result = "";
		  int sLen = str.length();
		  int wLen = word.length();
		  if(wLen>=sLen)
		  return result;
		  
		  if(str.substring(0,wLen).equals(word))
		  result+=str.charAt(wLen);
		  for(int i = 1 ; i < sLen-wLen ; i++){
		    if(str.substring(i,i+wLen).equals(word)){
		      result = result + str.charAt(i-1) + str.charAt(i+wLen);
		    }
		  }
		  if(str.substring(sLen-wLen).equals(word))
		  result+=str.charAt(sLen-wLen-1);
		  
		  
		  return result;
		}

	
}
