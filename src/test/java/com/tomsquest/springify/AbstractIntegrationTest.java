package com.tomsquest.springify;

import org.springframework.test.jpa.AbstractJpaTests;

public abstract class AbstractIntegrationTest extends AbstractJpaTests {

	@Override
	protected String[] getConfigLocations() {
		return new String[] { "classpath:com/tomsquest/springify/spring-datasource.xml", "classpath:com/tomsquest/springify/spring-beans.xml" };
	}

}
