import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Task {
//
//    def mapReduce(zero : Int, op : (Int, Int) => Int, f : Int => Int, a : Int, b : Int): Int =
//            if (a > b) zero else mapReduce(op(zero, f(a)), op, f, a + 1, b)
//
//    def product(f : Int => Int, a : Int, b : Int): Int =
//    mapReduce(1, (x, y) => x * y, f, a, b)
//
//    def sum (f : Int => Int, a : Int, b : Int): Int =
//    mapReduce(0, (x, y) => x + y, f, a, b)
//
//    def sumInt(a : Int, b : Int) : Int =
//    sum(x => x, a, b)
//
//    def sumCube(a : Int, b : Int) =
//    sum(x => x * x * x, a, b)
//
//    def fact(n : Int): Int =
//    product(x => x, 1, n)
//
//    def sumFact(a : Int, b : Int) =
//    sum(fact, a, b)
//

    private static int mapReduce(int zero,
                          BiFunction<Integer, Integer, Integer> op,
                          Function<Integer, Integer> f,
                          int a,
                          int b) {
        while(a <= b) {
            zero = op.apply(zero, f.apply(a));
            ++a;
        }
        return zero;
    }

    private static int product(Function<Integer, Integer> f, int a, int b) {
        if (a > b) {
            return 1;
        } else {
            return a * product(f, a + 1, b);
        }
    }

    private static int sum(Function<Integer, Integer> f, int a, int b) {
        if (a > b) {
            return 0;
        } else {
            return a + sum(f, a + 1, b);
        }
    }

    public static int sumInts(int a, int b) {
        return sum(x -> x, a, b);
    }

    public static int fact(int n) {
        return product(x -> x, 1, n);
    }

    public static int sumCube(int a, int b) {
        return sum(x -> x * x * x, a, b);
    }

}