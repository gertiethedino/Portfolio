/*
* Tetris Drawing
* Project 3
*/

//import org.json.*;
import ddf.minim.*;

int width=20; 
int height=20;
int rWidth=15;
int rHeight=15;
int tetX, tetY, kind, rotate, size;
int grid[][];
int queue[];

Minim minim;
AudioPlayer player;

PImage a,b,c,d,e,f,g;

void setup() {
  size (400,400, P3D);
  background(255);
  minim = new Minim(this);
  player = minim.loadFile("TetrisA.mp3");
  player.play();

  grid = new int[width][height];
  
  for (int x=0; x<width; x++) {
    for (int y=0; y<height; y++) {
      grid[x][y]=0;
    }
  }  
}

void draw() {
  drawGrid();
  a = loadImage("block0.jpg");
  image(a,300,0);
  b = loadImage("block1.jpg");
  image(b,300,100);
  c = loadImage("block2.jpg");
  image(c,300,200);
  d = loadImage("block3.jpg");
  image(d,0,300);
  e = loadImage("block4.jpg");
  image(e,100,300);
  f = loadImage("block5.jpg");
  image(f,200,300);
  g = loadImage("block6.jpg");
  image(g,300,300);
}

boolean tetMove(int posX, int posY) {
  return tetMove(posX, posY, tetX, tetY, rotate);
}

boolean tetMove(int posX, int posY, int tetX, int tetY, int tetR) {
  boolean moveOK=true;
  int gridC=0;
  for(int y=0; y<size; y++) {
    for(int x=0; x<size; x++) {
      if ((tetY+y+posY<0 || tetY+y+posY>=height) || (tetX+x+posX<0 || tetX+x+posX>=width)) {
        gridC=1;
      } 
      else {
        gridC=grid[tetX+x+posX][tetY+y+posY];
      }
    }
  }
  return moveOK;
}

boolean tetRotation(int r) {
  boolean rot=false;
  int x=tetX;
  int y=tetY;
  int tetR=rotate+r;
  if (tetR==4) tetR=0;
  if (tetR==-1) tetR=3;
    rot=tetMove(0,0,x,y,tetR);
    if (!rot && tetMove(-1,0,x,y,tetR)) {
        x--;
        rot = tetMove(0,0,x,y,tetR);
    }  
    if (!rot && tetMove(-2,0,x,y,tetR)) {
        x=x-2; 
        rot = tetMove(0,0,x,y,tetR);
    }
    if (!rot && tetMove(1,0,x,y,tetR)) {
        x++;
        rot = tetMove(0,0,x,y,tetR);
    }
    if (!rot && tetMove(2,0,x,y,tetR)) {
        x=x+2;
        rot = tetMove(0,0,x,y,tetR);
    }
  if (rot) tetX=x;
  return rot;
}

void drawBlock() {
  for(int y=0; y<size; y++) {
    for(int x=0; x<size; x++) {
      if (block[kind][rotate][y][x]!=0) {
        grid[tetX+x][tetY+y]=block[kind][rotate][y][x];
      }
    }
  }
}

void newBlock() { 
  int block=queue[0];
  newBlock(block); 
}

void newBlock(int block) {
  kind=block;
  if (kind==0 || kind==3) {
    size=4; 
  }
  else {
    size=3;
  }
  rotate=0;
  tetY=0;
  tetX=0;
}

void keyPressed() {
    if (keyCode==LEFT && tetMove(-1,0)) tetX--;
    if (keyCode==RIGHT && tetMove(1,0)) tetX++;
    if (keyCode==UP && tetMove(0,1)) tetY--;
    if (keyCode==DOWN && tetMove(0,1)) tetY++; 
    if (keyCode==ENTER) drawBlock();

    if (key=='1') newBlock(0);
    if (key=='2') newBlock(1);
    if (key=='3') newBlock(2);
    if (key=='4') newBlock(3);
    if (key=='5') newBlock(4);
    if (key=='6') newBlock(5);
    if (key=='7') newBlock(6);
    if (key=='8') newBlock(7);
    
    if (key=='r'|| key=='R' && tetRotation(1)) rotate++;
    if (key=='n'|| key=='N') {
      for(int x=0; x<width; x++) {
        for(int y=0; y<height; y++) {
          grid[x][y]=0;
        }
      }
    }
    if (rotate==-1) rotate=3; 
    if (rotate==4) rotate=0;
}

