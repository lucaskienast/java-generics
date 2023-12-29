package exercises.oracle.ex12;

import java.util.Collection;

public class RelativelyPrimeCandidate implements UnaryPredicate<Integer> {

    private Collection<Integer> c;

    public RelativelyPrimeCandidate(Collection<Integer> c) {
        this.c = c;
    }

    @Override
    public boolean test(Integer x) {
        for (Integer i : c) {
            if (Algorithm.gcd(x, i) != 1)
                return false;
        }
        return !c.isEmpty();
    }
}
