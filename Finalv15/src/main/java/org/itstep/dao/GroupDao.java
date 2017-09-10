package org.itstep.dao;

import java.util.List;

import org.itstep.dao.pojo.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupDao extends JpaRepository<Group, Long>{//long -- primary key
	
	//@Query(value = "SELECT * FROM GROUPS WHERE COURSE = ?1 AND FILTER2 = ?2", nativeQuery = true)
	//public List<Group> findAllByCourse(int course, String fltr2);
	@Query(value = "SELECT * FROM GROUPS WHERE COURSE = ?1", nativeQuery = true)
	public List<Group> findAllByCourse(int course);

}
