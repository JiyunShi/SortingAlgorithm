import java.util.*;


public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Person> aList = new ArrayList<Person>();
		Random r = new Random();
		int n = 5; 
		Person p ;
		for (int i=0; i < n ; i++) {
			p = new Person("Mr. " + (char)('A' + n) , r.nextInt(40));
			aList.add(p);
		}
		
		display(aList);
		System.out.println("===============================");
		SortClass.mergeSort(aList);
		display(aList);

	}
	
	
	private static <T> void display(AbstractCollection<T> data) {
		for (T elem : data) {
			System.out.println(elem);
		}
	}

}
