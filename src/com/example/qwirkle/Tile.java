package com.example.qwirkle;

import java.io.Serializable;

public class Tile {
    // For serialization.
    private static final long serialVersionUID = 3781304818481394857L;

    // Instance variables
    private int xPos; // x position of tile
    private int yPos; // y position of tile
    private Shape shape; // Animal of tile
    private Color color; // Color of tile

    // Booleans to tell if tiles are on main board and if selected.
    private boolean mainBoard;
    private boolean isSelected;

    /**
     * Constructor: Tile
     * Deep copy constructor for Tile
     *
     * @param orig The original Tile object instance.
     */
    public Tile(Tile orig) {
        // Set position and tile shape/color of bitmaps
        this.xPos = orig.getXPos();
        this.yPos = orig.getYPos();
        this.shape = orig.getShape();
        this.color = orig.getColor();

        // Set the mainBoard and isSelected booleans
        this.mainBoard = orig.mainBoard;
        this.isSelected = orig.isSelected;
    }

    /**
     * Constructor: Tile
     * Use to create a new tile from scratch.
     *
     * @param shape Shape for bitmap
     * @param color Color for bitmap
     */
    public Tile(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }


    public String toString() {
        // Use underscore to separate shape from color.
        return color.toString()+"_"+shape.toString();
    }

    /**
     * Method: getXPos
     * @return The x position of the tile.
     */
    public int getXPos() {
        return xPos;
    }

    /**
     * Method: getYPos
     * @return The y position of the tile.
     */
    public int getYPos() {
        return yPos;
    }

    /**
     * Method: getShape
     * @return the Shape of bitmap
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * Method: getColor
     * @return the Color of bitmap
     */
    public Color getColor() {
        return color;
    }

    /**
     * Method: isSelected
     * @return if the tile is selected (true), otherwise false.
     */
    public boolean isSelected() {
        return isSelected;
    }

    /**
     * Method: isMainBoard
     * @return if the tile is on the main board (true), otherwise false.
     */
    public boolean isMainBoard() {
        return mainBoard;
    }

    /**
     * Method: setXPos
     * Set x position of bitmap
     * @param xPos x coordinate to set
     */
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * Method: setYPos
     * Set y position of bitmap
     * @param yPos y coordinate to set
     */
    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * Method: setMainBoard
     * @param mainBoard True if tile on the main board, otherwise false.
     */
    public void setMainBoard(boolean mainBoard) {
        this.mainBoard = mainBoard;
    }

    /**
     * Method: setSelected
     * Set the selected bitmaps
     * @param selected True if tile is selected, otherwise false.
     */
    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public enum Shape implements Serializable {
        c, rc, d, sq, st, nc;
        
        private static final long serialVersionUID = 4058041248L;
    }
    public enum Color implements Serializable {
        b, g, o, p, r, y;

        private static final long serialVersionUID = 3789005432457L;
    }
}
