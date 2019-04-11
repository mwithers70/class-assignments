// Get the header element
// Get all the section elements
// Get the section element with class="current"
// Get the section that comes after the current section
// Get the h2 node from the section before the 'current' section
// Get the div that contains the section that has an h2 with a class of 'highlight'
// Get all the sections that contain an H2 (using a single statement);

const header = document.querySelector('header');
    console.log(header);

const section = document.querySelectorAll('section');
    console.log(section);

const current = document.querySelector('section.current');
    console.log(current);

const Section2 = document.querySelector('section.current').nextElementSibling;
    console.log(Section2);

const Section1 = document.querySelector('section.current').previousElementSibling//.children[0];

    console.log(Section1);

const div = document.querySelector('h2.highlight').parentElement;
    console.log(div)

// const all = Array.from(document.querySelectorAll('section h2')) .filter(function(h2) {
//     return all
// }) 

const all = Array.from(document.querySelectorAll('section h2'))
    .filter(function(grab){return grab.parentNode
    });
     console.log(all)

    //create an array.from with .filter to isolate the h2's

