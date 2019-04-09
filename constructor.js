// class Particle {
//     constructor(startX, startY){
//         this.startX = startX;
//         this.starY = startY;
//         this.velocity = function (x:0, y:0){
//     }
//         console.log ()

function Particle (startX, startY) {
    this.x = startX;
    this.y = startY;
    velocity = {x:0, y:0};
}
    const particles = []; //empty array that's named particles.
    for (let i=0; i<100; i++) {
        particles.push(new Particle (i, Math.random() * 500));
    }

    console.log(particles);