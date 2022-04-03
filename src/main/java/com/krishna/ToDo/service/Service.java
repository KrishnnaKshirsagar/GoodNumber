package com.krishna.ToDo.service;

import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@org.springframework.stereotype.Service
public class Service {
List<String> ans = new ArrayList<>();
	
    public int evaluate(String s) throws ScriptException  {
    	
    	
    	char[] k= s.toCharArray();
    	List<String> a = new ArrayList<>();
    	String temp="";
    	for(char c:k) {
    		if(Character.isDigit(c)) {
    			temp += c;
    		}
    		else {
    			a.add(temp);
    			String o ="";
    			o=Character.toString(c);
    			a.add(o);
    			temp="";
    		}
    		}
    	a.add(temp); 
    	
    	int total = Integer.parseInt(a.get(0));
    	int prev = Integer.parseInt(a.get(0));
    	for(int i = 0;i<a.size();i++) {
    		
    		if(a.get(i).equals("+")) {
    			total = total + Integer.parseInt(a.get(i+1));
    			prev = Integer.parseInt(a.get(i+1));
    			
    			
    		}
    		else if(a.get(i).equals("-")) {
    			total = total - Integer.parseInt(a.get(i+1));
    			prev = -Integer.parseInt(a.get(i+1));
    		}
    		else if(a.get(i).equals("*")) {
    			total = total - prev + prev * Integer.parseInt(a.get(i+1));	
    			prev = prev * Integer.parseInt(a.get(i+1));
    		}
    		else if(a.get(i).equals("/") && !a.contains("0")) {
    			total = total - prev + prev / Integer.parseInt(a.get(i+1));	
    			prev = prev / Integer.parseInt(a.get(i+1));
    		}
    	}
    	
    	return total;
//    	ScriptEngineManager manager = new ScriptEngineManager(null);
//    	ScriptEngine engine = manager.getEngineByName("");
//    	Object result = engine.eval(s);
//    	return (int)result;
    	}
    	
//    	Expression expression = new ExpressionBuilder(s).build();
//        double result = expression.evaluate();
    	
    
    public List<String> addOperators(String num, int target) throws ScriptException  {
    	this.num = num;
    	n = num.length();
        this.target = target;
        chars = num.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        String ch = Character.toString(chars[0]);
        rec( 1, ch);
        return ans;
//        if(!ans.isEmpty()) {  // for test
//        return true;
//        }else {
//        	return false;
//        }
        	
    }
    int n;
    String num;
    int target;
    char[] chars;
//    char[] num1 = num.toCharArray();
    public void rec(int i,String s) throws ScriptException  {
        if(i>num.length()-1) {
        	if(evaluate(s)==target) {
        		ans.add(s);
        	}
        return;
        }
        rec(i+1,s+"+"+chars[i]);
        rec(i+1,s+"-"+chars[i]);
        rec(i+1,s+"*"+chars[i]);
        rec(i+1,s+"/"+chars[i]);
    }
    
}
