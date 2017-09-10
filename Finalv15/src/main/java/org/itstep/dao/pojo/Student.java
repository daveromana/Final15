package org.itstep.dao.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "STUDENTS")
public class Student extends User{
	
	@Column(name = "Group", nullable = false)
	@OneToMany(targetEntity = Group.class)
	private long groupId;

}
