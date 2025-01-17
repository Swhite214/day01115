package others;

import interfaces.InterTest01;

public class InterSub2 implements InterTest01{

	@Override
	public void method01() {
		System.out.println("클래스에서 구현한 메서드");
		
	}
	@Override
	public void method02() {
		InterTest01.super.method02();//인터페이스에서 super를 통해 디폴트 메서드를 호출합니다
	}//특히 다중상속일경우 필수 아근데 이건 메소드이름이 겹쳐서그렇네
	void test() {
		this.method02();
	}
	
}
