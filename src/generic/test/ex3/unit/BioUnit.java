package generic.test.ex3.unit;

public class BioUnit {
    private String name;
    private int hp;

    public BioUnit(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
