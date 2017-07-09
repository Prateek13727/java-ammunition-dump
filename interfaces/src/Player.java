import java.util.ArrayList;
import java.util.List;

/**
 * Created by tracxn-lp-175 on 8/7/17.
 */
class Player implements ISavable {

    private String name;
    private String weapon;
    private int strength;
    private int hitPoints;

    public Player(String name, String weapon, int strength, int hitPoints) {
        this.name = name;
        this.weapon = weapon;
        this.strength = strength;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,this.weapon);
        values.add(2,"" + this.strength);
        values.add(3,"" + this.hitPoints);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.weapon = savedValues.get(1);
            this.strength = Integer.parseInt(savedValues.get(2));
            this.hitPoints = Integer.parseInt(savedValues.get(3));
        }
    }
}
