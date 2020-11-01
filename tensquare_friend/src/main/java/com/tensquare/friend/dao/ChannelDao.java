package com.tensquare.friend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.friend.pojo.Channel;
/**
 * channel数据访问接口
 * @author Administrator
 *
 */
public interface ChannelDao extends JpaRepository<Channel,String>,JpaSpecificationExecutor<Channel>{
	
}
