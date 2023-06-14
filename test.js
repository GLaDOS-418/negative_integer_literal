const f = () => {
  return -1;
};

const g = () => {
  return 0xffffffff;
};

console.log(f());
console.log(g());

// notice the space between method call and integer literals

// inside paranthesis, expression evaluates to '-1' and then toString() called on `-1` int.
console.log( ( -1 ) .toString() === -1 );    // prints 'false'

// toString() applied on int `1` and then unary minus applied on the resultant string.
console.log( -1 .toString() === -1 );       // prints 'true'
