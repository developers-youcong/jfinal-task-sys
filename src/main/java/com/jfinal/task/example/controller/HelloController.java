package com.jfinal.task.example.controller;

import com.jfinal.core.Controller;

public class HelloController extends Controller {
   

	public void index() {
       renderText("Hello JFinal World.");
    }
    

    public void json() {
    	renderJson("Hello JFinal World.");
    }
}
