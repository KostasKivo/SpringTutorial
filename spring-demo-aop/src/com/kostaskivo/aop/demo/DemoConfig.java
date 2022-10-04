package com.kostaskivo.aop.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.kostaskivo.aop.demo","com.kostaskivo.aop.service"})
public class DemoConfig {

}
