import java.util.PriorityQueue ;
import java.util.Queue ;
public class PriorityQ {
   public static void main(String args[ ] )
     {
        Queue<String> pq = new PriorityQueue <>();
        pq.add ("Welcome" ) ;
        pq.add( " have " ) ;
        pq.add( " your " ) ;
        pq.add ( " seat" ) ;
        System.out.println( " Original Queue : " + pq ) ;
        pq.remove( " your " ) ;
        System.out.println( " After Remove " + pq ) ;
        System.out.println(" Poll Method " + pq.poll( ) ) ;
        System.out.println( " Final Queue " + pq ) ;
        System.out.println( pq.peek( ) ) ;
   }
}
