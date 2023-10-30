package D31;

import java.util.HashMap;

public class PracticeHashmapHW {
    public static void main(String[] args) {

        HashMap<String,Double> hashMapPhones = new HashMap<>();

        hashMapPhones.put("phone1",300.0);
        hashMapPhones.put("phone2",500.0);
        hashMapPhones.put("phone3",323.0);
        hashMapPhones.put("phone4",1300.0);
        hashMapPhones.put("phone5",899.0);

        System.out.println("Size of hashmap is " + hashMapPhones.size());

        System.out.println("-----------Printing hashmap keys -----------");
        for (String key:
                hashMapPhones.keySet()) {
            System.out.println(key);
        }

        System.out.println("-----------Printing hashmap valuse -----------");
        for (Double val:
                hashMapPhones.values()) {
            System.out.println(val);
        }

        if (hashMapPhones.containsKey("Iphone13")) {
            hashMapPhones.put("Iphone13",500.);
        }
        else
            hashMapPhones.put("Iphone13",500.);

        hashMapPhones.clear();

        System.out.println("map is empty: " + hashMapPhones.isEmpty());


    }
}
