/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositionexample;

/**
 *
 * @author LENOVO
 */
public class Triangle2D {
    private MyPoint p1, p2, p3;
    
    public Triangle2D(){
        p1=new MyPoint(0,0);
        p2=new MyPoint(1,1);
        p3=new MyPoint(2,5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public double getArea(){
        double side1, side2, side3;
        side1 = p1.distance(p2);
        side2 = p2.distance(p3);
        side3 = p3.distance(p1);
        double s = (side1 + side2 +side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    
    public double getPerimeter(){
        return p1.distance(p2)+p2.distance(p3)+p3.distance(p1);
    }
    
    public boolean contains(MyPoint p){
        double area = this.getArea();
        double area1, area2, area3;
        //area P, P1, P2
        Triangle2D t1 = new Triangle2D(p, this.p1, this.p2);
        area1 = t1.getArea();
        //area P, P1, P3
        Triangle2D t2 = new Triangle2D(p, this.p1, this.p3);
        area2 = t2.getArea();
        //area P, P2, P3
        Triangle2D t3 = new Triangle2D(p, this.p2, this.p3);
        area3 = t3.getArea();
        if(area1+area2+area3 == area)
            return true;
        return false;
    }
    
    public boolean contains(Triangle2D t){
        if(this.contains(t.p1) && this.contains(t.p2)
                && this.contains(t.p3))
            return true;
        return false;
    }
}
    
}
