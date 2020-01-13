let value = 255

function setup() {
  createCanvas(800,600);
  background(80);
}

function draw() {
  
  //draws an ellipse and changes blueness and opacity while mouse is pressed (blue is unchanged)
  if (mouseIsPressed) {
    fill(value, value, 255, (value*2));
    ellipse(mouseX, mouseY, 80, 80);
    value = value - 1;
  } 
}




//Wipes the canvas and resets draw color when space bar is pressed
function keyTyped() {
  if (key === ' '){
    background(80);
    value = 255;
  }
}