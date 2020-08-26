float[] ints;
void setup(){
fullScreen();
  ints = new float[width];
  for(int i=0;i<ints.length;i++){
    float r = random(height);
    ints[i] = r;
  }
  noStroke();
}
void draw(){
  background(36,82,155);
  fill(21);
   for(int i=0;i<ints.length;i++){
  rect(i,ints[i],1,-ints[i]);
   }
   stepSort(ints);
   if(mousePressed){
     randomizer();
   }
  
  
}
void randomizer(){
  for(int i=0;i<ints.length;i++){
    float r = random(height);
    ints[i] = r;
    
  }
}
void stepSort(float[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      float t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
