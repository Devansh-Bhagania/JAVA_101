package array;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistdemo{
    public static void main(String[] args){
        ArrayList<String> List = new ArrayList<String>();
        List.add("Hello");
        List.add("World");
        List.add("Java");
        List.add("Programming");
        List.add("Language");
        List.add("is");
        List.set(0,"hi");
        List.remove(2);
        // List.clear();
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);
        System.out.println(List.get(0));
    }
}
