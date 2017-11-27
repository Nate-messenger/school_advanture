/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

/**
 *
 * @author millc9988
 */
public class Player {
    private int direction;
    private location locat;
    private location[] places;
    public Player(location[] places2){
        this.locat = places2 [9] ;
        this.direction = 0;
        places=places2;
        
    }
    public void moveFor(location loc){
        if (canMove()) {
            //locat = locat.getNext(direction);
        }
    }
    
    public void turnAround(location loc){
     turnLeft();
     turnLeft();
    }
    
    public void turnLeft(){
        if (direction==0) {
            direction = 3;
        }else{
            direction--;
        }
    }
    
    public void turnRight(){
        if (direction==3) {
            direction = 0;
        }else{
            direction++;
        }
    }
    public boolean canMove(){
        if (locat.isClear(direction)) {
            return true;
        }
        else{
            return false;
        }
    }
}