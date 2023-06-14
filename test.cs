using System;

public class test 
{
  static long f() {
    return -1;
  }

  static long g() {
    return 0xffffffff;
  }

  public static void Main() {
    Console.WriteLine( f( ) );
    Console.WriteLine( g( ) );
  }
}
