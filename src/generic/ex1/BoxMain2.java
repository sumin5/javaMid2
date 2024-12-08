package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Ctrl + alt + n = 인라인  Object -> Integer 다운캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 다운 캐스팅
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달시 -> 클래스 캐스팅 예외 발생 (런타임)
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);

    }
}
