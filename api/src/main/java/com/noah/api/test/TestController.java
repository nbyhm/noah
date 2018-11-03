package com.noah.api.test;

import com.noah.dao.model.SysLog;
import com.noah.service.log.SysLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nanbo
 * @description
 * @create 2018-11-03
 **/
@Slf4j
@RestController
@Api(tags="测试接口")
public class TestController {

	@Autowired
	private SysLogService sysLogService;

	@PostMapping("/test")
	@ApiOperation("测试")
	public Object test(){
		List<SysLog> list = sysLogService.selectAll();
		SysLog sysLog = sysLogService.selectByKey(1L);
		log.info("ddsfs");
		return new Object();
	}
}
