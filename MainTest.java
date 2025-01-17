package ex;

import java.util.Scanner;

public class MainTest {
	static FrontController controller = new FrontController();
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("아이디 입력");
	String id = sc.nextLine();
	System.out.println("패스워드 입력");
	String pw = sc.nextLine();
	System.out.println("이름 입력");
	String name = sc.nextLine();
	sc.close();
	
	//위에서 수집한 내용을 처리해줘
	controller.doPost(id,pw,name); //혹은 doGet
	
	}
}
