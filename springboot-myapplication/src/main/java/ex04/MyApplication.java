package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * @SpringBootApplication 메타 어노테이션
 * 
 *  + @SpringBootConfiguration: cf) ex01, ex02
 *  + @ComponentScan : ex04 하부 패키지를 스캐닝 한다. cf) ex03
 *  + @EnableAutoConfiguration :
 *  	1. MVC, AOP, Security, JPA 등을 자동 "default"(***미세설정 필수***) 설정
 *  	2. 발견된 Starter Dependency(Library) 기반으로 설정한다.
 *  
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){
		}
	}

}
