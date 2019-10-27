package com.jfinal.task;

import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.task.config.WebConfig;

public class App {
    
	/**
     *      开发项目时，建议新建一个 App.java 或者 Start.java 这样的专用
     *      启动入口类放置用于启动的 main 方法
     */
    public static void main(String[] args) {
        UndertowServer.start(WebConfig.class, 8090, true);
    }
 
/**    
 * 
 * jetty-server下开发
    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 80, "/", 5);
    }
    
    */
}
