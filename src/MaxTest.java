import java.util.Arrays;
public class MaxTest {


        public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
            T max = a;
            if (b.compareTo(max) > 0) {
                max = b;
            }
            if (c.compareTo(max) > 0) {
                max = c;
            }
            return max;
        }

        public static void main(String[] args) {
            // Test Case 1: Max number at 1st position
            Integer a = 10, b = 5, c = 2;
            System.out.println("Max: " + testMaximum(a, b, c)); // expected output: 10

            // Test Case 2: Max number at 2nd position
            Integer d = 5, e = 10, f = 2;
            System.out.println("Max: " + testMaximum(d, e, f)); // expected output: 10

            // Test Case 3: Max number at 3rd position
            Integer g = 5, h = 2, i = 10;
            System.out.println("Max: " + testMaximum(g, h, i)); // expected output: 10

            // Test Case 4: Test with Floats
            Float j = 1.1f, k = 2.2f, l = 3.3f;
            System.out.println("Max: " + testMaximum(j, k, l)); // expected output: 3.3

            // Test Case 5: Test with Strings
            String m = "apple", n = "banana", o = "orange";
            System.out.println("Max: " + testMaximum(m, n, o)); // expected output: "orange"

            // Test Case 6: Test with different types using Generic Method
            Integer p = 20, q = 30, r = 40;
            System.out.println("Max: " + testMaximum(p, q, r)); // expected output: 40

            // Test Case 7: Test with a Generic Class
            MaxValue<Integer> maxVal = new MaxValue<>(50, 60, 70);
            System.out.println("Max: " + maxVal.getMax()); // expected output: 70

            // Test Case 8: Test with more than three parameters
            Integer[] array = {5, 10, 15, 20, 25};
            System.out.println("Max: " + testMaximum(array)); // expected output: 25
        }

        public static <T extends Comparable<T>> T testMaximum(T[] values) {
            Arrays.sort(values);
            T max = values[values.length - 1];
            System.out.println("Max: " + max);
            return max;
        }

        public static class MaxValue<T extends Comparable<T>> {
            private T a, b, c;

            public MaxValue(T a, T b, T c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public T getMax() {
                return testMaximum(a, b, c);
            }
        }

        public static <T extends Comparable<T>> void printMax(T max) {
            System.out.println("Max: " + max);
        }
    }


