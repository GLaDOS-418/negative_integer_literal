package main;

import (
  "fmt"
)

func f ( )  int64 {
  return -1;
}


func g ( )  int64 {
  return 0xffffffff;
}

func main( ) {
  fmt.Println( f() );
  fmt.Println( g() );
}
