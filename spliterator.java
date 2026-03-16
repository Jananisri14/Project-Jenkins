package JavaCore;
import java.util.*;
public class spliterator {

	public static void main(String[] args) {
		
		//Create an Arraylist
		ArrayList <Double> doubleValues= new ArrayList<Double>();
		doubleValues.add(1.0);
		doubleValues.add(2.0);
		doubleValues.add(3.0);
		doubleValues.add(4.0);
		doubleValues.add(5.0);
		doubleValues.add(6.0);                                              
		Spliterator<Double> firstHalf= doubleValues.spliterator();
		Spliterator<Double> secondtHalf= firstHalf.trySplit();
		System.out.println("Contents of ArrayList using tryAdvance");
		while(firstHalf.tryAdvance((n)->System.out.print(n+" ")));
		System.out.println();
		System.out.println("Contents of ArrayList using forEachRemaining");
		secondtHalf.forEachRemaining((n)->System.out.print(n+" "));
		System.out.println();
		}
	}