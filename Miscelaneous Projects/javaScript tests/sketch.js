function setup() {
createCanvas(800,600);
background(80);
}

function draw() {
  if (mouseIsPressed) {
    fill(0);
    ellipse(mouseX, mouseY, 80, 80);
    } else {
    fill(255);
    }
    
  }