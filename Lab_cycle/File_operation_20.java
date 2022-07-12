import java.io.* ;
class Console
 {

   public static void main(String[ ] args ) {

       try {

                FileWriter fw = new FileWriter(" abc.txt" ) ;

                fw.write(" Once upon a time, there lived a Ghost..");

                fw.close( ) ;

               System.out.println("\n File written ") ;
               char c ;
               FileReader fr=new FileReader(" abc.txt" ) ;
               BufferedReader in=new BufferedReader( fr ) ;
               
               String line=in.readLine( ) ;
               
               while ( line != null )
                  {
                     System.out.println(line) ;
                     line=in.readLine( ) ;
                  }
               in.close( ) ;
               fr.close( ) ;
            }

         catch ( IOException e ) {

               System.out.println(" There a r e some IOException " ) ;
         }
    }
}
