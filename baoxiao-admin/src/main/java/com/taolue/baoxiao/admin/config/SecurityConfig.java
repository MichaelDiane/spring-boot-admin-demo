package com.taolue.baoxiao.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/** 
* @author Michael.Zhang
* @version 创建时间：Jan 17, 2019 4:06:48 PM 
* @desc [自定义安全配置类] 
*/
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login.html","/**/*.css","/img/**","third-party/**").permitAll();
		http.authorizeRequests().antMatchers("/**").authenticated();
		http.httpBasic();
	}
	
}
