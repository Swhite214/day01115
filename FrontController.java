package ex;

public class FrontController {

	
	
	public void doPost(String id, String pw, String name) {//String... pa 배열로인식 오직 매개변수쪽에만 사용가능
		// TODO Auto-generated method stub
		MemberSaveRequest dto = new MemberSaveRequest();
		System.out.println(dto);//객체변수는 tostring을 생략해도 출력문장에 아무것도 없다면 자동으로 tostring을 출력합니다.
	}
	
}
