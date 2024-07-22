/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositionexample;

/**
 *
 * @author LENOVO
 */
public class MyPoint {
    private double x, y;
    
    
    public MyPoint(){
        x=y=0.0;
    }
    public MyPoint(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(MyPoint point){
        return Math.sqrt(Math.pow((x-point.getX()),2)
                +Math.pow((y-point.getY()),2));
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow((this.x-x),2)
                +Math.pow((this.y-y),2));
    }
}
    

