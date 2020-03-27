package chap02.variables;
//변수 범위
public class Variables4Scope {
	public static void main(String[] args) {
		int var1 = 10;//변수는 선언된 블럭 안에서 사용가능하다.
		
		if (true) {
			int var2 = 20;
			var1 = 30;
			System.out.println(var1);//var1은 if블록 밖 main블록안에서 선언되어 if블록에서도 사용가능하다.
			
			var2 = 40;
			System.out.println(var2);//var2는 if블록 안에서 선언되어 if블록에서 사용가능
		}
		/*
		var2 = 50;
		System.out.println(var2);//if블록을 벗어나 var2 사용불가
		*/
	}
}
