package com.creational.factorymethod.example1;

public class LoggerProviderFactory {

	public static Logger getLoggerProvider(Class clazz) {
		
		if (clazz == SLF4JLogger.class) {
			return new SLF4JLogger();
		}
		return new Log4jLogger();
	}
}
