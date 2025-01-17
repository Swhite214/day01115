package interfaces;

public interface InterTest01 {
//모든 접근 제어자는 퍼블릭입니다.
	void method01();
	
	default void method02() {
		System.out.println("default 메서드에요");
	}
	//인스턴스 메서드 단 클래스에서 구현을해야 사용가능함
	static void method03() {
		System.out.println("static 메서드에요");
	}
	//스태틱메서드
	double BASE_RATE = 0.03; //static final 생략 public도 생략
}
