/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimensi;

/**
 *
 * @author hp
 */
public class Titik {
    	private int x,y;
	public Titik(){
		x=0;
		y=0;
	}
	public Titik(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getY(){
		return y;
	}
	public void naik(){
		y++;
	}
	public void turun(){
		y--;
	}
	public void kekanan(){
		x++;
	}
	public void kekiri(){
		x--;
	}
	public void serong(int incx,int incy){
		x+=incx;
		y+=incy;
	}
	public String toString(){
		return "( "+x+" , "+y+" )";
	}
}
