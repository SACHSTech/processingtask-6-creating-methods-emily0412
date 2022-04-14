import processing.core.PApplet;
/**
   * A program that uses a method with parameters to draw a composite object at various locations specified by the method parameters.
   * Author: E. Ma
   */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /** 
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    drawColour(200, 200, 128);
    drawHouse(60, 200);
	  
	  
  }
/**
* Given two integers, draws a house at those coordinates.
*
* @param houseX  This parameter controls the x coordinates of the chimney, house, roof, window, door, and doorknob
* @param houseY  This parameter controls the y coordinates of the chimney, house, roof, window, door, and doorknob
* @return nothing
*
*/
  public void drawHouse (float houseX, float houseY){
    // chimney
    stroke(170, 64, 105);
    strokeWeight(3);
    fill(168, 81, 110);
    rect(houseX + 10, houseY, 20, 60);
    
    // house
    stroke(241, 156, 187);
    strokeWeight(3);
    fill(250, 218, 221);
    rect(houseX, houseY, 160, 170);

    // roof
    stroke(181, 114, 129);
    strokeWeight(3);
    fill(217, 134, 149);
    triangle(houseX - 20, houseY, houseX + 80, houseY - 70, houseX + 180, houseY);

    // window
    stroke(192, 128, 129);
    strokeWeight(3);
    fill(204, 259, 255);
    ellipse(houseX + 80, houseY + 40, 30, 30);

    // door
    stroke(192, 128, 129);
    strokeWeight(3);
    fill(239, 187, 204);
    rect(houseX + 80, houseY + 100, 40, 70);

    // doorknob
    fill(165, 42, 42);
    noStroke();
    ellipse(houseX + 110, houseY + 140, 7, 7);

  }
  /**
* Given three integers, colours the circle the rgb value of the three integers in that order 
*
* @param intR This paramater controls the r value of the rgb code
* @param intG This paramater controls the g value of the rgb code
* @param intB This paramater controls the b value of the rgb code
* @return nothing
*
*/
public void drawColour (int intR, int intG, int intB){
  fill(intR, intG, intB);
  ellipse(300, 70, 60, 60);
  
}

}