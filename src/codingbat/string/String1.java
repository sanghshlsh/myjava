package codingbat.string;

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

	// hasBad
	public boolean hasBad(String str) {
		if (str.length() == 3)
			return str.substring(0, 3).equals("bad");
		if (str.length() > 3)
			return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
		return false;
	}

	// atFirst
	public String atFirst(String str) {
		boolean run = true;
		while (run) {
			if (str.length() > 2)
				run = false;
			str += "@";
		}
		return str.substring(0, 2);
	}

	// lastChars
	public String lastChars(String a, String b) {
		String s = "";
		if (a.length() == 0)
			s += "@";
		else
			s += a.substring(0, 1);
		if (b.length() == 0)
			s += "@";
		else
			s += b.substring(b.length() - 1);
		return s;
	}

	// conCat
	public String conCat(String a, String b) {
		if (a.length() > 0 && b.length() > 0) {
			if (a.substring(a.length() - 1).equals(b.substring(0, 1)))
				return a.substring(0, a.length() - 1) + b;
			return a + b;
		} else
			return a + b;
	}

	// lastTwo
	public String lastTwo(String str) {
		int a = str.length();
		if (a > 1)
			return str.substring(0, a - 2) + str.substring(a - 1) + str.substring(a - 2, a - 1);
		return str;
	}

	// seeColor
	public String seeColor(String str) {
		int a = str.length();
		if (a > 2 && str.substring(0, 1).equals("r") && str.substring(1, 2).equals("e")
				&& str.substring(2, 3).equals("d"))
			return "red";
		else if (a > 3 && str.substring(0, 1).equals("b") && str.substring(1, 2).equals("l")
				&& str.substring(2, 3).equals("u") && str.substring(3, 4).equals("e"))
			return "blue";
		return "";
	}

	// frontAgain
	public boolean frontAgain(String str) {
		int i = str.length();
		int j = i / 2;
		if (j < 1)
			return false;
		return str.substring(0, 2).equals(str.substring(i - 2));
	}

	// minCat
	public String minCat(String a, String b) {
		int al = a.length();
		int bl = b.length();
		if (al > bl)
			return a.substring(al - bl) + b;
		return a + b.substring(bl - al);
	}

	// extraFront
	public String extraFront(String str) {
		if (str.length() > 2)
			str = str.substring(0, 2);
		return str + str + str;
	}

	// without2
	public String without2(String str) {
		int i = str.length();
		if (i < 2)
			return str;
		if (str.substring(0, 2).equals(str.substring(i - 2)))
			return str.substring(2);
		return str;
	}

	// deFront
	public String deFront(String str) {
		int i = str.length();
		String result = "";
		switch (i) {
		case 0:
			return result;
		case 1:
			return str.equals("a") ? str : result;
		default:
			if (str.charAt(1) == 'b')
				result = "b" + result;
			if (str.charAt(0) == 'a')
				result = "a" + result;
			result += str.substring(2);
			return result;
		}
	}

	// startWord
	public String startWord(String str, String word) {
		int sl = str.length();
		int wl = word.length();
		if (sl < wl)
			return "";
		if (str.substring(1, wl).equals(word.substring(1, wl)))
			return str.substring(0, wl);
		return "";
	}

	// withoutX
	public String withoutX(String str) {
		int l = str.length();
		int start = 0;
		if (l < 2)
			return str.equals("x") ? "" : str;
		if (str.charAt(0) == 'x')
			start++;
		if (str.charAt(l - 1) == 'x')
			l--;
		return str.substring(start, l);
	}

	// withoutX2
	public String withoutX2(String str) {
		int l = str.length();
		String result = "";
		for (int i = 0; i < l; i++) {
			if (i == 2)
				break;
			if (str.charAt(i) == 'x') {
				continue;
			}
			result = result + str.charAt(i);
		}
		if (l >= 2) {
			result = result + str.substring(2);
		}
		return result;

	}

}
