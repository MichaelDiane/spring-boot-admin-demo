package com.taolue.baoxiao.admin.utils.entity;

/** 
* @author Michael.Zhang
* @version 创建时间：Jan 23, 2019 6:48:44 PM 
* @desc [类说明:完整信息对象] 
*/
public class Message {
	
	private String msgType;
	
	private MsgInfo text;
	
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public MsgInfo getText() {
		return text;
	}
	public void setText(MsgInfo text) {
		this.text = text;
	}
}
