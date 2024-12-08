package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.UnitUtil;

public class UnitUtilTest {

    public static void main(String[] args) {

        Marine m1 = new Marine(40,"마린1");
        Marine m2 = new Marine(50,"마린2");
        Marine resultMarine = UnitUtil.maxHP(m1,m2);

        System.out.println("resultMarine = " + resultMarine);

    }
}
