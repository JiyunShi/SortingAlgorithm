import java.util.ArrayList;

public class SortClass {
	
	
	//BubbleSort
	public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> array){
		T temp;
		int size = array.size();
		T elem1, elem2;
		for (int i=0; i < size-1; i++) {
	    	 for (int index=0; index < size-1-i; index++ ) {
	    		 elem1 = array.get(index);
	    		 elem2 = array.get(index+1);
	    		 if (elem1.compareTo(elem2) > 0)
		         {
	    			 // Swap the two elements.
	    			 temp = elem1;
		             array.set(index, elem2);
		             array.set(index+1, temp);    
		         }
	    	 }
	     }
	}
		
	//SelectionSort
	public static <T extends Comparable<T>> void selectionSort(ArrayList<T> array){
		int startScan, index, minIndex;
		T minObj;
		
		for(startScan = 0; startScan<array.size()-1; startScan++){
			
			minIndex = startScan;
			minObj = array.get(startScan);
			for(index = startScan+1; index<array.size();index++){
				
				if(array.get(index).compareTo(minObj)<0){
					minObj = array.get(index);
					minIndex = index;
				}

			}
			array.set(minIndex, array.get(startScan));
			array.set(startScan, minObj);

		}

	}
	
	//InsertionSort
	public static <T extends Comparable<T>> void insertionSort(ArrayList<T> array){
		T unsortedValue = array.get(0);
		int scan=0;
		
		for(int i=1; i<array.size();i++){
			unsortedValue = array.get(i);
			scan = i;
		
		
			while(scan >0 && array.get(scan-1).compareTo(unsortedValue)>0)
			{
				array.set(scan, array.get(scan-1));
				scan--;
			}
			
			array.set(scan, unsortedValue);
		}
	}

	
	//Quick Sort
	
	public static <T extends Comparable<T>> void quickSort(ArrayList<T> array){
		doQuickSort(array, 0, array.size()-1);
	}

	public static <T extends Comparable<T>> void doQuickSort(ArrayList<T> array, int start, int end){
		if(start < end){
			
			
			
			T pivotObj = array.get(start);
			T temp;
			int endOfLeftList =  start;
			for(int scan =start +1; scan <=end; scan++){
				if(array.get(scan).compareTo(pivotObj)<0){
					endOfLeftList++;
					temp = array.get(endOfLeftList);
					array.set(endOfLeftList, array.get(scan));
					array.set(scan, temp);
				}
			}
			array.set(start, array.get(endOfLeftList));
			array.set(endOfLeftList, pivotObj);
						
			doQuickSort(array, start, endOfLeftList-1);
			doQuickSort(array, endOfLeftList+1, end);

		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
