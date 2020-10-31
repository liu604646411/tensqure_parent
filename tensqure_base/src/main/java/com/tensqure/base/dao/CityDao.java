package com.tensqure.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensqure.base.pojo.City;
/**
 * city数据访问接口
 * @author Administrator
 *
 */
public interface CityDao extends JpaRepository<City,String>,JpaSpecificationExecutor<City>{
	
}
