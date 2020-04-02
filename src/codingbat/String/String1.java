package codingbat.String;

public class String1 {
	// helloName
	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	// makeAbba
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	// makeTags
	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	// makeOutWord
	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2);
	}

	// extraEnd
	public String extraEnd(String str) {
		int l = str.length();
		String s = str.substring(l - 2);
		return s + s + s;
	}

	// firstTwo
	public String firstTwo(String str) {
		return str.length() > 1 ? str.substring(0, 2) : str;
	}

	// firstHalf
	public String firstHalf(String str) {
		return str.length() > 0 ? str.substring(0, str.length() / 2) : str;
	}

	// withoutEnd
	public String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

	// comboString
	public String comboString(String a, String b) {
		int Lengtha = a.length();
		int Lengthb = b.length();

		return Lengtha > Lengthb ? b + a + b : a + b + a;
	}

	// nonStart
	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	// left2
	public String left2(String str) {
		return str.substring(2) + str.substring(0, 2);
	}

	// right2
	public String right2(String str) {
		int n = str.length();
		return str.substring(n - 2) + str.substring(0, n - 2);
	}

	// theEnd
	public String theEnd(String str, boolean front) {
		return front ? str.substring(0, 1) : str.substring(str.length() - 1);
	}

	// withouEnd2
	public String withouEnd2(String str) {
		int n = str.length();
		return n > 1 ? str.substring(1, n - 1) : "";
	}

	// middleTwo
	public String middleTwo(String str) {
		int n = str.length() / 2;
		return str.substring(n - 1, n + 1);
	}

	// endsLy
	public boolean endsLy(String str) {
		int n = str.length();
		return n > 1 ? str.substring(n - 2, n).equals("ly") : false;
	}

	// nTwice
	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n);
	}

	// twoChar
	public String twoChar(String str, int index) {
		return (str.length() - 2 < index || index < 0) ? str.substring(0, 2) : str.substring(index, index + 2);
	}

	// middleThree
	public String middleThree(String str) {
		int n = str.length() / 2;
		return str.substring(n - 1, n + 2);
	}
}
