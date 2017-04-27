package cn.dao;

import java.sql.SQLException;

import cn.util.dao.IBaseDAO;
import cn.vo.Dept;

public interface IDeptDAO extends IBaseDAO<Integer, Dept> {
	public Integer findAutoId() throws SQLException ;
}
