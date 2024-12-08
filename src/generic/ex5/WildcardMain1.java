package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        catBox.set(new Cat("야옹이",100));
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }
}
