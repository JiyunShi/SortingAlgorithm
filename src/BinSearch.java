import java.util.ArrayList;

public class BinSearch {
	
	
	public static <T extends Comparable<T>> int binSearch(ArrayList<T> array, T keyObj){
		
		int lower = 0, upper = array.size()-1;
		int position = -1;
		boolean found = false;
		while (!found && lower<=upper){
			int middle = (lower + upper)/2;
			if(array.get(middle).compareTo(keyObj)==0){
				found = true;
				position =  middle;
			}
			else if(array.get(middle).compareTo(keyObj)>0) upper = middle-1;
			else lower = middle+1;
		}
		
		return position;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
