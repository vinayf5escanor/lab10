/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author VINAY
 */
public class tester {
    
    public static void calculateArea(rectangle r){
        r.setLength(2);
        r.setWidth(3);
        
        assertEquals("area is incorrect",r.getArea(),4);
    }
    
    public static void main(String args[]){
        tester.calculateArea(new rectangle());
        
        tester.calculateArea(new Square1());
    }
    
}
