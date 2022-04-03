package com.krishna.ToDo.controller;	

import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krishna.ToDo.Entity.Stobj;
import com.krishna.ToDo.service.Service;

@org.springframework.stereotype.Controller
public class Controller {
	
	List<String> k = new ArrayList<>();
	@Autowired
	private Service service;
	private Stobj st=new Stobj();
	@GetMapping(value="/gg")
	public String start1() {
		System.out.println("started");
		k.clear();
		return "gnum";
	}
	@PostMapping("/gg")
	public String calculate(@ModelAttribute("sample") Stobj st,Model model) throws ScriptException {
		
		k = service.addOperators(st.getStr1(), st.getNum());
		model.addAttribute("resultList" , k);
		System.out.println(k);
		return "result";
		
	}
	
}
