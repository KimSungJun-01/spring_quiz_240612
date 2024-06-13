package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/quiz01")
@Controller
public class Lesson01Quiz01Controller {
	
	// http://localhost/lesson01/quiz01/1
	@ResponseBody
	@RequestMapping("/1")
	public String quiz01_1() {
		return "<h1>테스트 프로젝트 완성</h1>" + "<h3>해다아 프로젝트를 통해서 문제 풀이를 진행합니다.</h3>";
	}
}