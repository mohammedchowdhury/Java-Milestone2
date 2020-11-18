/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseShapesAndPerimeters;

/**
 *
 * @author mohammedchowdhury
 */
public class Rectangle extends Shape{
    private double area, perimeter; 
    
    public Rectangle(String color, double l, double w){
        super(color);
        area = l*w;
        perimeter = (l+w)*2;       
    }
      
    
    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }
    
    
}
