package codingbat.logic;

public class Logic1 {
	// cigarParty
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend)
			return cigars >= 40;
		return cigars >= 40 && cigars <= 60;
	}

	// dateFashion
	public int dateFashion(int you, int date) {
		if (date < 3 || you < 3)
			return 0;
		if (date > 7 || you > 7)
			return 2;
		return 1;
	}

	// isSummer
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer)
			return temp >= 60 && temp <= 100;
		return temp >= 60 && temp <= 90;
	}

	// caughtSpeeding
	public int caughtSpeeding(int speed, boolean isBirthday) {
		int low = 60;
		int high = 80;
		if (isBirthday) {
			low += 5;
			high += 5;
		}
		if (speed <= low)
			return 0;
		if (speed > high)
			return 2;
		return 1;
	}

	// sortaSum
	public int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum > 9 && sum < 21)
			sum = 20;
		return sum;
	}

	// alarmClock
	public String alarmClock(int day, boolean vacation) {
		if (vacation)
			return day == 0 || day == 6 ? "off" : "10:00";
		return day == 0 || day == 6 ? "10:00" : "7:00";
	}

	// love6
	public boolean love6(int a, int b) {
		int dif = Math.abs(a - b);
		int sum = a + b;
		return a == 6 || b == 6 || dif == 6 || sum == 6;
	}

	// in1To10
	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode)
			return n <= 1 || n >= 10;
		return n >= 1 && n <= 10;
	}

	// specialEleven
	public boolean specialEleven(int n) {
		return n % 11 <= 1;
	}

	// more20
	public boolean more20(int n) {
		return n % 20 == 1 || n % 20 == 2;
	}

	// old35
	public boolean old35(int n) {
		return n % 3 == 0 & n % 5 != 0 || n % 5 == 0 && n % 3 != 0;
	}

	// less20
	public boolean less20(int n) {
		return n % 20 == 18 || n % 20 == 19;
	}

	// nearTen
	public boolean nearTen(int num) {
		return num % 10 <= 2 || num % 10 >= 8;
	}

	// teenSum
	public int teenSum(int a, int b) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19)
			return 19;
		return a + b;
	}

	// answerCell
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		return isAsleep ? !isAsleep : isMorning ? isMom : !isMorning;
	}

	// teaParty
	public int teaParty(int tea, int candy) {
		int max = tea;
		int min = candy;
		if (tea < candy) {
			max = candy;
			min = tea;
		}
		if (min < 5)
			return 0;
		if (max >= 2 * min)
			return 2;
		return 1;
	}

	// fizString
	public String fizzString(String str) {
		String result = "";
		if (str.charAt(0) == 'f')
			result += "Fizz";
		if (str.charAt(str.length() - 1) == 'b')
			result += "Buzz";
		if (result.equals(""))
			result = str;
		return result;
	}

	// fizzString2
	public String fizzString2(int n) {
		int m3 = n % 3;
		int m5 = n % 5;
		String result = "!";
		if (m5 == 0)
			result = "Buzz" + result;
		if (m3 == 0)
			result = "Fizz" + result;
		if (m5 != 0 && m3 != 0)
			result = n + result;
		return result;
	}

	// twoAsOne
	public boolean twoAsOne(int a, int b, int c) {
		return a + b == c ? true : b + c == a ? true : c + a == b;
	}

	// inOrder
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		return bOk ? c > b : c > b && b > a;
	}

	// inOrderEqual
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		return equalOk ? a <= b && b <= c : a < b && b < c;
	}

	// lastDigit
	public boolean lastDigit(int a, int b, int c) {
		int ma = a % 10;
		int mb = b % 10;
		int mc = c % 10;
		return ma == mb || mb == mc || mc == ma;
	}

	// lessBy10
	public boolean lessBy10(int a, int b, int c) {
		int max = a;
		int min = c;
		if (b >= a)
			max = b;
		if (c >= a && c >= b)
			max = c;
		if (c >= a && a <= b)
			min = a;
		if (c >= b && b <= a)
			min = b;
		return max - min >= 10;
	}

	// withoutDoubles
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles && die1 == die2)
			return die1 == 6 ? die2 + 1 : die1 + die2 + 1;
		return die1 + die2;
	}

	// maxMod5
	public int maxMod5(int a, int b) {
		if (a == b)
			return 0;
		int c;
		if (b > a) {
			c = a;
			a = b;
			b = c;
		}
		return a % 5 == b % 5 ? b : a;
	}

	// redTicket
	public int redTicket(int a, int b, int c) {
		if (a == b && b == c)
			return a == 2 ? 10 : 5;
		return Math.abs(a - b) == Math.abs(a - c) ? 1 : 0;
	}

	// greenTicket
	public int greenTicket(int a, int b, int c) {
		if (a == b)
			return b == c ? 20 : 10;
		return b == c ? 10 : c == a ? 10 : 0;
	}

	// blueTicket
	public int blueTicket(int a, int b, int c) {
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;
		if (ab == 10 || bc == 10 || ac == 10)
			return 10;
		return ab == bc + 10 || ab == ac + 10 ? 5 : 0;
	}

	// shareDigit
	public boolean shareDigit(int a, int b) {
		int da = a / 10;
		int db = b / 10;
		int ma = a % 10;
		int mb = b % 10;
		return da == db || da == mb || ma == db || ma == mb;
	}

	// sumLimit
	public int sumLimit(int a, int b) {
		int al = String.valueOf(a).length();
		int sl = String.valueOf(a + b).length();
		return al == sl ? a + b : a;
	}
}
