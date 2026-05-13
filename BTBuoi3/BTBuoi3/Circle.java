package  BTBuoi3;
public class Circle{
    public double rad;


    public Circle(double rad){
        this.rad = rad;
    }

    public Circle(Circle c){//copy contructor
        this.rad = c.rad;
    }
    public double area(){
        return rad*rad*Math.PI;
    }
    public double perimeter(){
        return rad * 2 * Math.PI;
    }
}

