package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo(T t){
        System.out.println("이름 = " + t.getName() + " , HP = " + t.getHp());
    }

}
