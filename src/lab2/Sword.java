package lab2;

public class Sword extends Weapon{
    private int durability;
    private String bladeType;
    private double bladeLength;

    public Sword() {
        super();
        this.durability = 0;
        this.bladeLength = 0.0;
        this.bladeType = "Straight";
    }

    public Sword(double weight, String name, int damage, int durability, String bladeType, double bladeLength) {
        super(weight, name, damage);
        this.durability = durability;
        this.bladeType = bladeType;
        this.bladeLength = bladeLength;
    }

    @Override
    public void attack() {
        if (durability > 0.0) {
            System.out.println("Swinging a sword with " + this.getDamage() + " dmg");
            durability -= 5;
        } else {
            System.out.println("Sword is broken");
        }
    }

    @Override
    public void specialAbility() {
        System.out.println("Striking blow");
    }

    public void sharpen() {
        this.setDurability(50);
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }
}
