package com.soecode.lyf.service;

import java.text.MessageFormat;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soecode.lyf.entity.SystemPropertie;

@Service("sendSmsUtil")
public class SendSmsUtil 
{
	private static SystemPropertie systemPropertie;
	
	private static String successTemplate;
	
	protected String buildContent(String type,Object... content) {
		assert content.length != 0;
		assert content[0] != null;

		String buildResult = null;
		try{
			if(type.equals("W06")){
				buildResult = MessageFormat.format(successTemplate, "");
			}

		}catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("buildResult=" + buildResult);
		return buildResult;
	}

	public SystemPropertie getSystemPropertie() {
		return systemPropertie;
	}
	
	@Autowired
	public void setSystemPropertie(SystemPropertie systemPropertie) {
		SendSmsUtil.systemPropertie = systemPropertie;
	}
	/*
	 * @PostContruct是spring框架的注解，
	 * 在方法上加该注解会在项目启动的时候执行该方法，
	 * 也可以理解为在spring容器初始化的时候执行该方法。
	 */
	@PostConstruct
	public void init()
	{
		SendSmsUtil.successTemplate = systemPropertie.getMfSmsSuccessContent();
		System.out.println(SendSmsUtil.successTemplate);
	}
	
	
}
