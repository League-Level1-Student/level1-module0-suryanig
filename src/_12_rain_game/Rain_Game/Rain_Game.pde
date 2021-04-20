 int y = 0;
 int x = (int) random(width);
 int score = 0;
void setup(){
  size (500,500);
}


void draw(){
  background(0,0,0);
  fill(#3BD4E0);
  stroke(#3BB5E0);
  ellipse(x, y, 10, 20);
  y = y + 7;
  if (y >= height){
   y = 0; 
   checkCatch(x);
   x = (int) random(width);
  }
  fill(255,0,0);
  rect(mouseX,400,100,150);
  ellipse(mouseX + 50,400,100,50);
  stroke(255,0,0);
  ellipse(mouseX + 50,495,100,50);
  fill(255,255,255);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
