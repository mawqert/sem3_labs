package lab2;

public abstract class Weapon {
    private int damage;
    private double weight;
    private String name;

    public Weapon() {
        this.damage = 0;
        this.weight = 0.0;
        this.name = "Unknown";
    }

    public Weapon(double weight, String name, int damage) {
        this.weight = weight;
        this.name = name;
        this.damage = damage;
    }

    public abstract void attack();
    public abstract void specialAbility();

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
