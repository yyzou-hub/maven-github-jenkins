package com.zln.sb.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FileController {
	@RequestMapping("/page/main")
    public Object index(){
		
        return "index";
    }
}
