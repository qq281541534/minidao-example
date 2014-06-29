package com.minidao.example.dao;

import java.util.List;
import java.util.Map;

import org.framework.minidao.annotation.Arguments;
import org.framework.minidao.annotation.MiniDao;
import org.framework.minidao.annotation.ResultType;
import org.framework.minidao.annotation.Sql;

import com.minidao.example.entity.Student;

/**   
 *  
 * @Description: 
 * @author LiuYu   
 * @date 2014-6-24 下午9:41:48 
 *    
 */
@MiniDao
public interface StudentDao {

	@Arguments("student")
	void insert(Student student);
	
	@Arguments("id")
	int delete(String id);
	
	@Arguments("student")
	int update(Student student);
	
	@Arguments({"student","page","rows"})
	List<Map> getListByPage(Student student, int page,int rows);
	
	@Sql("select count(*) from student")
	int getCount();
	
	@Arguments("student")
	List<Map> getList(Student student);
}


