package org.itstep.dao.pojo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "GROUPS")
public class Group {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GROUP_ID")
	private long groupId;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "COURSE", nullable = false)
	private int course;
	
	/*public void setGroupId() {
		this.groupId = Math.abs(UUID.randomUUID().getLeastSignificantBits());
	}*/
}
