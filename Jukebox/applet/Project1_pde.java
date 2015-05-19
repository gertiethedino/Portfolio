import processing.core.*; 
import processing.xml.*; 

import org.htmlparser.sax.*; 
import org.htmlparser.scanners.*; 
import org.htmlparser.visitors.*; 
import org.htmlparser.util.*; 
import org.htmlparser.*; 
import org.htmlparser.filters.*; 
import org.htmlparser.beans.*; 
import org.htmlparser.http.*; 
import org.htmlparser.tags.*; 
import org.json.*; 
import ddf.minim.*; 

import java.applet.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class Project1_pde extends PApplet {

/*
* Hyun Kim
* JukeBox Emulation
*/














Minim minim;
AudioPlayer player;
AudioPlayer player1;

int currentFrame = 0;
PImage[] frames = new PImage[24];
PFont font;
PImage img;
String name;
String floatingText;
JSONObject myfeed;
JSONArray items;
int time = 0;
int x = 0;
int wid = 10;
int mhei = 40;
int hei = 20;
int rectX, rectY;
int circleX, circleY;
//int triX1, triX2, triX3;
//int triY1, triY2, triY3;
int rectSize = 50;
int circleSize = 50;
int rectColor, circleColor, baseColor;
int rectHighlight, circleHighlight;
//color triColor, triHighlight;
int currentColor;
boolean rectOver = false;
boolean circleOver = false;
java.util.List albumNames = Collections.synchronizedList(new ArrayList()); // contents: String
java.util.List albumImages = Collections.synchronizedList(new ArrayList()); // contents: PImage
java.util.List flickrImages = Collections.synchronizedList(new ArrayList()); // contents: PImage

public void setup() 
{
  try{
    myfeed = new JSONObject(join(loadStrings("blur2.txt"), ""));  
    items = myfeed.getJSONArray("items");
  }
  catch(JSONException e){
    println(e.toString());
  }
  background(255);
  size(400, 395);
  smooth();
  strokeWeight(0);

  img = loadImage("http://2.bp.blogspot.com/_jibZa07SmaA/SKdBwcifPVI/AAAAAAAAB60/okCjE0K18Bc/s400/Blur-Blur-Frontal.jpg");
  image(img, 0, 0);
  
  font = loadFont("CurlzMT-20.vlw"); 
  textFont(font, 24); 
  text(" Play", 125, 370);
  text(" Link", 225, 370);
  
  fill(1);
    rect(100,20,200,100);
  fill(128,64,0);
    rect(90,20,10,100);
  fill(128,64,0);
    rect(100,10,200,10);
  fill(128,64,0);
    rect(300,20,10,100);
  fill(128,64,0);
    rect(100,120,200,10);
  fill(255);
    rect(65,160,275,100);
  fill(192,192,192);
    rect(65,160,275,20);
  fill(192,192,192);
    rect(65,240,275,20);
  /*fill(0);
    triangle(0, 350, 0, 400, 50, 400);
  fill(0);
    triangle(400, 350, 400, 400, 350, 400);
  fill(0);
    triangle(0, 0, 50, 0, 0, 50);
  fill(0);
    triangle(400, 0, 350, 0, 400, 50);*/
  
  rectColor = color(250, 194, 31);
  rectHighlight = color(255, 174, 23);
  circleColor = color(188, 236, 241);
  circleHighlight = color(63, 216, 197);
  //triColor = color(75, 193, 203);
  //triHighlight = color(85, 155, 193);
  baseColor = color(102);
  currentColor = baseColor;
  circleX = 250;
  circleY = 325;
  rectX = 125;
  rectY = 300;
  ellipseMode(CENTER);
  
  minim = new Minim(this);
  player = minim.loadFile("http://martyn.sillyproject.com/MP3's/Blur%20-%20Song2.mp3");
  for (int i = 0; i < frames.length; i++) {
    frames[i] = get(); // Create a blank frame
  }
}

public void draw() 
{
  stroke(0);
  update(mouseX, mouseY);
  //fill(255);
  //rect(65,160,275,100);
  int currentTime = millis();
  if(rectOver) {
    fill(rectHighlight);
  } else {
    fill(rectColor);
  }
  rect(rectX, rectY, rectSize, rectSize);
  
  if(circleOver) {
    fill(circleHighlight);
  } else {
    fill(circleColor);
  }
  stroke(0);
  ellipse(circleX, circleY, circleSize, circleSize);
  
  if (currentTime > time +500) {
    nextFrame();
    time = currentTime;
  }
  /*if (currentTime > time + 0){
    fill(255);
    rect(65,180,275,60);
  }*/
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(100, 100, 10, 20);
  }
  if (currentTime > time +100){
    rect(100, 70, 10, 50);
  }
  if (currentTime > time +200){
    rect(100, 60, 10, 60);
  }
  if (currentTime > time +300){
    fill(0,0,0);
    rect(100, 20, 10, 50);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(100, 50, 10, 70);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(110, 70, 10, 50);
  }
  if (currentTime > time +100){
    rect(110, 30, 10, 90);
  }
  if (currentTime > time +200){
    fill(0);
    rect(110, 20, 10, 75);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(110, 50, 10, 70);
  }
  if (currentTime > time +400){
    fill(0);
    rect(110, 20, 10, 60);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(120, 70, 10, 50);
  }
  if (currentTime > time +100){
    rect(120, 40, 10, 80);
  }
  if (currentTime > time +300){
    fill(0,0,0);
    rect(120, 20, 10, 75);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(120, 60, 10, 60);
  }
  if (currentTime > time +400){
    fill(0);
    rect(120, 20, 10, 50);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(130, 70, 10, 50);
  }
  if (currentTime > time +100){
    fill(0);
    rect(130, 20, 10, 80);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(130, 95, 10, 25);
  }
  if (currentTime > time +400){
    fill(0);
    rect(130, 20, 10, 50);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(130, 45, 10, 75);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(140, 95, 10, 25);
  }
  if (currentTime > time +100){
    fill(34,221,62);
    rect(140, 80, 10, 40);
  }
  if (currentTime > time +200){
    fill(0);
    rect(140, 20, 10, 70);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(140, 70, 10, 50);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(140, 40, 10, 80);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(150, 100, 10, 20);
  }
  if (currentTime > time +100){
    rect(150, 70, 10, 50);
  }
  if (currentTime > time +200){
    fill(0,0,0);
    rect(150, 20, 10, 70);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(150, 80, 10, 40);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(150, 60, 10, 60);
  }
  
   if (currentTime > time + 0){
    fill(34,221,62);
    rect(160, 95, 10, 25);
  }
  if (currentTime > time +100){
    fill(34,221,62);
    rect(160, 70, 10, 50);
  }
  if (currentTime > time +300){
    fill(0);
    rect(160, 20, 10, 75);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(160, 55, 10, 65);
  }
  
   if (currentTime > time + 0){
    fill(34,221,62);
    rect(170, 45, 10, 75);
  }
  if (currentTime > time +100){
    fill(0);
    rect(170, 20, 10, 75);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(170, 80, 10, 40);
  }
  if (currentTime > time +300){
    fill(0);
    rect(170, 20, 10, 70);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(170, 50, 10, 70);
  }
  
   if (currentTime > time + 0){
    fill(34,221,62);
    rect(180, 90, 10, 30);
  }
  if (currentTime > time +100){
    fill(34,221,62);
    rect(180, 70, 10, 50);
  }
  if (currentTime > time +200){
    fill(0);
    rect(180, 20, 10, 75);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(180, 80, 10, 40);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(180, 70, 10, 50);
  }
  
   if (currentTime > time + 0){
    fill(34,221,62);
    rect(190, 70, 10, 50);
  }
  if (currentTime > time +100){
    fill(34,221,62);
    rect(190, 45, 10, 75);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(190, 40, 10, 80);
  }
  if (currentTime > time +300){
    fill(0);
    rect(190, 20, 10, 70);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(190, 80, 10, 40);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(200, 90, 10, 30);
  }
  if (currentTime > time +100){
    fill(34,221,62);
    rect(200, 80, 10, 40);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(200, 60, 10, 60);
  }
  if (currentTime > time +300){
    fill(0);
    rect(200, 20, 10, 50);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(200, 45, 10, 75);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(210, 70, 10, 50);
  }
  if (currentTime > time +100){
    fill(0);
    rect(210, 20, 10, 80);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(210, 60, 10, 40);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(210, 25, 10, 75);
  }
  if (currentTime > time +400){
    fill(0);
    rect(210, 20, 10, 50);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(220, 40, 10, 80);
  }
  if (currentTime > time +100){
    fill(0,0,0);
    rect(220, 20, 10, 50);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(220, 90, 10, 30);
  }
  if (currentTime > time +300){
    fill(0);
    rect(220, 20, 10, 90);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(220, 90, 10, 30);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(230, 95, 10, 25);
  }
  if (currentTime > time +100){
    fill(34,221,62);
    rect(230, 80, 10, 40);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(230, 70, 10, 50);
  }
  if (currentTime > time +300){
    fill(0);
    rect(230, 20, 10, 75);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(230, 60, 10, 60);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(240, 100, 10, 20);
  }
  if (currentTime > time +100){
    rect(240, 60, 10, 60);
  }
  if (currentTime > time +200){
    fill(0,0,0);
    rect(240, 20, 10, 50);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(240, 45, 10, 75);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(240, 40, 10, 80);
  }
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(250, 70, 10, 50);
  }
  if (currentTime > time +200){
    fill(0,0,0);
    rect(250, 20, 10, 75);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(250, 70, 10, 50);
  }
  if (currentTime > time +400){
    fill(0,0,0);
    rect(250, 20, 10, 70);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(260, 95, 10, 25);
  }
  if (currentTime > time +200){
    fill(0);
    rect(260, 20, 10, 60);
  }
  if (currentTime > time +100){
    fill(34,221,62);
    rect(260, 60, 10, 60);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(260, 70, 10, 50);
  }
  if (currentTime > time +400){
    fill(0);
    rect(260, 20, 10, 80);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(270, 70, 10, 50);
  }
  if (currentTime > time +100){
    fill(0);
    rect(270, 20, 10, 60);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(270, 40, 10, 80);
  }
  if (currentTime > time +300){
    fill(0);
    rect(270, 20, 10, 50);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(270, 45, 10, 75);
  }
  
  if (currentTime > time + 0){
    fill(34,221,62);
    rect(280, 40, 10, 80);
  }
  if (currentTime > time +100){
    fill(0);
    rect(280, 20, 10, 50);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(280, 40, 10, 80);
  }
  if (currentTime > time +300){
    fill(34,221,62);
    rect(280, 30, 10, 90);
  }
  if (currentTime > time +400){
    fill(0);
    rect(280, 20, 10, 70);
  }

  if (currentTime > time + 0){
    fill(34,221,62);
    rect(290, 80, 10, 40);
  }
  if (currentTime > time +100){
    fill(0);
    rect(290, 20, 10, 50);
  }
  if (currentTime > time +200){
    fill(34,221,62);
    rect(290, 60, 10, 60);
  }
  if (currentTime > time +300){
    fill(0);
    rect(290, 20, 10, 80);
  }
  if (currentTime > time +400){
    fill(34,221,62);
    rect(290, 95, 10, 25);
  }
}
public void nextFrame() 
{
  frames[currentFrame] = get();
  currentFrame++;
  if (currentFrame + 5000 >= frames.length) {
    currentFrame = 0;
  }
  image(frames[currentFrame], 0, 0);
}

