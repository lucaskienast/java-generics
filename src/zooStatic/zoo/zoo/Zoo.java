package zooStatic.zoo.zoo;

public class Zoo {

    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage<>(new Monkey(), new Monkey());

        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();
        boolean isCompatible = Cage.isCompatible(m1, m2);
        System.out.println(isCompatible);

    }

}
