package com.noah.service.base;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nanbo
 * @description 通用Service
 * @create 2018-11-01
 **/
@Service
public interface IService<T> {

	List<T> selectAll();

	T selectByKey(Object key);

	int save(T entity);

	int delete(Object key);

	int deleteBatch(List<String> list, String property, Class<T> clazz);

	int updateAll(T entity);

	int updateNotNull(T entity);

	List<T> selectByExample(Object example);
}
