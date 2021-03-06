package aiminesweeper;

import java.util.ArrayList;

public class Square {
  
	// FIELD VARIABLES
    private String stringRep; // x = bomb, # = numbered , - = empty
    private int x, y; // coordinates
    private int adjBombs;
    private ArrayList<Square> neighbours;
    private boolean clicked;
  
    // CONSTRUCTORS
    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        this.adjBombs = 0;
        this.clicked = false;
        this.stringRep = " ";
    }
  
    public Square(String rep, int x, int y) {
        this(x,y);
        this.stringRep = rep;
    }
  
    // ACCESSORS
    public String getStringRep() { return this.stringRep; }
    public int getX() { return this.x; }
    public int get()  { return this.y; }
    public boolean isClicked() { return this.clicked; }

    // MUTATORS
    public void setStringRep(String rep) { this.stringRep = rep; }
    public void setX(int x)  { this.x = x; }
    public void setY(int y)  { this.y = y; }
    public void toggle()     { this.clicked = !this.clicked; }
    
    // UTILITIES
    public void addAdjBomb() { 
    	this.adjBombs++; 
    	this.stringRep = Integer.toString(adjBombs);
    }
}