void drawGrid() {
  stroke(55);
  for(int x=0; x<width; x++) {
    for(int y=0; y<height; y++) {
        blockColor(grid[x][y]);
        rect(x*rWidth, (y)*rHeight, rWidth, rHeight);
    }
  }
 
  for(int y=0; y<size; y++) {
    for(int x=0; x<size; x++) {
      if (block[kind][rotate][y][x]!=0 && y+tetY>=0) {
        blockColor(block[kind][rotate][y][x]);
        rect((x+tetX)*rWidth, ((y+tetY)*rHeight), rWidth, rHeight);
      }
    }
  }
}

void stop()
{
  player.close();
  minim.stop();
  super.stop();
}

int block[][][][] = {
  {{{1,1,1,1},
    {0,0,0,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,0,1,0},
    {0,0,1,0},
    {0,0,1,0},
    {0,0,1,0}},
   {{0,0,0,0},
    {0,0,0,0},
    {0,0,0,0},
    {1,1,1,1}},
   {{0,1,0,0},
    {0,1,0,0},
    {0,1,0,0},
    {0,1,0,0}}},
  {{{2,0,0,0},
    {2,2,2,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,2,2,0},
    {0,2,0,0},
    {0,2,0,0},
    {0,0,0,0}},
   {{0,0,0,0},
    {2,2,2,0},
    {0,0,2,0},
    {0,0,0,0}},
   {{0,2,0,0},
    {0,2,0,0},
    {2,2,0,0},
    {0,0,0,0}}},
  {{{0,0,3,0},
    {3,3,3,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,3,0,0},
    {0,3,0,0},
    {0,3,3,0},
    {0,0,0,0}},
   {{0,0,0,0},
    {3,3,3,0},
    {3,0,0,0},
    {0,0,0,0}},
   {{3,3,0,0},
    {0,3,0,0},
    {0,3,0,0},
    {0,0,0,0}}},
  {{{4,4,0,0},
    {4,4,0,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{4,4,0,0},
    {4,4,0,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{4,4,0,0},
    {4,4,0,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{4,4,0,0},
    {4,4,0,0},
    {0,0,0,0},
    {0,0,0,0}}},
  {{{0,5,5,0},
    {5,5,0,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,5,0,0},
    {0,5,5,0},
    {0,0,5,0},
    {0,0,0,0}},
   {{0,0,0,0},
    {0,5,5,0},
    {5,5,0,0},
    {0,0,0,0}},
   {{5,0,0,0},
    {5,5,0,0},
    {0,5,0,0},
    {0,0,0,0}}},
  {{{0,6,0,0},
    {6,6,6,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,6,0,0},
    {0,6,6,0},
    {0,6,0,0},
    {0,0,0,0}},
   {{0,0,0,0},
    {6,6,6,0},
    {0,6,0,0},
    {0,0,0,0}},
   {{0,6,0,0},
    {6,6,0,0},
    {0,6,0,0},
    {0,0,0,0}}},
  {{{7,7,0,0},
    {0,7,7,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,0,7,0},
    {0,7,7,0},
    {0,7,0,0},
    {0,0,0,0}},
   {{0,0,0,0},
    {7,7,0,0},
    {0,7,7,0},
    {0,0,0,0}},
   {{0,7,0,0},
    {7,7,0,0},
    {7,0,0,0},
    {0,0,0,0}}},
  {{{8,0,0,0},
    {0,0,0,0},
    {0,0,0,0},
    {0,0,0,0}}},
  {{{0,0,0,0},
    {0,0,0,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,0,0,0},
    {0,0,0,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,0,0,0},
    {0,0,0,0},
    {0,0,0,0},
    {0,0,0,0}},
   {{0,0,0,0},
    {0,0,0,0},
    {0,0,0,0},
    {0,0,0,0}}}
};

void blockColor(int c) {
  switch (c) {
    case 0: fill(0); break;
    case 1: fill(0,255,255); break;
    case 2: fill(0,0,255); break;
    case 3: fill(255,150,0); break;
    case 4: fill(255,255,0); break;
    case 5: fill(0,255,0); break;
    case 6: fill(150,0,255); break;
    case 7: fill(255,0,0); break;
    case 8: fill(0); break;
  }
}
