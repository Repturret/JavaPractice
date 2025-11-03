package sec01.exam04;

public class Outter {
	
	// ~Java 7]
	public void method1(final int arg) {
		final int localVariable = 1;
		// 로컬 클래스에서 매개 변수, 로컬 변수 사용시 파이널 선언이 요구
		// arg = 100;
		// localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// [Java 8~
	public void method2(int arg) {
		int localVariable = 1;
		// Java 8 이후 로컬 클래스에서 매개 변수, 로컬 변수 사용시 자동으로 파이널 부여
		// arg = 100;
		// localVariable = 100;
		class Inner {
			public void method () {
				int result = arg + localVariable;
			}
		}
	}

}
