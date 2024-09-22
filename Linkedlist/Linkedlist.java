package Linkedlist;
import java.util.*;


public class Linkedlist {
        public static void main(String[] args){
                LinkedList<String> List = new LinkedList<String>();
                List.add("Hello");
                List.add("World");
                int[] arr = {1,5,2,3,4,9,7};
                for(int i=0;i<arr.length;i++){
                        List.add(String.valueOf(arr[i]));
                }
                Collections.sort(List,Collections.reverseOrder());
                System.out.println(List);
        }
}


// addFirst()	Adds an item to the beginning of the list	

// addLast()	Add an item to the end of the list	

// removeFirst()	Remove an item from the beginning of the list
	
// removeLast()	Remove an item from the end of the list	

// getFirst()	Get the item at the beginning of the list	

// getLast()	Get the item at the end of the list