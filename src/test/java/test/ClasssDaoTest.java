package test;

import javax.annotation.Resource;

import org.junit.Test;

import com.minidao.example.dao.ClasssDao;
import com.minidao.example.entity.Classs;

import spring.SpringTestCase;

/**   
 *  
 * @Description: 
 * @author LiuYu   
 * @date 2014-6-29 下午3:49:05 
 *    
 */
public class ClasssDaoTest extends SpringTestCase {
	
	@Resource
	private ClasssDao classDao;
	
	
//	@Test
	public void testInsert(){
		System.out.println("----------------------開始---------------------------");
		Classs cla = new Classs();
		cla.setClassName("一年級二班");
		classDao.saveByHiber(cla);
		System.out.println("---------------------完成----------------------");
	}
	
//	@Test
	public void testUpdate(){
		System.out.println("----------------------開始---------------------------");
		Classs cla = new Classs();
		cla.setId("402881e946e69f270146e69f2ac70000");
		cla.setClassName("二年級一班");
		classDao.updateByHiber(cla);
		System.out.println("---------------------完成----------------------");
	}
	
	@Test
	public void testDelete(){
		System.out.println("----------------------開始---------------------------");
		Classs cla = new Classs();
		cla.setId("402881e946e69f270146e69f2ac70000");
		classDao.deleteByHiber(cla);
		System.out.println("---------------------完成----------------------");
	}
}


