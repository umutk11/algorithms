import java.util.Stack;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class StackResize {
    private static Queue<String> queue = new LinkedList<String>();
    private static Stack<String> stack = new Stack<String>();

    //stack operators
    static void stack_push() {
        System.out.println("Enter the value you want to push:");
        Scanner pushScanner = new Scanner(System.in);
        String push=pushScanner.next();
        stack.push(push);
        System.out.println("Your stack right now: "+stack);
    }
    
    static void stack_pop() {
        System.out.println("Popped element: "+stack.pop());
        System.out.println("Your stack after pop operation: "+stack);
    }

    //queue operators
    static void queue_add() {
        System.out.println("Enter the value you want to push:");
        Scanner pushScanner = new Scanner(System.in);
        String push=pushScanner.next();
        queue.add(push);
        System.out.println("Your stack right now: "+queue);
    }
    
    static void queue_remove() {
        System.out.println("Removed element: "+queue.remove());
        System.out.println("Your stack after enqueue operation: "+queue);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Stack or Queue? ");
        String type=sc.next();
        

        System.out.println("Your choice: "+type);
        if(type.equals("stack")){
            System.out.println("You can select between push and pop operations. "+("It will continue unless you write stop."));
            
        
            while(true){
                System.out.println("Do you want to push or pop data?");
                String ans=sc.nextLine();
            
                if(ans.equals("push")){
                    stack_push();
                }

                if(ans.equals("pop")){
                   stack_pop(); 
                }

                if(ans.equals("stop")){
                    System.out.println(stack);
                    break;
                }
                else{
                    System.out.println("Valid operations are 'push', 'pop' and 'stop'");
                }
            }
        }

        if(type.equals("queue")){
            System.out.println("You can select between queue and enqueue operations. "+("It will continue unless you write stop."));

            while(true){
                System.out.println("Do you want to queue or enqueue data?");
                String ans=sc.nextLine();
            
                if(ans.equals("queue")){
                    queue_add();
                }

                if(ans.equals("enqueue")){
                    queue_remove();
                }

                if(ans.equals("stop")){
                    System.out.println(queue);
                    break;
                }
                else{
                    System.out.println("Valid operations are 'queue', 'enqueue' and 'stop'");
                }
            }
        }
    }
}