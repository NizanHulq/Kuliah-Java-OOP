package Monster;
//Overriding = penulisan ulang sebuah method pada subclass.
  //      Polymorphism = penggunaan suatu simbol/interface untuk merepresentasikan beberapa tipe berbeda yang dianggap masih satu kesamaan.
public class Main {

    public static void main(String[] args) {
	// write your code here

        FireMonster FM = new FireMonster("Balrog");
        System.out.println(FM.attack());
        StoneMonster SM = new StoneMonster("Pika");
        System.out.print(SM.getName()+ " is ");
        System.out.println(SM.attack());
    }
}
