public class test {
  static long f( ){
    return -1;
  }

  static long g( ){
    return 0xffffffff;
  }

  public static void main( String[ ] args ){
    System.out.println( f( ) );
    System.out.println( g( ) );
  }
}
