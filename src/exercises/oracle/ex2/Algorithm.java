package exercises.oracle.ex2;


/*

Will the following class compile? If not, why?

 */

public class Algorithm {

    public static <T> T max(T x, T y) {
        // return x > y ? x : y;
        // No. The greater than (>) operator applies only to primitive numeric types.
        return null;
    }

}
