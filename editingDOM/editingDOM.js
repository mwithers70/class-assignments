// Update the 'Coffee' item to say 'Fair Trade Coffee'
// Remove 'Twinkies' from the list
// Add an item 'Cheese Whiz'
// Clear the list and programmatically add items from the array ['protein powder', 'muscle milk', 'power bars']
// Add the class 'important' to the muscle milk item.


const take = document.getElementsByClassName ('Coffee').remove;

// const take = document.querySelector('Coffee').remove;
    console.log(take);

    var list = document.querySelector('#list');

//1
list.children[1].innerHTML = "Fair Trade Coffee";

//2
list.children[3].remove();

//3
var cheese = document.createElement('li');
cheese.innerHTML = 'Cheese Whiz';
list.appendChild(cheese);

//4
list.innerHTML = '';
['protein powder', 'muscle milk', 'power bars'].forEach(function(itemText){
	var li = document.createElement('li');
	li.innerHTML = itemText;
	list.appendChild(li);
})

//5
list.children[1].className = "important"