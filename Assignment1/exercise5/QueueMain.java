package ww222ag_assign1.exercise5;

public class QueueMain {
//showing how all methods work
	 public static void main(String[] args) {

	 LinkedQueue queue = new LinkedQueue();
     System.out.println("QUEUE: "+queue);
     queue.enqueue(1);
     System.out.println("QUEUE: "+queue);
     queue.enqueue(2);
     queue.enqueue(3);
     queue.enqueue(4);
     queue.enqueue(5);
     int first = queue.first();
     int last = queue.last();
     System.out.println("First: "+first+"; Last: "+last);
     System.out.println("LOOP (iteration): ");
     for (int v: queue) {
         System.out.println(v);
     }
     System.out.println("QUEUE: "+queue);

     int fst = queue.dequeue();
     System.out.println("first (dequeue): "+fst);
     System.out.println("QUEUE: "+queue);
 }
}
