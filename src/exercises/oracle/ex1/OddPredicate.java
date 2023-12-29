package exercises.oracle.ex1;

public class OddPredicate implements UnaryPredicate<Integer> {
    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
}
