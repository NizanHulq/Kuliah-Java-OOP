public class Titik {
   private int x;
	private int y;
	
		public Titik(){
			x=0;
			y=0;
		}
		public Titik(int x, int y){
				this.x=x; // this.x variabel berarti dari class, kalo = x nya itu di parameter inputan
				this.y=y;
		}

		public int getX(){
			return x;
		}
		public void setX(int x){
			this.x=x;
		}
		
		public int getY(){
			return y;
		}
		public void setY(int y){
			this.y=y;
		}
			
		
 		public void naik(){
			y++;
		}
		public void turun(){
			y--;
		}


		public void kanan(){
			x++;
		}
		public void kiri(){
			x--;
		}
		
		
		public void serong(int geser_x,int geser_y){
		x+=geser_x;
		y+=geser_y;
		}
		
		public String toString(){
			return "( "+x+" , "+y+" )";
			}
		
}

