//package springIn28Minutes.springproject.springin5steps;
//
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import springIn28Minutes.springproject.springin5steps.scope.PersonDAO;
//
//@SpringBootApplication
//// @ComponentScan("/home/given/Downloads/spring-project/src/main/java/springIn28Minutes/springproject/componentscan")
//public class SpringProjectScopeApplication {
//
//	private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SpringProjectScopeApplication.class);
//
//	public static void main(String[] args) {
//
//		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		//binarySearch.binarySearch(new int[]{123, 4, 6}, 3);
//		//int result = binarySearch.binarySearch(new int[]{123, 4, 6}, 3);
//		//System.out.println(result);
//		ApplicationContext applicationContext=
//				SpringApplication.run(SpringProjectScopeApplication.class, args);
//		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
//		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
//		LOGGER.info("{}",personDAO.getJdbcConnection());
//		LOGGER.info("{}", personDAO1);
//
//
//		LOGGER.info("{}",personDAO);
//		LOGGER.info("{}", personDAO1.getJdbcConnection());
//
//
//		//int result = personDAO.binarySearch(new int[] {1,2,4}, 3);
//		//System.out.println(result);
//
//	}
//}
