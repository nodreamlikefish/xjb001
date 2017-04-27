package cn.service;

import java.util.List;

import cn.vo.Dept;

public interface IDeptService {
	public List<Dept> list() throws Exception ;
	public boolean add(Dept vo) throws Exception ;
	public boolean edit(Dept vo) throws Exception ;
	public boolean delete(int id) throws Exception ;
}
