package com.taolue.baoxiao.admin.config;

import org.springframework.context.annotation.Configuration;

import com.taolue.baoxiao.admin.bean.DingDingNotifier;

/** 
* @author Michael.Zhang
* @version 创建时间：Jan 24, 2019 8:41:54 PM 
* @desc [类说明:消息通知配置类] 
*/
@Configuration
public class NotesConfiguration {
	public DingDingNotifier dingDingNotifier() {
		return new DingDingNotifier();
	}
}
