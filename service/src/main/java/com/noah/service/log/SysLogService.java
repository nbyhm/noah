package com.noah.service.log;

import com.noah.dao.model.SysLog;
import com.noah.service.base.IService;

import java.util.List;
import java.util.Map;

/**
 * @author nanbo
 * @description
 * @create 2018-11-03
 **/
public interface SysLogService extends IService<SysLog> {

	/**
	 * 查询列表
	 * @param params
	 * @return
	 */
	List<SysLog> list(Map<String, Object> params);
}
