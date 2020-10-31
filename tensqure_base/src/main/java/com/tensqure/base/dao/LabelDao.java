package com.tensqure.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensqure.base.pojo.Label;
/**
 * label数据访问接口
 * @author Administrator
 *
 */
public interface LabelDao extends JpaRepository<Label,String>,JpaSpecificationExecutor<Label>{
	
}
