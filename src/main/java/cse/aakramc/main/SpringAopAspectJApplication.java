package cse.aakramc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopAspectJApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAopAspectJApplication.class, args);
		
		AopClass aopClass = context.getBean(AopClass.class);
		aopClass.hello();
		aopClass.printSomething("Akram Chowdhury");
		System.out.println(aopClass.sum(8, 15));
		
		AnotherClass anotherClass = context.getBean(AnotherClass.class);
		System.out.println(anotherClass.anotherMethod(16062));
	}
}