package org.itstep.dao.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "LESSONS")

public class Lesson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	
	@Column(name = "GROUP", nullable = false)
	//@OneToMany(targetEntity = Group.class)
	private String groupId;
	
	@Column(name = "TEACHER", nullable = false)
	//@OneToMany(targetEntity = Teacher.class)
	private String teacher;
	
	
	@Column(name = "START_TIME")
	private long startTime;
	
	@Column(name = "DURATION")
	private long duration;
	
	@Column(name = "ROOM")
	private long room;
}
