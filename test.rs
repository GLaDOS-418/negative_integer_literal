fn f( ) -> i64 {
    return -1;
}

fn g( ) -> i64 {
    return 0xffffffff;
}

fn main( ) {
    println!("{}\n{}", f( ), g( ));
}
