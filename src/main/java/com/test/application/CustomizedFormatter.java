package com.test.application;

import org.apache.camel.spi.Registry;
import org.apache.camel.support.SimpleRegistry;
import org.apache.camel.support.processor.DefaultMaskingFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("customizedFormatter")
public class CustomizedFormatter {
	@Bean
	Registry maskingRegistry() {
		DefaultMaskingFormatter formatter = new DefaultMaskingFormatter();
		formatter.setMaskJson(true);
		formatter.addKeyword("sensitiveNumber");
		formatter.addKeyword("customKey");
		formatter.setMaskString("********");
		SimpleRegistry simpleRegistry = new SimpleRegistry();
		simpleRegistry.bind("CamelCustomLogMask", formatter);
		return simpleRegistry;
	}
}
