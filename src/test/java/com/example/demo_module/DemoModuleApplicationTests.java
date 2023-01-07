package com.example.demo_module;

import com.example.demo_module.module01.Module1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoModuleApplicationTests {

	@Autowired
	private Module1 module1;

	@Test
	void contextLoads() {
	}

}
