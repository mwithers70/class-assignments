console.log('my application is running')

const moment = require ('moment');
let current = new moment;
const request = require ('request-promise');
// const file = require ('')




request('http://jsonplaceholder.typicode.com/posts/1')
.then(function (response){
    console.log(response);
    console.log(current.format('h:mm:ss a'));
    })

.catch(function(err){
    })

    setInterval(function(){
        Request('http://jsonplaceholder.typicode.com/posts/1')
          .then(logResponse)
      },3000)

