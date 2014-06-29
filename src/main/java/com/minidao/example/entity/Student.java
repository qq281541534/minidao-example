package com.minidao.example.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.framework.minidao.hibernate.IdEntity;

/**   
 *  
 * @Description: 学生类的实体
 * @author LiuYu   
 * @date 2014-6-23 下午10:44:56 
 *    
 */

@Entity
@Table(name = "student")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student extends IdEntity implements Serializable {

	private String name;
	private Integer age;
	private Classs classs; 
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "age")
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classId")
	public Classs getClasss() {
		return classs;
	}
	public void setClasss(Classs classs) {
		this.classs = classs;
	}
	
	
	
}


