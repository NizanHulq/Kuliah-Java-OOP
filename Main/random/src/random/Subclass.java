package random;

public class Subclass extends Superclass{

    public Subclass(int de) {
        super(de);
    }

    int getDef(){return de;}
    public int getPub(){return pu;}
    protected int getProt(){return pro;}
    private int getPriv(){return pri;}

}
