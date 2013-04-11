package com.github.wreckan.client;

import java.util.Map;

import org.acra.ReportField;
import org.acra.sender.HttpSender;

public class WreckanSender extends HttpSender {

	private static final String WRECKAN_URL = "http://wreckan.pavel.st/report?accessKey=";

	public WreckanSender(String accessKey) {
		this(accessKey, null);
	}

	public WreckanSender(String accessKey, Map<ReportField, String> mapping) {
		super(Method.POST, Type.JSON, WRECKAN_URL + accessKey, mapping);
	}

}
