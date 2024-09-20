package xmlconfig.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


@Configuration
@ComponentScan
public class PrePostLauncherApplication {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(PrePostLauncherApplication.class);
		System.out.println("initialization of context is completed.");
		
		
	}

}

@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		this.someDependency = someDependency;
	}
	
	@PostConstruct
	public void initialization() {
		System.out.println("some initialization");
	}
	
	
}

@Component
class SomeDependency{
	
	public void getReady() {
		System.out.println("some logic of somedependency");
	}
}