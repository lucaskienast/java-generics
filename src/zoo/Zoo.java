package zoo;

public class Zoo {

    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage<>();
        monkeyCage.setAnimal1(new Monkey());
        // cage.setAnimal2(new Lion());

        Cage<Lion> lionCage = new Cage<>();
        // lionCage.setAnimal1(new Monkey());
        lionCage.setAnimal2(new Lion());

        Cage<Monkey> monkeyCage2 = new Cage<>(new Monkey(), new Monkey());
        Cage<Lion> lionCage2 = new Cage<>(new Lion(), new Lion());
    }

}
