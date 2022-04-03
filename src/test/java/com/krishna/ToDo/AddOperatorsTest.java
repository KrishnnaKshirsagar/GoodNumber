package com.krishna.ToDo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptException;

import org.junit.jupiter.api.Test;

import com.krishna.ToDo.service.Service;

class AddOperatorsTest {

	@Test
	void addTest() throws ScriptException {
		var serv = new Service();
		List<String> b = new ArrayList<>();
		b.add("3+3+3");
		assertEquals(b,serv.addOperators("333", 9));
//		assertEquals(true,serv.addOperators("333", 9));
//		assertEquals(true,serv.addOperators("333", 2));
//		assertEquals(true,serv.addOperators("105", 5));
	}

}
