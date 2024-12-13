package Hashmap;
import java.util.HashMap;


public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("Name",122);
        map.put("Age",12);
        map.put("city",11);
        for(String i:map.keySet()){
            System.out.println(i);
        }
        for(Integer i:map.values()){
            System.out.println(i);
        }
        System.out.println(map);
    }
}
