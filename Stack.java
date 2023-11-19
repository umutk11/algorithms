import java.util.*;

public class Stack {
    private Node first = null;
   
    private class Node{  
        String item;
        Node next; 
    }
   
    public boolean isEmpty(){
        return first == null;  
    }
    
    public void push(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }   
   public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    } 
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        String push="xxx";
        list.push(push);
        System.out.println(list);
        System.out.println(list.pop());
    }
}
