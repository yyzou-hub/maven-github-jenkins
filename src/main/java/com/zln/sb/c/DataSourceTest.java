package com.zln.sb.c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSourceTest {
	
	//获取当前多环境配置的选中的数据源 ，application.properties中配置的
	@Value("${test.url}")
	private String domain;
	
	@GetMapping("/url")
	public Object getDataSourceUrl() {
		return domain;
	}

}
