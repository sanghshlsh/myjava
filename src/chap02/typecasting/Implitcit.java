package chap02.typecasting;

public class Implitcit {
	public static void main(String[] args) {
		//자동(묵시적) 타입 변환 (Promotion)
				//작은 크기 타입 → 큰 크기 타입
				//1byte		2byte		4byte	8byte		4byte(실수)	8byte(실수)
				//byte	→	short	→	int	→	long	→	float	→	double
				//			char	↗
				//boolean
				
		byte b = 10;
		short s = b;
		//b=s;
		int i = s;
		//s=i;
		long l = i;
		//i=l;
		float f = l;
		//l=f;
		double d = f;
		//f=d;
		char c = 'a';
		
		i=c;//유니코드값이 저장된다.
		//c=i;
		
		//s=c; 같은 2byte지만 short의 양수범위보다 char의 양수범위가 넓다.
		//c=s; char의 범위에는 음수가 없기에 c=s도 불가.
		

	}
}
