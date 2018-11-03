package com.noah.web.log;

import com.noah.dao.model.SysLog;
import com.noah.service.log.SysLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nanbo
 * @description
 * @create 2018-11-03
 **/
@Slf4j
@RestController
@RequestMapping("/sys/log")
@Api(tags = "系统日志接口")
public class SysLogController {

	@Autowired
	private SysLogService sysLogService;

	@PostMapping("/list")
	@ApiOperation("列表")
	public Object list(@RequestParam("username") String username){

		Map<String, Object> params = new HashMap<>();
		params.put("key", username);
		List<SysLog> list = sysLogService.list(params);
		log.info("系统日志列表" + list.get(0));
		return null;
	}

}
