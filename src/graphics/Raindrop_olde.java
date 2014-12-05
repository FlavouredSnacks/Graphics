/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Point;
import javafx.scene.paint.Color;


/**
 *
 * @author Slugs
 */
public final class Raindrop_olde {

    private Point position;
    private boolean visible;

    private int red;
    private int green;
    private int blue;
    private int opacity;
    private int fadeRate = 2;

    private int radius;
    private int spreadRate = 1;

    private final int MIN_COLOR = 0;
    private final int MAX_COLOR = 255;

    public Raindrop_olde(int red, int green, int blue, int opacity, int radius, Point position) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setOpacity(opacity);
        this.radius = radius;
        this.position = position;
        this.visible = true;
    }

    public Point getPosition() {
        return position;
    }

    public Color getColor() {
        return new Color(red, green, blue, opacity);
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void draw(Graphics graphics) {
        graphics.setColor(getColor());
        //graphics.fillOval(getPosition().x, getPosition().y, 2*radius, 2*);
    }

    /**
     * @return the red
     */
    public int getRed() {
        return red;
    }

    private int validateColorComponent(int colorComponent) {
        if (colorComponent < MIN_COLOR) {
            return MIN_COLOR;
        } else if (colorComponent > MAX_COLOR) {
            return MAX_COLOR;
        } else {
            return colorComponent;
        }
    }

    /**
     * @param red the red to set
     */
    public void setRed(int red) {
        this.red = validateColorComponent(red);
    }

    /**
     * @return the green
     */
    public int getGreen() {
        return green;
    }

    /**
     * @param green the green to set
     */
    public void setGreen(int green) {
        this.green = validateColorComponent(green);
    }

    /**
     * @return the blue
     */
    public int getBlue() {
        return blue;
    }

    /**
     * @param blue the blue to set
     */
    public void setBlue(int blue) {
        this.blue = validateColorComponent(blue);
    }

    /**
     * @return the opacity
     */
    public int getOpacity() {
        return opacity;
    }

    /**
     * @param opacity the opacity to set
     */
    public void setOpacity(int opacity) {
        this.opacity = validateColorComponent(opacity);
    }

    /**
     * @return the fadeRate
     */
    public int getFadeRate() {
        return fadeRate;
    }

    /**
     * @param fadeRate the fadeRate to set
     */
    public void setFadeRate(int fadeRate) {
        this.fadeRate = fadeRate;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return the spreadRate
     */
    public int getSpreadRate() {
        return spreadRate;
    }

    /**
     * @param spreadRate the spreadRate to set
     */
    public void setSpreadRate(int spreadRate) {
        this.spreadRate = spreadRate;
    }

}
