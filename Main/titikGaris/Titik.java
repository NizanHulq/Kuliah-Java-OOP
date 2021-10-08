public class Titik {
   private int x;
	private int y;
	
		public Titik(){
			x=0;
			y=0;
		}
		public Titik(int x, int y){
				this.x=x; 
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
		
		
		public String toString(){
			return "( "+x+" , "+y+" )";
			}
		
}

