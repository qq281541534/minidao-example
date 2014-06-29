package spring;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**   
 *  
 * @Description: 用于测试的包装类
 * 
 * @RunWith 这个是指定使用的单元测试执行类，这里就指定的是SpringJUnit4ClassRunner.class；
 * @ContextConfiguration 这个指定Spring配置文件所在的路径，可以同时指定多个文件；
 * @TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true) 
 * 		transactionManager默认值是transactionManager，事物管理器
 * 		defaultRollback的默认取值是true，当然，你也可以改成false。
 * 		true表示测试不会对数据库造成污染,false的话当然就会改动到数据库中了。
 * 		在方法名上添加@Rollback(false)表示这个测试用例不需要回滚。
 * @Transactional 声明开启事物
 * 
 * 
 * @author LiuYu   
 * @date 2014-6-26 下午11:01:18 
 *    
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class SpringTestCase extends AbstractJUnit4SpringContextTests {

	public <T> T getBean(Class<T> type){
		return applicationContext.getBean(type);
	}
	
	public Object getBean(String beanName){
		return applicationContext.getBean(beanName);
	}
	
	public ApplicationContext getContext(){
		return applicationContext;
	}
	
	
	
}


