var snacks = ['pop tarts', 'ramen noodles', 'chips', 'salsa', 'coffee'];
var cart = []
snacks.length

snacks.push('fruitloops'); //['pop tarts', 'ramen noodles', 'chips', 'salsa', 'coffee', 'fruitloops']
snacks[4] = 'fair trade coffee'; //hopefully change coffee to fair trade coffee
snacks.splice(2, 2, 'rice', 'beans');


// for(var i = 0; i < snacks.length; i++) {
//     console.log(snacks[i])
// }

cart.push(snacks.pop());
snacks.shift(cart.push());

while (snacks.length > 0)
cart.push((snacks.pop));
cart.sort();
cart.reverse();
console.log(cart);