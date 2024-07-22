/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compositionexample;

/**
 *
 * @author LENOVO
 */
public class Triangle2Ddriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2),
                        new MyPoint(4.2, 6), new MyPoint(7,1));
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.contains(new MyPoint(5,3)));
        Triangle2D t2 = new Triangle2D(new MyPoint(4, 3),
                        new MyPoint(5, 3), new MyPoint(2.5,2));
        
        System.out.println(t1.contains(t2));
        
    }
    
}
    
    

