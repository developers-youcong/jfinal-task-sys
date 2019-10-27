package com.jfinal.task.config;


import com.jfinal.config.*;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.task.example.controller.HelloController;
import com.jfinal.template.Engine;

import io.undertow.server.handlers.resource.ResourceHandler;
 
public class WebConfig extends JFinalConfig {
 

    public void configConstant(Constants me) {
       me.setDevMode(true);
    }
    
    public void configRoute(Routes me) {
   
        
       me.setBaseViewPath("/view");
      
       me.add("/hello", HelloController.class);
    }
    
    public void configEngine(Engine me) {
    	
//    	me.addSharedFunction("/view/common/layout.html");
//        me.addSharedFunction("/view/common/paginate.html");
//        me.addSharedFunction("/view/admin/common/layout.html");
    	
    }
    public void configPlugin(Plugins me) {
    	
 
     
        // 非第一次使用 use加载的配置，也可以先得到一个Prop对象，再通过该对象来获取值
        Prop p = PropKit.use("db_config.txt");
        DruidPlugin dp = new DruidPlugin(p.get("jdbcUrl"), p.get("user"),p.get("pwd"));
        me.add(dp);

    }
    public void configInterceptor(Interceptors me) {
//    	me.add(new AuthInterceptor());
    	
    }
    
    public void configHandler(Handlers me) {
//    	 me.add(new ResourceHandler());
    	
    }
    
 // 系统启动完成后回调
    public void onStart() {
    }
     
    // 系统关闭之前回调
    public void onStop() {
    }
}