public void update(int x, int y)
{
  if( overCircle(circleX, circleY, circleSize) ) {
    circleOver = true;
    rectOver = false;
  } else if ( overRect(rectX, rectY, rectSize, rectSize) ) {
    rectOver = true;
    circleOver = false;
  } else {
    circleOver = rectOver = false;
  }
}

public void mousePressed()
{
  if(circleOver) {
    currentColor = circleColor;
    link("http://www.youtube.com/watch?v=JATWwU3Aa-4");
  }
  if(rectOver) {
    currentColor = rectColor;
    player.play();
  }
}

public boolean overRect(int x, int y, int width, int height) 
{
  if (mouseX >= x && mouseX <= x+width && 
      mouseY >= y && mouseY <= y+height) {
    return true;
  } else {
    return false;
  }
}

public boolean overCircle(int x, int y, int diameter) 
{
  float disX = x - mouseX;
  float disY = y - mouseY;
  if(sqrt(sq(disX) + sq(disY)) < diameter/2 ) {
    return true;
  } else {
    return false;
  }
}

public void stop()
{
  player.close();
  minim.stop();
  super.stop();
}

public void keyPressed(){ 
  if (key == ENTER) {
    fill(255);
    rect(65,180,275,60);
    try {
      JSONObject item = items.getJSONObject(x);
      String lyric = item.getString("lyric");
      fill(0);
      text(lyric, 65, 215);
    }
    catch (JSONException e) {  
      println (e.toString());
    }
  }
  x = x + 1;
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Project1_pde" });
  }
}
