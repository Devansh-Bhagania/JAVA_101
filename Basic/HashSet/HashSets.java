package HashSet;
import java.util.HashSet;


public class HashSets {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("A");
        System.out.println(hs.contains("A"));
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.charAt(0));
        System.out.println(hs);

    }
}
