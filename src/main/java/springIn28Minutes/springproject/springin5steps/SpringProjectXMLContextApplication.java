package springIn28Minutes.springproject.springin5steps;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIn28Minutes.springproject.springin5steps.basic.BinarySearchImpl;
import springIn28Minutes.springproject.springin5steps.xml.XMLPersonDAO;

@Configuration
@ComponentScan
public class SpringProjectXMLContextApplication {

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//binarySearch.binarySearch(new int[]{123, 4, 6}, 3);
		//int result = binarySearch.binarySearch(new int[]{123, 4, 6}, 3);
		//System.out.println(result);
//		ApplicationContext applicationContext=
//				new AnnotationConfigApplicationContext(SpringProjectXMLContextApplication.class);
//				//SpringApplication.run(SpringProjectBasicApplication.class, args);
		try(ClassPathXmlApplicationContext applicationContext1 =
		new ClassPathXmlApplicationContext("co.xml")) {
			XMLPersonDAO xmlPersonDAO = applicationContext1.getBean(XMLPersonDAO.class);
			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getJdbcConnection());
		}
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		int result = binarySearch.binarySearch(new int[] {1,2,4}, 3);
//		System.out.println(result);

	}
}
