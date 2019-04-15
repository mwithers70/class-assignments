$('#btn1').click(function(){
    $.get('http://jsonplaceholder.typicode.com/posts', function(x) {
    console.log(x);
    }) 
})

$('#btn2').click(function(){
$.get('http://jsonplaceholder.typicode.com/posts/10',  function(x) {
    console.log(x);
    })
})

$('#btn3').click(function(){
$.get('http://jsonplaceholder.typicode.com/posts/12/comments',  function(x) {
    console.log(x);
    }) 
})

$('#btn4').click(function(){
$.get('http://jsonplaceholder.typicode.com/posts/2',  function(x) {
    console.log(x);
    }) 
})

$('#btn5').click(function(){
$.post('http://jsonplaceholder.typicode.com/posts', 
    {title:'new post', body: 'new body'}, function(post) {
        console.log(post.id)
    })
})

$('#btn6').click(function(){
$.ajax({method: 'PUT',
        url: 'http://jsonplaceholder.typicode.com/posts/12', 
            complete: function(JSON)

    })






// const btn = document.createElement("posts");
// console.log(btn);