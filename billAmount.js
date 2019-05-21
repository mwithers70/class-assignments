// var billAmount = 100;

// function gratuity(){
//     return billAmount * 0.2;
// }

// function totalWithGrat(amount){
//     return gratuity () + amount;
// }

// console.log("your total, including gratuity is: $" + totalWithGrat(billAmount).toFixed(2));

// var calculator = {
//     add: function (a,b){
//         return a+b;
//     }
// }
// calculator.add(2,3)
//Anonymous function

// var arrayWow = [ //first part of array, so ['anonymous', 'array'] = 0
//     ['anonymous', 'array'], //second part of an array, so 'array' = 1
//     {name: 'anonymous object'},
//     function(){return 'Anonymous function'}
// ]

// console.log(arrayWow[0][1]); //to find array
// console.log(arrayWow[1].name); //to find 'anonymous object' within this array
// console.log(arrayWow[2]()); //anonymous function
// }


function add(number1, number2) {
	return number1 + number2;
}

var sum = add(1,2);
console.log(sum); // 3