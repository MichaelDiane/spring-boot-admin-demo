package com.taolue.baoxiao.admin.bean;

import org.springframework.expression.Expression;
import org.springframework.expression.ParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.taolue.baoxiao.admin.utils.DingDingMessageUtil;

import de.codecentric.boot.admin.event.ClientApplicationEvent;
import de.codecentric.boot.admin.notify.AbstractStatusChangeNotifier;

/** 
* @author Michael.Zhang
* @version 创建时间：Jan 24, 2019 7:55:45 PM 
* @desc [类说明:自定义钉钉信息发送机制] 
*/
public class DingDingNotifier extends AbstractStatusChangeNotifier {
	
	private Expression expression;
	
	private final SpelExpressionParser parser = new SpelExpressionParser();

	public DingDingNotifier() {
		this.expression = this.parser.parseExpression("#{application.name} (#{application.id})\nstatus changed from #{from.status} to #{to.status}\n\n#{application.healthUrl}", ParserContext.TEMPLATE_EXPRESSION);
	}

	@Override
	protected void doNotify(ClientApplicationEvent event) throws Exception {
		StandardEvaluationContext context = new StandardEvaluationContext(event);
		DingDingMessageUtil.messageSend(expression.getValue(context, ParserContext.TEMPLATE_EXPRESSION).toString());
	}

	public String getExpression() {
		return this.expression.getExpressionString();
	}

	public void setExpression(String text) {
		this.expression = this.parser.parseExpression(text, ParserContext.TEMPLATE_EXPRESSION);;
	}
	

}
