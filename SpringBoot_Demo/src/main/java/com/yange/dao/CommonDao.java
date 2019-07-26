package com.yange.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yange.user.BaseBean;

@Repository
public interface CommonDao<T extends BaseBean> extends JpaRepository<T,Long> {
	
}
