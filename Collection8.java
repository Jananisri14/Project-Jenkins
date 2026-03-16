package JavaCore;
import java.util.*;
public class Collection8 {

	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<>();
		System.out.println("Size of the HashMap: "+hm.size());
		hm.put("John doe",4242.43);
		hm.put("Tom", 4242.44);
		hm.put("Joseph",4242.45);
		hm.put("Raj", 4242.46);
		System.out.println("Elements in the HashMap: "+hm);
		System.out.println("Size of the HashMap: "+hm.size());
		Set<Map.Entry<String, Double>> set=hm.entrySet();
		for(Map.Entry<String,Double>me:set){
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		
	}

}
