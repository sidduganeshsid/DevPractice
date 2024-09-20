package lazyinitialization.spring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
public class LazyInitialization {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(LazyInitialization.class);
		
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("initialization of context is completed.");
		
//		context.getBean(ClassB.class).doSomething();
		
	}

}

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		//complex initialization logic
		System.out.println("some initialization");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("lazy initialization");
	}
}