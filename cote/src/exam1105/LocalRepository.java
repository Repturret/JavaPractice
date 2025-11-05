package exam1105;

public class LocalRepository implements MemoRepository {

	@Override
	public void addMemo(String id, String body) {
		
		System.out.println("로컬 위치에 " + id + " 메모가 저장되었습니다.");
		System.out.println("내용은 \"" + body + "\"입니다.");
		
	}

	@Override
	public void getMemo() {
		
		System.out.println("로컬 위치의 메모를 조회합니다.");
		
	}

	@Override
	public void deleteMemo(String id) {
		
		System.out.println("로컬 위치의 " + id + " 메모를 삭제하였습니다.");
		
	}

	@Override
	public void updateMemo(String id, String body) {
		
		System.out.println("로컬 위치의 " + id + " 메모가 수정되었습니다.");
		System.out.println("새로운 내용은 \"" + body + "\"입니다.");
		
	}

}
