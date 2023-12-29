package zoo2.zoo;

public class Zoo {

    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage<>(new Monkey(), new Monkey());
        Monkey animal1 = monkeyCage.getAnimal1();

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal2(new Lion());

        // Cage<String> stringCage = new Cage<>();
        // stringCage.setAnimal2(new String());

    }

}
