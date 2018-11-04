//package springIn28Minutes.springproject.springin5steps;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import springIn28Minutes.springproject.springin5steps.basic.BinarySearchImpl;
//import springIn28Minutes.springproject.springin5steps.cdi.SomeCDIBusiness;
//
////@SpringBootApplication
//public class SpringProjectCdiApplication {
//
//	 private static Logger LOGGER = LoggerFactory.getLogger(SpringProjectCdiApplication.class);
//	public static void main(String[] args) {
//
//		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		//binarySearch.binarySearch(new int[]{123, 4, 6}, 3);
//		//int result = binarySearch.binarySearch(new int[]{123, 4, 6}, 3);
//		//System.out.println(result);
//		ApplicationContext applicationContext=
//				SpringApplication.run(SpringProjectCdiApplication.class, args);
//		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
//		LOGGER.info("{}",someCDIBusiness);
//
//
//	}
//}
