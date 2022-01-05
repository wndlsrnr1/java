package start;

import java.sql.SQLException;
import java.util.List;

import end.End;

public interface StartDao {
	
	// 시작시간 저장
	public int startInsert(Start start) throws SQLException, ClassNotFoundException;
	
	// user_num으로 시작시간 조회
	public List<Start> findbyUserNum() throws ClassNotFoundException, SQLException;
	
	// DB에서 전체 조회하는 메소드
	public List<Start> startFindAll() throws ClassNotFoundException, SQLException;
	
	// DB에 user_num으로 삭제하는 메소드
	public int delete() throws ClassNotFoundException, SQLException;
	
	// StartAll
	public Start start()  throws ClassNotFoundException, SQLException;
	
	// auto_increment 초기화
	public Start auto() throws ClassNotFoundException, SQLException;
		
}
