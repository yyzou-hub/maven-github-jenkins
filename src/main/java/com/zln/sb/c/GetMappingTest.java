package com.zln.sb.c;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zln.sb.bean.User;
@RestController
public class GetMappingTest {
	Map<String,Object> param =new HashMap<String,Object>();
	
	@GetMapping(value="/v1/test")
    public Object getTest(String name,String password){
		
		param.put("name", name);
		param.put("password", password);
        return param;//接口返回json格式数据
    }
	/*
	 *使用bean传多个参数
	 * 使用RequestBody传递参数
	 * 这个接口可以通过post方式调试参数
	 * 返回数据是json格式，必须使用application/json
	 * */
	@RequestMapping("/v2/test")
    public Object getTest2(@RequestBody User user){
		
		//@RequestBody是可以从post慢测试中配置参数传参，如果不需要不要设置这个注解
		param.clear();
		param.put("data", user);
        return param;//接口返回json格式数据
    }
	
	/*
	 * 这个接口可以通过post方式调试参数
	 * 返回数据是json格式，必须使用application/json
	 * */
	@PostMapping("/v3/test")
    public Object getTest3(@RequestBody User user){
		param.clear();
		param.put("data", user);
        return param;//处理完成后接口返回json格式结果数据
    }
	/*
	 * 这个接口是更新接口
	 * 
	 * */
	@PutMapping("/v4/test")
    public Object getTest4(int id){
		param.clear();
		param.put("id", id);
		param.put("status", "200");
		param.put("result", "更新成功！");
        return param;//处理完成后接口返回结果数据
    }
	/*
	 * 这个接口是删除接口
	 * 
	 * */
	@DeleteMapping("/v5/test")
    public Object getTest5(String id){
		param.clear();
		param.put("id", id);
		param.put("status", "200");
		param.put("result", "删除成功！");
        return param;//处理完成后接口返回结果数据
    }
}
