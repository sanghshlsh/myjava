package chap07.exercises.exercise8;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends B {
}

class F extends C {
}

public class Exercise8 {
	public static void main(String[] args) {
		B b = new E();

		method(new E());
	}

	public static void method(B b) {

	}
}
