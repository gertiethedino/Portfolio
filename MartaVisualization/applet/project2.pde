/**
 * LCC 3705 Project 2
 * Hyun Kim
 * Marta Map Visualization
 */
 
PImage img;
PImage rd, yl;
float xpos;
float ypos;
int time = 0;
int currentFrame = 0;
PImage[] frames = new PImage[24];
PFont font;

void setup() 
{
  size(1000,535);
  frameRate(60);
  xpos = width/2;
  ypos = height/2;
  img = loadImage("title1.png");
  image(img,0,0);
  rd = loadImage("train1.png");
  yl = loadImage("train2.png");
  font = loadFont("TimesNewRomanPSMT-14.vlw");
  textFont(font, 14); 
}

void draw() 
{
  stroke(255);
  //update(mouseX, mouseY);
  
  /*Yellow Line*/
  int currentTime = millis();
  if (currentTime > time +30000) {
    nextFrame();
    time = currentTime;
  }
  if (currentTime > time + 0){
    fill(255,201,14);
    rect(419, 258, 12, 15);
    fill(0,0,0);
    text("4", 454, 269);
  }
  if (currentTime > time + 999){
    fill(255,255,255);
    rect(451, 256, 15, 15);
  }
  if (currentTime > time + 1001){
    fill(0,0,0);
    text("3", 454, 269);
  }
  if (currentTime > time + 1999){
    fill(255,255,255);
    rect(451, 256, 15, 15);
  }
  if (currentTime > time + 2001){
    fill(0,0,0);
    text("2", 454, 269);
  }
  if (currentTime > time + 2999){
    fill(255,255,255);
    rect(451, 256, 15, 15);
  }
  if (currentTime > time + 3001){
    fill(0,0,0);
    text("1", 454, 269);
  }
  
  if (currentTime > time +4000){
    fill(255,201,14);
    rect(451, 256, 15, 15);
    fill(255,255,255);
    rect(419, 258, 12, 15);
    fill(0,0,0);
    text("4", 491, 269);
  }
  if (currentTime > time + 4999){
    fill(255,255,255);
    rect(488, 256, 15, 15);
  }
  if (currentTime > time + 5001){
    fill(0,0,0);
    text("3", 491, 269);
  }
  if (currentTime > time + 5999){
    fill(255,255,255);
    rect(488, 256, 15, 15);
  }
  if (currentTime > time + 6001){
    fill(0,0,0);
    text("2", 491, 269);
  }
  if (currentTime > time + 6999){
    fill(255,255,255);
    rect(488, 256, 15, 15);
  }
  if (currentTime > time + 7001){
    fill(0,0,0);
    text("1", 491, 269);
  }
  
  if (currentTime > time +8000){
    fill(255,201,14);
    rect(488, 256, 15, 15);
    fill(255,255,255);
    rect(451, 256, 15, 15);
    fill(0,0,0);
    text("3", 528, 269);
  }
  if (currentTime > time + 8999){
    fill(255,255,255);
    rect(525, 256, 15, 15);
  }
  if (currentTime > time + 9001){
    fill(0,0,0);
    text("2", 528, 269);
  }
  if (currentTime > time + 9999){
    fill(255,255,255);
    rect(525, 256, 15, 15);
  }
  if (currentTime > time + 10001){
    fill(0,0,0);
    text("1", 528, 269);
  }
  if (currentTime > time +11000){
    fill(255,201,14);
    rect(525, 256, 15, 15);
    fill(255,255,255);
    rect(488, 256, 15, 15);
    fill(0,0,0);
    text("4", 563, 272);
  }
  if (currentTime > time + 11999){
    fill(255,255,255);
    rect(561, 259, 11, 15);
  }
  if (currentTime > time + 12001){
    fill(0,0,0);
    text("3", 563, 272);
  }
  if (currentTime > time + 12999){
    fill(255,255,255);
    rect(561, 259, 11, 15);
  }
  if (currentTime > time + 13001){
    fill(0,0,0);
    text("2", 563, 272);
  }
  if (currentTime > time + 13999){
    fill(255,255,255);
    rect(561, 259, 11, 15);
  }
  if (currentTime > time + 14001){
    fill(0,0,0);
    text("1", 563, 272);
  }
  
  if (currentTime > time +15000){
    fill(255,201,14);
    rect(561, 259, 11, 15);
    fill(255,255,255);
    rect(525, 256, 15, 15);
    fill(0,0,0);
    text("3", 587, 272);
  }
  if (currentTime > time + 15999){
    fill(255,255,255);
    rect(585, 259, 11, 15);
  }
  if (currentTime > time + 16001){
    fill(0,0,0);
    text("2", 587, 272);
  }
  if (currentTime > time + 16999){
    fill(255,255,255);
    rect(585, 259, 11, 15);
  }
  if (currentTime > time + 17001){
    fill(0,0,0);
    text("1", 587, 272);
  }
  
  if (currentTime > time +18000){
    fill(255,201,14);
    rect(585, 259, 11, 15);
    fill(255,255,255);
    rect(561, 259, 11, 15);
    fill(0,0,0);
    text("4", 563, 272);
  }
  if (currentTime > time +18999){
    fill(255,255,255);
    rect(561, 259, 11, 15);
  }
  if (currentTime > time + 19001){
    fill(0,0,0);
    text("3", 563, 272);
  }
  if (currentTime > time +19999){
    fill(255,255,255);
    rect(561, 259, 11, 15);
  }
  if (currentTime > time + 20001){
    fill(0,0,0);
    text("2", 563, 272);
  }
  if (currentTime > time + 20999){
    fill(255,255,255);
    rect(561, 259, 11, 15);
  }
  if (currentTime > time + 21001){
    fill(0,0,0);
    text("1", 563, 272);
  }
  
  if (currentTime > time +22000){
    fill(255,255,255);
    rect(585, 259, 11, 15);
    fill(255,201,14);
    rect(561, 259, 11, 15);
    fill(0,0,0);
    text("4", 528, 269);
  }
  if (currentTime > time +22999){
    fill(255,255,255);
    rect(525, 256, 15, 15);
  }
  if (currentTime > time + 23001){
    fill(0,0,0);
    text("3", 528, 269);
  }
  if (currentTime > time + 23999){
    fill(255,255,255);
    rect(525, 256, 15, 15);
  }
  if (currentTime > time + 24001){
    fill(0,0,0);
    text("2", 528, 269);
  }
  if (currentTime > time + 24999){
    fill(255,255,255);
    rect(525, 256, 15, 15);
  }
  if (currentTime > time + 25001){
    fill(0,0,0);
    text("1", 528, 269);
  }
  
  if (currentTime > time +26000){
    fill(255,255,255);
    rect(561, 259, 11, 15);
    fill(255,201,14);
    rect(525, 256, 15, 15);
    fill(0,0,0);
    text("3", 491, 269);
  }
  if (currentTime > time +26999){
    fill(255,255,255);
    rect(488, 256, 15, 15);
  }
  if (currentTime > time + 27001){
    fill(0,0,0);
    text("2", 491, 269);
  }
  if (currentTime > time + 27999){
    fill(255,255,255);
    rect(488, 256, 15, 15);
  }
  if (currentTime > time + 28001){
    fill(0,0,0);
    text("1", 491, 269);
  }
  if (currentTime > time +29000){
    fill(255,255,255);
    rect(525, 256, 15, 15);
    fill(255,201,14);
    rect(488, 256, 15, 15);
  }
  if (currentTime > time +29950){
    fill(255,255,255);
    rect(488, 256, 15, 15);
  }
  
  /*Red Line*/
  if (currentTime > time + 0){
    fill(255,0,0);
    rect(569, 429, 12, 15);
    fill(0,0,0);
    text("3", 541, 446);
  }
  if (currentTime > time + 999){
    fill(255,255,255);
    rect(539, 433, 12, 15);
  }
  if (currentTime > time + 1001){
    fill(0,0,0);
    text("2", 541, 446);
  }
  if (currentTime > time + 1999){
    fill(255,255,255);
    rect(539, 433, 12, 15);
  }
  if (currentTime > time + 2001){
    fill(0,0,0);
    text("1", 541, 446);
  }
  
  if (currentTime > time +3000){
    fill(255,0,0);
    rect(539, 433, 12, 15);
    fill(255,255,255);
    rect(569, 429, 12, 15);
    fill(0,0,0);
    text("2", 517, 446);
  }
  if (currentTime > time + 3999){
    fill(255,255,255);
    rect(515, 433, 12, 15);
  }
  if (currentTime > time + 4001){
    fill(0,0,0);
    text("1", 517, 446);
  }
  
  if (currentTime > time +5000){
    fill(255,0,0);
    rect(515, 433, 12, 15);
    fill(255,255,255);
    rect(539, 433, 12, 15);
    fill(0,0,0);
    text("4", 484, 442);
  }
  if (currentTime > time + 5999){
    fill(255,255,255);
    rect(481, 429, 15, 15);
  }
  if (currentTime > time + 6001){
    fill(0,0,0);
    text("3", 484, 442);
  }
  if (currentTime > time + 6999){
    fill(255,255,255);
    rect(481, 429, 15, 15);
  }
  if (currentTime > time + 7001){
    fill(0,0,0);
    text("2", 484, 442);
  }
  if (currentTime > time + 7999){
    fill(255,255,255);
    rect(481, 429, 15, 15);
  }
  if (currentTime > time + 8001){
    fill(0,0,0);
    text("1", 484, 442);
  }
  
  if (currentTime > time +9000){
    fill(255,0,0);
    rect(481, 429, 15, 15);
    fill(255,255,255);
    rect(514, 433, 12, 15);
    fill(0,0,0);
    text("6", 450, 442);
  }
  if (currentTime > time + 9999){
    fill(255,255,255);
    rect(447, 429, 15, 15);
  }
  if (currentTime > time + 10001){
    fill(0,0,0);
    text("5", 450, 442);
  }
  if (currentTime > time + 10999){
    fill(255,255,255);
    rect(447, 429, 15, 15);
  }
  if (currentTime > time + 11001){
    fill(0,0,0);
    text("4", 450, 442);
  }
  if (currentTime > time + 11999){
    fill(255,255,255);
    rect(447, 429, 15, 15);
  }
  if (currentTime > time + 12001){
    fill(0,0,0);
    text("3", 450, 442);
  }
  if (currentTime > time + 12999){
    fill(255,255,255);
    rect(447, 429, 15, 15);
  }
  if (currentTime > time + 13001){
    fill(0,0,0);
    text("2", 450, 442);
  }
  if (currentTime > time + 13999){
    fill(255,255,255);
    rect(447, 429, 15, 15);
  }
  if (currentTime > time + 14001){
    fill(0,0,0);
    text("1", 450, 442);
  }
  
  if (currentTime > time +15000){
    fill(255,0,0);
    rect(447, 429, 15, 15);
    fill(255,255,255);
    rect(481, 429, 15, 15);
    fill(0,0,0);
    text("4", 417, 446);
  }
  if (currentTime > time + 15999){
    fill(255,255,255);
    rect(416, 433, 11, 15);
  }
  if (currentTime > time + 16001){
    fill(0,0,0);
    text("3", 417, 446);
  }
  if (currentTime > time + 16999){
    fill(255,255,255);
    rect(416, 433, 11, 15);
  }
  if (currentTime > time + 17001){
    fill(0,0,0);
    text("2", 417, 446);
  }
  if (currentTime > time + 17999){
    fill(255,255,255);
    rect(416, 433, 11, 15);
  }
  if (currentTime > time + 18001){
    fill(0,0,0);
    text("1", 417, 446);
  }
  
  if (currentTime > time +19000){
    fill(255,0,0);
    rect(416, 432, 12, 15);
    fill(255,255,255);
    rect(447, 429, 15, 15);
    fill(0,0,0);
    text("2", 394, 445);
  }
  if (currentTime > time + 19999){
    fill(255,255,255);
    rect(391, 433, 12, 15);
  }
  if (currentTime > time + 20001){
    fill(0,0,0);
    text("1", 394, 445);
  }
  
  if (currentTime > time +21000){
    fill(255,0,0);
    rect(392, 432, 12, 15);
    fill(255,255,255);
    rect(416, 432, 12, 15);
    fill(0,0,0);
    text("1", 362, 442);
  }
  if (currentTime > time +22000){
    fill(255,0,0);
    rect(357, 429, 15, 15);
    fill(255,255,255);
    rect(392, 432, 12, 15);
    fill(0,0,0);
    text("1", 325, 442);
  }
  if (currentTime > time +23000){
    fill(255,0,0);
    rect(321, 429, 15, 15);
    fill(255,255,255);
    rect(357, 429, 15, 15);
    fill(0,0,0);
    text("1", 290, 442);
  }
  if (currentTime > time +24000){
    fill(255,0,0);
    rect(286, 429, 15, 15);
    fill(255,255,255);
    rect(321, 429, 15, 15);
    fill(0,0,0);
    text("1", 257, 445);
  }
  if (currentTime > time +25000){
    fill(255,0,0);
    rect(256, 432, 12, 15);
    fill(255,255,255);
    rect(286, 429, 15, 15);
    fill(0,0,0);
    text("1", 234, 445);
  }
  if (currentTime > time +26000){
    fill(255,0,0);
    rect(232, 432, 12, 15);
    fill(255,255,255);
    rect(256, 432, 12, 15);
    fill(0,0,0);
    text("3", 201, 442);
  }
  if (currentTime > time + 26999){
    fill(255,255,255);
    rect(199, 429, 15, 15);
  }
  if (currentTime > time + 27001){
    fill(0,0,0);
    text("2", 201, 442);
  }
  if (currentTime > time + 27999){
    fill(255,255,255);
    rect(199, 429, 15, 15);
  }
  if (currentTime > time + 28001){
    fill(0,0,0);
    text("1", 201, 442);
  }
  
  if (currentTime > time +29000){
    fill(255,0,0);
    rect(197, 429, 15, 15);
    fill(255,255,255);
    rect(232, 432, 12, 15);
  }
  if (currentTime > time +29950){
    fill(255,255,255);
    rect(197, 429, 15, 15);
  }
  
  /*Time*/
  
  if (currentTime > time + 0){
    fill(0,0,0);
    text("12:00", 830, 75);
  }
  if (currentTime > time + 999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 1001){
    fill(0,0,0);
    text("12:01", 830, 75);
  }
  if (currentTime > time + 1999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 2001){
    fill(0,0,0);
    text("12:02", 830, 75);
  }
  if (currentTime > time + 2999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 3001){
    fill(0,0,0);
    text("12:03", 830, 75);
  }
  if (currentTime > time + 3999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 4001){
    fill(0,0,0);
    text("12:04", 830, 75);
  }
  if (currentTime > time + 4999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 5001){
    fill(0,0,0);
    text("12:05", 830, 75);
  }
  if (currentTime > time + 5999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 6001){
    fill(0,0,0);
    text("12:06", 830, 75);
  }
  if (currentTime > time + 6999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 7001){
    fill(0,0,0);
    text("12:07", 830, 75);
  }
  if (currentTime > time + 7999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 8001){
    fill(0,0,0);
    text("12:08", 830, 75);
  }
  if (currentTime > time + 8999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 9001){
    fill(0,0,0);
    text("12:09",830, 75);
  }
  if (currentTime > time + 9999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 10001){
    fill(0,0,0);
    text("12:10", 830, 75);
  }
  if (currentTime > time + 10999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 11001){
    fill(0,0,0);
    text("12:11", 830, 75);
  }
  if (currentTime > time + 11999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 12001){
    fill(0,0,0);
    text("12:12", 830, 75);
  }
  if (currentTime > time + 12999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 13001){
    fill(0,0,0);
    text("12:13", 830, 75);
  }
  if (currentTime > time + 13999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 14001){
    fill(0,0,0);
    text("12:14", 830, 75);
  }
  if (currentTime > time + 14999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 15001){
    fill(0,0,0);
    text("12:15", 830, 75);
  }
  if (currentTime > time + 15999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 16001){
    fill(0,0,0);
    text("12:16", 830, 75);
  }
  if (currentTime > time + 16999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 17001){
    fill(0,0,0);
    text("12:17", 830, 75);
  }
  if (currentTime > time + 17999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 18001){
    fill(0,0,0);
    text("12:18", 830, 75);
  }
  if (currentTime > time + 18999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 19001){
    fill(0,0,0);
    text("12:19", 830, 75);
  }
  if (currentTime > time + 19999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 20001){
    fill(0,0,0);
    text("12:20", 830, 75);
  }
  if (currentTime > time + 20999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 21001){
    fill(0,0,0);
    text("12:21", 830, 75);
  }
  if (currentTime > time + 21999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 22001){
    fill(0,0,0);
    text("12:22", 830, 75);
  }
  if (currentTime > time + 22999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 23001){
    fill(0,0,0);
    text("12:23", 830, 75);
  }
  if (currentTime > time + 23999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 24001){
    fill(0,0,0);
    text("12:24", 830, 75);
  }
  if (currentTime > time + 24999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 25001){
    fill(0,0,0);
    text("12:25", 830, 75);
  }
  if (currentTime > time + 25999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 26001){
    fill(0,0,0);
    text("12:26", 830, 75);
  }
  if (currentTime > time + 26999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 27001){
    fill(0,0,0);
    text("12:27", 830, 75);
  }
  if (currentTime > time + 27999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 28001){
    fill(0,0,0);
    text("12:28", 830, 75);
  }
  if (currentTime > time + 28999){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  if (currentTime > time + 29001){
    fill(0,0,0);
    text("12:29", 830, 75);
  }
  if (currentTime > time + 29950){
    fill(255,255,255);
    rect(830, 60, 100, 15);
  }
  /*if (currentTime == 0){
    xpos = 100;
    ypos = 100;
  }

  if (currentTime == 0){
    xpos = 100;
    ypos = 100;
  }
  if (currentTime == 2000){
    xpos = xpos+10;
    ypos = ypos+10;
  }
  image(rd,xpos,ypos);*/
}

void nextFrame() 
{
  frames[currentFrame] = get();
  currentFrame++;
  if (currentFrame + 3000 >= frames.length) {
    currentFrame = 0;
  }
  image(frames[currentFrame], 0, 0);
}

