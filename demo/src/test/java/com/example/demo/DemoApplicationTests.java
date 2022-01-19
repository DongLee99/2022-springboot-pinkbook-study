package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(value = "value=test", properties = {"property.value=propertyTest"}, classes = {DemoApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Value("${property.test.name")
	private String propertyTestName;

	@Value("${propertyTest")
	private String propertyTest;

	@Value("${noKey:default value}")
	private String defaultValue;

	@Value("${propertyTestList}")
	private String [] propertyTestArray;

	@Value("#{'${propertyTestList}'.split(',')}")
	private List<String> propertyTestList;

	@Test
	public void testValue() {
		assertThat(propertyTestName).isEqualTo("property depth test");
		assertThat(propertyTest).isEqualTo("test");

		assertThat(defaultValue).isEqualTo("default value");

		assertThat(propertyTestArray[0]).isEqualTo("a");

	}

}
