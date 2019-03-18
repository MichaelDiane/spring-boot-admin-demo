package com.taolue.baoxiao.admin.utils;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.taolue.baoxiao.admin.utils.entity.Message;
import com.taolue.baoxiao.admin.utils.entity.MsgInfo;

import cn.hutool.json.JSONUtil;

/** 
* @author Michael.Zhang
* @version 创建时间：Jan 23, 2019 6:48:44 PM 
* @desc [自定义钉盯消息工具类]
*/

public class DingDingMessageUtil {
	//钉钉申请的token Michael.Zhang 后续补充
	public static String access_token = "";
	
	public static String dingtalk_url="https://oapi.dingtalk.com/robot/send?access_token="+access_token;
	
	public static void messageSend(String context) {
		Message msg = new Message();
		msg.setMsgType("text");
		msg.setText(new MsgInfo(context));
		
		try {
			URL url = new URL(dingtalk_url);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Charest", "UTF-8");
			conn.setRequestProperty("Content-Type", "application/Json;charest=UTF-8");
			conn.connect();
			
			OutputStream out = conn.getOutputStream();
			String textMessage = JSONUtil.toJsonStr(msg);
			byte[] data = textMessage.getBytes();
			out.write(data);
			out.flush();
			out.close();
			
			InputStream in  =  conn.getInputStream();
			byte[] data2 = new byte[in.available()];
			in.read(data2);
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
