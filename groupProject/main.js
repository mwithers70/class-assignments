const input = document.querySelector("input");
const example = document.querySelector("#example");

input.addEventListener("change", (e) => {
const rgb = getRgb(e.target.value);


const network = new brain.NeuralNetwork(); 
console.log(rgb);

network.train([
    // {input: {height: 60, weight: 150}, output: {adult: 1}}, //adult
   // {input: {height: 30, weight: 60}, output: {child: 1}}, //child
{input: {r: 0.65, g: 0.75, b: 0.85}, output: {dark: 1} },
{input: {r: 0.1, g: 0.25, b: 0.95}, output: {dark: 1} },
{input: {r: 0.74, g: 0.41, b: 0.50}, output: {light: 1} },
{input: {r: 0.31, g: 0.79, b: 0.86}, output: {light: 1} },
]);

const result = brain.likely(rgb, network);
example.style.background = e.target.value;

example.style.color = result === "dark" ? "white" : "black";
console.log(result);


// document.getElementById("example").addEventListener("click", function(){
// })

//need even listener to look for a change in my input

//brain.js and getRGB helper function
function getRgb(hex) {
    var shorthandRegex = /^#?([a-f\d])([a-f\d])([a-f\d])$/i;
    hex = hex.replace(shorthandRegex, function(m, r, g, b) {
        return r + r + g + g + b + b;
    });
  
    var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
    return result ? {
        r: Math.round(parseInt(result[1], 16) / 2.55) / 100,
        g: Math.round(parseInt(result[2], 16) / 2.55) / 100,
        b: Math.round(parseInt(result[3], 16) / 2.55) / 100,
    } : null;
}
  })