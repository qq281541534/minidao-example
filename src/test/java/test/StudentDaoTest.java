package test;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.minidao.example.dao.StudentDao;
import com.minidao.example.entity.Classs;
import com.minidao.example.entity.Student;

import spring.SpringTestCase;

/**
 * 
 * @Description:
 * @author LiuYu
 * @date 2014-6-26 下午10:31:53
 * 
 */
public class StudentDaoTest extends SpringTestCase {

	@Resource
	private StudentDao studentDao;

	String id = "402880e740a6232";

//	@Test
	public void testInsert() {
		Classs clz = new Classs();
		clz.setId("001");
		Student stu = new Student();
		stu.setId(id);
		stu.setAge(18);
		stu.setName("王磊1");
		stu.setClasss(clz);
		studentDao.insert(stu);
	}

	// @Test
	public void testUpdate() {
		Classs clz = new Classs();
		clz.setId("002");
		Student stu = new Student();
		stu.setId(id);
		stu.setAge(30);
		stu.setName("zhangsan");
		stu.setClasss(clz);
		studentDao.update(stu);
	}

	// @Test
	public void testDelete() {
		studentDao.delete(id);
	}

	// @Test
	public void testgetById() {
		System.out.println(studentDao.getCount()
				+ "----------------------+++++");
	}

//	@Test
	public void testgetListByPage() {
		List<Map> l = studentDao.getListByPage(new Student(), 1, 2);
		for(Map mp:l){
			logger.info(mp.get("id"));
			logger.info(mp.get("name"));
			logger.info(mp.get("age"));
			logger.info(mp.get("classId"));
		}
	}
	
	@Test
	public void testgetAll() {
		List<Map> l = studentDao.getList(new Student());
		for(Map mp:l){
			logger.info(mp.get("id"));
			logger.info(mp.get("name"));
			logger.info(mp.get("age"));
			logger.info(mp.get("classId"));
		}
	}
}
