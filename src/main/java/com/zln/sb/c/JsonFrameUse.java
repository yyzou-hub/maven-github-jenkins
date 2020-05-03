package com.zln.sb.c;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zln.sb.bean.User;

/**
 *常用json框架包括阿里fastjson，谷歌gson
 *springboot使用的是Jackson
 *性能方面 jackson(json)>fastjson>gson>json-lib
 *json主要处理
 *1.制定字段不返还 @JsonIgnore
 * */
@RestController
public class JsonFrameUse {
	private Map<String,Object> params=new HashMap<String,Object>();
	@RequestMapping("/json/test")
    public Object testJson(User user){
		params.clear();
		user= new User("zhagnsan","123456","234");
		params.put("data", user);
        return params;//接口返回json格式数据
    }
}
