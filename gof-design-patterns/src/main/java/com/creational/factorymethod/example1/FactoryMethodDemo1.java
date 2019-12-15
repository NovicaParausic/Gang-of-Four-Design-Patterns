package com.creational.factorymethod.example1;

public class FactoryMethodDemo1 {

	public static void main(String[] args) {
		
		Logger logger = LoggerProviderFactory.getLoggerProvider(Log4jLogger.class);
		logger.logMessage("hello");
		
		logger = LoggerProviderFactory.getLoggerProvider(SLF4JLogger.class);
		logger.logMessage("hello");
	}
}
