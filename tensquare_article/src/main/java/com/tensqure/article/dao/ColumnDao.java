package com.tensqure.article.dao;

import com.tensqure.article.pojo.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * column数据访问接口
 * @author Administrator
 *
 */
public interface ColumnDao extends JpaRepository<Column,String>,JpaSpecificationExecutor<Column>{
	
}
