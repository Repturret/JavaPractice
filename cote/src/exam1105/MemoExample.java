package exam1105;

public class MemoExample {

	public static void main(String[] args) {
		
		LocalRepository lr = new LocalRepository();
		NetworkRepository nr = new NetworkRepository();
		
		lr.addMemo("로컬 1번", "로컬 테스트");
		nr.addMemo("네트워크 1번", "네트워크 테스트");
		
		lr.getMemo();
		nr.getMemo();
		
		lr.updateMemo("로컬 1번", "테스트 로컬");
		nr.updateMemo("네트워크 1번", "테스트 네트워크");

		lr.deleteMemo("로컬 1번");
		nr.deleteMemo("네트워크 1번");
		
	}

}
