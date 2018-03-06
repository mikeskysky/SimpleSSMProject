package com.soecode.lyf.entity;

import org.springframework.beans.factory.annotation.Value;

public class SystemPropertie 
{
	@Value("${mf_sms_success_content}")
	private String mfSmsSuccessContent;

	public String getMfSmsSuccessContent() {
		return mfSmsSuccessContent;
	}

	public void setMfSmsSuccessContent(String mfSmsSuccessContent) {
		this.mfSmsSuccessContent = mfSmsSuccessContent;
	}
}
