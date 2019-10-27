package com.jfinal.task.exmaple.router;

import com.jfinal.config.Routes;
import com.jfinal.task.example.controller.WeixinController;

public class FrontRoutes extends Routes {
	   public void config() {
	      // 这里配置只对 FrontRoutes 下的路由有效，建议这样配置以提升性能
	      setMappingSuperClass(true);
	      
	      add("/weixin", WeixinController.class);
	   }
	}
