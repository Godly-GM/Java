import java.awt.* ;
import java.util.* ;
public class IllustrationMap {
   public static void main ( String[ ] args )
     {
       Map<Integer , Integer > map= new HashMap<>();

        map.put(1,10);
        map.put(2 , 30 ) ;
        map.put (3 ,20 ) ;
        System.out.println ( "Original Map: " ) ;
        for (Map.Entry<Integer , Integer > e : map.entrySet( ) )
          System.out.println(e.getKey( ) +" "+ e.getValue ( ) ) ;
        map.remove(2 ) ;
        System.out.println("Map after removing 2: " ) ;
       for (Map.Entry<Integer , Integer > e : map.entrySet ( ) )
         System.out.println(e.getKey( ) +" "+e.getValue( ) ) ;
       map.replace(3 , 500 ) ;
       System.out.println("Map after changing value of 3 : " ) ;
       for (Map.Entry<Integer , Integer > e : map.entrySet ( ) )
            System.out.println(e.getKey( ) + " "+ e.getValue ( ) ) ;
   }
}
