package springIn28Minutes.springproject.springin5steps;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springIn28Minutes.springproject.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringProjectBasicApplication {

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//binarySearch.binarySearch(new int[]{123, 4, 6}, 3);
		//int result = binarySearch.binarySearch(new int[]{123, 4, 6}, 3);
		//System.out.println(result);
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(SpringProjectBasicApplication.class);
				//SpringApplication.run(SpringProjectBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,2,4}, 3);
		System.out.println(result);

	}
}
