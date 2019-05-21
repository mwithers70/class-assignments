// Create a variable for the temperature and set it to 80
// Write a statement that outputs the temperature as "The temperature is 80 degrees";
// If the temp is greater than 80, output "time to swim" (set temp to 60, 90) and test;
// Create a precipitation variable and set it to false
// Only output "time to swim" if temp is greater than 80 and its not raining
// Set the precipitation variable to 'raining' or 'snowing' and only output 'time to swim' if there is no precipitation
// Create an 'indoors' variable and set it to true
// If indoors, then output 'time to swim' regardless of the temp and precip.


var temp = 85;
var precipitation = false;
var indoors = true;

console.log("The temperature is " + temp + " degrees");

if (temp > 80 && precipitation === false) {
  console.log("time to swim!");
} else if (indoors) {
  console.log("time to swim!");
}