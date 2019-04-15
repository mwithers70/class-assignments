// Using a for loop.
// Write a simple version of "99 bottles of beer on the wall"
// (note: make sure you're logging the result to the console)
// Once you get the program running, log "Hey! We need more beer!" to the console when your counter hit's 0

var bottle = 99;

for (bottle; bottle >= 0; bottle --){

  if (bottle === 0) {
    console.log("Hey! Go buy more beer!");
  } else {
      console.log(bottle + " bottles of beer on the wall");
  }
}