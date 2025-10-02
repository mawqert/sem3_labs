package lab2;

public class MagicWand extends Weapon {
    private static int wandCount = 0;

    private int mana;
    private String magicType;

    public MagicWand() {
        super();
        this.mana = 0;
        this.magicType = "Void";
        wandCount++;
    }

    public MagicWand(double weight, String name, int damage, int mana, String magicType) {
        super(weight, name, damage);
        this.mana = mana;
        this.magicType = magicType;
        wandCount++;
    }

    @Override
    public void attack() {
        if (mana > 0) {
            System.out.println("Casting " + this.getMagicType() + " spell with " + this.getDamage() + " dmg");
            mana -= 10;
        } else {
            System.out.println("Not enough mana");
        }
    }

    @Override
    public void specialAbility() {
        System.out.println("Global silence");
    }

    public void recharge() {
        this.setMana(100);
    }

    public static int getWandCount() {
        return wandCount;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getMagicType() {
        return magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }
}
