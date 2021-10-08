package Monster;

public class Monster {
    private String name;

    public Monster(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public String attack() {
        return "I don't know how to attack yet,unspesified";
    }
}
