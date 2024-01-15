package exercises.ovgu.ex1;

public class Test {

    public static void main(String[] args) {
        // AnimalHouse<Animal> animalHouse = new AnimalHouse<Cat>();
        // Fails to compile. AnimalHouse<Cat> and AnimalHouse<Animal> are not compatible types, even though Cat is a subtype of Animal.

        // AnimalHouse<Cat> animalHouse = new AnimalHouse<Animal>();
        // Fails to compile. Same as 1a: AnimalHouse<Cat> and AnimalHouse<Animal> are not compatible types, even though Cat is a subtype of Animal.

        // AnimalHouse<?> animalHouse = new AnimalHouse<Cat>();
        // animalHouse.setAnimal(new Cat());
        // Fails to compile. While the first line is acceptable — it is OK to define an instance of unknown type — the compiler doesn't know the type of animal stored in house so the setAnimal method cannot be used.

        AnimalHouse animalHouse = new AnimalHouse();
        animalHouse.setAnimal(new Dog());
        // Compiles with a warning. The compiler doesn't know what type house contains. It will accept the code, but warn that there might be a problem when setting the animal to an instance of Dog.
    }

}
