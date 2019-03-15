/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_2;

/**
 *
 * @author Winter
 */
public class Square extends Rectangle{
    
    private int edge;

    public Square() {
    }

    public Square(int edge) {
        this.edge = edge;
    }
    
    @Override
   public double getArea(){
       return edge*edge;
   }
    @Override
   public double getPerimeter(){
       return 4*this.edge;
   }
    
    
    
    
}
