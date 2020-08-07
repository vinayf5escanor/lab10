/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

/**
 *
 * @author VINAY
 */
public class rectangle {
    
    int length;
    int width;
    
    public int getArea(){
        return length*width;
    }
    
     public int getPeri(){
        return 2*(length+width);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
}
