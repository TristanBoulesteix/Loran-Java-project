package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DTBReader extends AbstractDAO {
	private static final String PROCEDURE_CALL = "{CALL getLevelByID(?)}";

	public static String ReturnMap(int id) throws SQLException {
		final CallableStatement callStatement = prepareCall(PROCEDURE_CALL);
		String map = null;
		callStatement.setInt(1, id);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();
			if (result.first()) {
				map = result.getString(0);
			}
			result.close();
		}

		return map;
	}
}
