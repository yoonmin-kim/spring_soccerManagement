package dao.impl;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class soccer_UpdateMember extends SqlUpdate{
	private static String sql = "update member set team_id=? where member_id=?";
	public soccer_UpdateMember(DataSource dataSource){
		super(dataSource, sql);
		super.declareParameter(new SqlParameter("team_id", Types.INTEGER));
		super.declareParameter(new SqlParameter("member_id", Types.INTEGER));
		compile();
	}
}
