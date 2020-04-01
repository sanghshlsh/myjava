package codingbat.warmup;

public class warmup1 {
	// sleeIn
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	// monkeyTrouble
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	// sumDouble
	public int sumDouble(int a, int b) {
		return a != b ? (a + b) : 2 * (a + b);
	}

	// dif21
	public int diff21(int n) {
		return n > 21 ? 2 * (n - 21) : (21 - n);
	}

	// parrotTrouble
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && ((hour) < 7 || (hour) > 20);
	}

	// makes10
	public boolean makes10(int a, int b) {
		return a == 10 || b == 10 || (a + b) == 10;
	}

	// nearHundred
	public boolean nearHundred(int n) {
		return Math.abs(100 - n) < 11 || Math.abs(200 - n) < 11;
	}

	// posNeg
	public boolean posNeg(int a, int b, boolean negative) {
		return negative ? (a < 0 && b < 0) : ((a < 0 && b > 0) || (a > 0 && b < 0));
	}

	// notString
	public String notString(String str) {

		if (str.length() > 2) {
			return str.substring(0, 3).equals("not") ? str : "not " + str;
		} else {
			return "not " + str;
		}
	}

	// missingChar
	public String missingChar(String str, int n) {
		return str.substring(0, n) + str.substring(n + 1);
	}

	// frontBack
	public String frontBack(String str) {
		return str.length() > 1 ? (str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0))
				: str;

	}

	// front3
	public String front3(String str) {
		return str.length() > 3 ? str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) : str + str + str;
	}

	// backAround
	public String backAround(String str) {
		char c = str.charAt(str.length() - 1);
		return c + str + c;
	}

	// or35
	public boolean or35(int n) {
		return n % 3 == 0 || n % 5 == 0;
	}

	// front22
	public String front22(String str) {
		return str.length() > 2 ? str.substring(0, 2) + str + str.substring(0, 2) : str + str + str;
	}

	// starHi
	public boolean startHi(String str) {
		return str.length() > 1 ? str.substring(0, 2).equals("hi") : false;
	}

	// icyHot
	public boolean icyHot(int temp1, int temp2) {
		return temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0;
	}

	// in1020
	public boolean in1020(int a, int b) {
		return a > 9 && a < 21 || b > 9 && b < 21;
	}

	// hasTeen
	public boolean hasTeen(int a, int b, int c) {
		return a > 12 && a < 20 || b > 12 && b < 20 || c > 12 && c < 20;
	}

	// loneTeen
	public boolean loneTeen(int a, int b) {
		return a > 12 && a < 20 && !(b > 12 && b < 20) || b > 12 && b < 20 && !(a > 12 && a < 20);
	}

	// delDel
	public String delDel(String str) {

		return (str.length() > 3) && "del".equals(str.substring(1, 4)) ? str.substring(0, 1) + str.substring(4) : str;

	}

	// mixStart
	public boolean mixStart(String str) {
		return str.length() > 2 && (str.substring(1, 3)).equals("ix");
	}

	// startOz
	public String startOz(String str) {
		String s = "";
		if (str.length() >= 1)
			if (str.charAt(0) == 'o')
				s += "o";
		if (str.length() >= 2)
			if (str.charAt(1) == 'z')
				s += "z";

		return s;
	}

	// intMax
	public int intMax(int a, int b, int c) {
		return a > b ? (a > c ? a : c) : (b > c ? b : c);
	}

	// close10
	public int close10(int a, int b) {
		return Math.abs(10 - a) == Math.abs(10 - b) ? 0 : (Math.abs(10 - a) > Math.abs(10 - b) ? b : a);
	}

	// in3050
	public boolean in3050(int a, int b) {
		return (a >= 30 && a <= 40) && (b >= 30 && b <= 40) || (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
	}

	// max1020
	public int max1020(int a, int b) {
		if (a <= 20 && a >= 10) {
			if (b <= 20 && b >= 10) {
				if (a > b)
					return a;
				return b;
			} else {
				return a;
			}
		} else if (b <= 20 && b >= 10) {
			return b;
		} else {
			return 0;
		}
	}

	// stringE
	public boolean stringE(String str) {
		int i = 0, j = 0;
		int n = str.length();
		while (i < n) {
			if (str.charAt(i) == 'e')
				j++;
			i++;
		}
		if (j < 1)
			return false;
		else if (j < 4)
			return true;
		else
			return false;
	}

	// lastDigit
	public boolean lastDigit(int a, int b) {
		return a % 10 == b % 10;
	}

	// endUp
	public String endUp(String str) {
		return str.length() < 4 ? str.toUpperCase()
				: str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
	}

	// evertNth
	public String everyNth(String str, int n) {
		int i = 0;
		int j = str.length();
		String result = "";
		while (i < j) {
			if (i % n == 0)
				result += str.charAt(i);
			i++;
		}

		return result;
	}

}
