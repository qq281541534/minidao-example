package com.minidao.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.framework.minidao.hibernate.IdEntity;

/**   
 *  
 * @Description: 
 * @author LiuYu   
 * @date 2014-6-23 下午10:51:25 
 *    
 */
@Entity
@Table(name = "classs")
@Inheritance(strategy = InheritanceType.JOINED)
public class Classs extends IdEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String className;

	@Column(name = "className")
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
}


