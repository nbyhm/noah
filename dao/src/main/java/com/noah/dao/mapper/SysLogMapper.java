package com.noah.dao.mapper;

import com.noah.config.BaseMapper;
import com.noah.dao.model.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-11-01
 **/
@Component
@Mapper
public interface SysLogMapper extends BaseMapper<SysLog> {

}
