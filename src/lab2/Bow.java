package lab2;

public class Bow extends Weapon {
    private int arrowCount;
    private int range;
    private String material;

    public Bow() {
        super();
        this.arrowCount = 0;
        this.range = 0;
        this.material = "Wood";
    }

    public Bow(double weight, String name, int damage, int arrowCount, int range, String material) {
        super(weight, name, damage);
        this.arrowCount = arrowCount;
        this.range = range;
        this.material = material;
    }

    @Override
    public void attack() {
        if (arrowCount > 0) {
            System.out.println("Arrow shot with" + this.getDamage() + " dmg");
            arrowCount--;
        } else {
            System.out.println("Out of arrows");
        }

    }

    @Override
    public void specialAbility() {
        System.out.println("Mega Arrow Shot");
    }

    public void reload() {
        this.setArrowCount(10);;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
