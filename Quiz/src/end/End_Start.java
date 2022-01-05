package end;

import java.sql.SQLException;

public class End_Start {
	public static void main(String[] args) {
		
		EndDao dao = EndImp.getInstance();
		
		try {
			dao.start();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
