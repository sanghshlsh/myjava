package chap03.unary;

public class IncDec {
	public static void main(String[] args) {	
		//증가연산자(increment) ++
		//감소연산자(decrement) --
		
		int i = 10;
		
		i++;
		System.out.println(i);
		
		i--;
		System.out.println(i);
		
		
		--i;//증감연산자는 앞에 붙을 수 도 있다.
		System.out.println(i);
		
		++i;
		System.out.println(i);
		
		//둘의 차이는
		
		int x = 1;
		int y = 1;
		int r1 = ++x +10;// + 연산전 ++연산이 이루어지고 +연산이 이루어진다. 따라서 r1은 12가 된다.
		int r2 = y++ +10;// + 연산을 한 이후 ++연산이 이루어져 r2는 11이 된다.
		
		System.out.println(x);
		System.out.println(r1);
		System.out.println(y);
		System.out.println(r2);
		
		
	}
}
