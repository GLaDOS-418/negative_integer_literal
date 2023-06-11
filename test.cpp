#include <iostream>

long f( ){
  return -1;
}

long g( ){
  return 0xffffffff;
}

int main( ){
  std::cout << f( ) << std::endl << g() << std::endl;
  return 0;
}
