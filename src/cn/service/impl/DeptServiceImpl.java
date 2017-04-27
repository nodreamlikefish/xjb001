package cn.service.impl;

import java.util.List;

import cn.dao.IDeptDAO;
import cn.service.IDeptService;
import cn.util.factory.Factory;
import cn.vo.Dept;

public class DeptServiceImpl implements IDeptService {

	@Override
	public List<Dept> list() throws Exception {
		IDeptDAO  deptDAO = Factory.getDAOInstance("dept.dao") ;
		return deptDAO.findAll() ;
	}

	@Override
	public boolean add(Dept vo) throws Exception {
		IDeptDAO  deptDAO = Factory.getDAOInstance("dept.dao") ;
		if(deptDAO.doCreate(vo)){
			vo.setDeptno(deptDAO.findAutoId());  
			return true ;
		}
		vo.setDeptno(0) ;
		return false ;
	}

	@Override
	public boolean edit(Dept vo) throws Exception {
		IDeptDAO  deptDAO = Factory.getDAOInstance("dept.dao") ;
		return deptDAO.doUpdate(vo) ;
	}

	@Override
	public boolean delete(int id) throws Exception {
		IDeptDAO  deptDAO = Factory.getDAOInstance("dept.dao") ;
		return deptDAO.doRemove(id) ;
	}

}
