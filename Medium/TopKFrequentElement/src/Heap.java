import java.util.PriorityQueue;
import java.util.Queue;

public class Heap {
    public static void main(String args[]) 
    { 
        // Creating an empty PriorityQueue 
        Queue<String> queue = new PriorityQueue<String>(); 
  
        // Use add() method to add elements into the Queue 
        queue.add("Welcome"); 
        queue.add("To"); 
        queue.add("Geeks"); 
        queue.add("For"); 
        queue.add("Geeks"); 
        
        /*The word "For" appears at the head of the "PriorityQueue" because "PriorityQueue" in Java, by default, orders its elements
        according to their natural ordering. For Strings, the natural ordering is lexicographical order (dictionary order). */ 
        

        // Displaying the PriorityQueue 
        System.out.println("Initial PriorityQueue: " + queue); 
  
        // Fetching and removing the element at the head of the queue 
        System.out.println("The element at the head of the"
                           + " queue is: " + queue.poll()); 
  
        // Displaying the Queue after the Operation 
        System.out.println("Final PriorityQueue: " + queue); 
    } 
}
