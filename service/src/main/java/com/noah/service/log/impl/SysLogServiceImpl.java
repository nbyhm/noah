package com.noah.service.log.impl;

import com.noah.dao.model.SysLog;
import com.noah.service.base.impl.BaseService;
import com.noah.service.log.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author nanbo
 * @description
 * @create 2018-11-03
 **/
@Slf4j
@Service("sysLogService")
public class SysLogServiceImpl extends BaseService<SysLog> implements SysLogService {

	@Override
	public List<SysLog> list(Map<String, Object> params) {
		String key = (String)params.get("key");
		try {
			Example example = new Example(SysLog.class);
			Example.Criteria criteria = example.createCriteria();
			if (StringUtils.isNotBlank(key)) {
				criteria.orCondition("username like", "%" + key + "%")
						.orCondition("operation like", "%" + key + "%");
			}
			example.setOrderByClause("create_date desc");
			return this.selectByExample(example);
		} catch (Exception e) {
			log.error("获取系统日志失败" + e);
			return new ArrayList<>();
		}
	}
}
