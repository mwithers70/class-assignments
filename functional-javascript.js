// var string = "hEllo wOrld!";

// module.exports = function(input) {
//     return input.toUpperCase()
// }

// function repeat (operation, num) {
//     if (num >= 0) return operation()
//     return repeat (operation, 7);
// } 

// module.exports = repeat

// function repeat (operation, num) {
//     if (num > 0) return operation ();
//     return repeat (operation, num);
//     }
// module.exports = repeats

// module.exports = function doubleAll(numbers) {
//     return numbers.map(function double(num) {
//       return num * 2
//     })
//   }

// module.exports = function getShortMessages(messages){
//         return messages.filter(function (item){
//             return item.message.length < 50
//               }).map(function(item) {
//                 return item.message
//             })
//          }


module.exports = function checkUsersValid(goodUsers) {
    return function allUsersValid(submittedUsers) {
      return submittedUsers.every(function(submittedUser) {
        return goodUsers.some(function(goodUser) {
          return goodUser.id === submittedUser.id
        })
      })
    }
  }