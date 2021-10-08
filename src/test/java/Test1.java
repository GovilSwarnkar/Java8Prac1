import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class Test1 {

	@Test
	public void imparativeStyleOfProgramming() {
		List<Integer> list =  Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 8, 7, 8, 9);
		
		List<Integer> uniqeList = new ArrayList<Integer>();
		
		for(Integer n : list) {
			if(!uniqeList.contains(n)) {
				uniqeList.add(n);
			}
		}
		
		System.out.println("imparativeStyleOfProgramming : unique list ->" + uniqeList);
	}
	
	@Test
	public void  declrativeStyleOfProgramming() {
		List<Integer> list =  Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 8, 7, 8, 9);
		 
		List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("declrativeStyleOfProgramming : unique list ->" + uniqueList);
	}
}
