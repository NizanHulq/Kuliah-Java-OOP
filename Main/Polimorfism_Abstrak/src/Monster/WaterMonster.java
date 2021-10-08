package Monster;

public class WaterMonster extends Monster {

    public WaterMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attacking with sound Byurrr";
    }
}
