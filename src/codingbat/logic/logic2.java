package codingbat.logic;

public class logic2 {
	//makebricks
	public boolean makeBricks(int small, int big, int goal) {
		if (small > 5) {
			return (goal - 5 * big) <= small;
		}
		return goal / 5 <= big && goal % 5 <= small;
	}

	//loneSum
	public int loneSum(int a, int b, int c) {
		  
		int sum = 0;
		if(a!=b&&a!=c)
		sum+=a;
		if(a!=b&&b!=c)
		sum+=b;
		if(a!=c&&b!=c)
		sum+=c;
		return sum;
		}

	//luckySum
	public int luckySum(int a, int b, int c) {
		  int sum=0;
		  if(a!=13)
		  sum+=a;
		  if(b!=13&&a!=13)
		  sum+=b;
		  if(c!=13&&b!=13&&a!=13)
		  sum+=c;
		  return sum;
		}
	//noTeenSum
	public int noTeenSum(int a, int b, int c) {
		  return fixTeen(a)+fixTeen(b)+fixTeen(c);
		}

		public int fixTeen(int n){
		  if(n<13||n>19||n==15||n==16)
		  return n;
		  return 0;
		}
		
}
