import java.util.*;
public class ArrayListExp {
    public static void main ( String args[ ] ) {
        ArrayList<String>list=new ArrayList<String>( );
            list.add("Tom" ) ;
            list.add("Dick" ) ;
            list.add("Harry") ;
            list.add("John" ) ;
            list.add("Henry" ) ;
           
            System.out.println(list) ;
            System.out.println(" Returning element :"+list.get( 2 )) ;
            list.set( 2 ,"Potter " ) ;
         
            System.out.println ( " List after insertion of : newly inserted " ) ;
            for ( String word : list )
                  System.out.println( word ) ;
           
             Collections.sort(list) ;
           
            System.out.println(" \nSorted list : " ) ;
            for(String word :list )
            System.out.println( word ) ;
     }
}
