package D31;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {

        HashMap<String, Double> fruitHashMap = new HashMap<>();

        fruitHashMap.put("fruit1",1.);
        fruitHashMap.put("fruit2",2.);
        fruitHashMap.put("fruit3",3.);
        fruitHashMap.put("fruit4",4.);
        fruitHashMap.put("fruit5",5.);
        fruitHashMap.put("fruit6",6.);
        fruitHashMap.put("fruit7",7.);
        fruitHashMap.put("fruit8",8.);
        fruitHashMap.put("fruit9",9.);
        fruitHashMap.put("fruit10",10.);

        fruitHashMap.put("Pineapple",50.001);

        System.out.println(fruitHashMap.get("Pineapple"));

        System.out.println("Map is empty: " + fruitHashMap.isEmpty());

        System.out.println("Size of the hashmap: " + fruitHashMap.size());
        
        HashMap<String, Double> berriesMap = new HashMap<>();
        berriesMap.put("Raspberry",24.23);
        System.out.println(berriesMap);

        fruitHashMap.putAll(berriesMap);

        System.out.println(fruitHashMap);

        fruitHashMap.remove("fruit10");

        System.out.println(fruitHashMap.containsKey("fruit10"));

        System.out.println(fruitHashMap.containsValue(6.));

        System.out.println(fruitHashMap.keySet());
        System.out.println(fruitHashMap.values());

        fruitHashMap.replace("fruit1",85445.);

        fruitHashMap.clear();


    }
}
