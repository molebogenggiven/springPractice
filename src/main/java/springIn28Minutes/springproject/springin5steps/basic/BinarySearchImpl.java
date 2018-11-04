package springIn28Minutes.springproject.springin5steps.basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;
   // private Logger logger = LoggerFactory.getLogger(this.getClass());

    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch){
        sortAlgorithm.sort(numbers);
        return 3;
    }

    @PostConstruct
    public void postConstruct(){


    }
}
