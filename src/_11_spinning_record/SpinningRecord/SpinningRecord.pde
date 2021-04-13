PImage record; 
int angle = 0;
void setup() {
  size(600, 600);                                 
  record = loadImage("record.png");
  record.resize(600,600);
  
}

void draw() {
  if(mousePressed){
  angle = angle + 3;
  }
  rotateImage(record, angle);
  image(record,0,0);
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
