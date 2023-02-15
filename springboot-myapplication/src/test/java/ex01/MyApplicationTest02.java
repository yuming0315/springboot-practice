package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * 
 * Spring Boot Test Integration
 * 
 * Error:
 * Spring Boot Test Integration(@SpringBootTest)에서는
 * @Configuration을 달고있는 설정 클래스를 스캔하지 못한다. 
 */

@SpringBootTest
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myConponentNotNull() {
		assertNotNull(myComponent);
	}
}
