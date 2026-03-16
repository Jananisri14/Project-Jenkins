package JavaCore;
import java.util.*;
public class Collection9 {

	public static void main(String[] args) {
		TreeMap<String,Double> tm=new TreeMap<>();
		System.out.println("Size of the TreeMap: "+tm.size());
		tm.put("John doe",4242.43);
		tm.put("Tom", 4242.44);
		tm.put("Joseph",4242.45);
		tm.put("Raj", 4242.46);
		System.out.println("Elements in the TreeMap: "+tm);
		System.out.println("Size of the TreeMap: "+tm.size());
		Set<Map.Entry<String, Double>> set=tm.entrySet();
		for(Map.Entry<String,Double>me:set){
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		
	}

}
