package chap06.exercises.exercise15;

public class MemberService {
//작성위치
	
	public boolean login(String id, String password) {
	return id.equals("hong")&&password.equals("12345");
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
		
	}
	
}
