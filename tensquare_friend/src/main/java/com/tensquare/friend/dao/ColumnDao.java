package com.tensquare.friend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.friend.pojo.Column;
/**
 * column数据访问接口
 * @author Administrator
 *
 */
public interface ColumnDao extends JpaRepository<Column,String>,JpaSpecificationExecutor<Column>{
	
}
